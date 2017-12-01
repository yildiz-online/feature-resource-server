/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2017 Grégory Van den Borre
 *
 *  More infos available: https://www.yildiz-games.be
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without
 *  limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 *  of the Software, and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 */

package be.yildizgames.engine.feature.resource.persistence;

import be.yildiz.common.id.EntityId;
import be.yildiz.module.database.data.PersistentData;
import be.yildizgames.engine.feature.resource.ResourceOwner;
import be.yildizgames.engine.feature.resource.ResourceOwnerProvider;
import be.yildizgames.engine.feature.resource.ResourceValue;
import be.yildizgames.engine.feature.resource.ResourcesProducer;
import be.yildizgames.engine.feature.resource.generated.database.tables.Resources;
import be.yildizgames.engine.feature.resource.generated.database.tables.records.ResourcesRecord;
import org.jooq.DSLContext;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.Timestamp;
import java.util.Optional;

/**
 * Persistent data for the game resources.
 *
 * @author Grégory Van den Borre
 */
public final class PersistentResources implements PersistentData<ResourcesProducer, ResourcesProducer, ResourcesProducer> {

    /**
     * Database table containing the data.
     */
    private static final Resources table = Resources.RESOURCES;

    /**
     * Full constructor.
     *
     * @param c SQL connection.
     * @param ownerProvider Entity manager.
     */
    public PersistentResources(Connection c, final ResourceOwnerProvider ownerProvider) {
        super();
        // FIXME game related
        //Create an object ResourceModel injected in the engine at construction
        //this object contains the different fields for the resource
        //this object will be responsible to instantiate new ResourceValue
        //the database will have columns name res_0, res_1... instead of game related values.
        try (DSLContext create = this.getDSL(c)) {
            Optional.ofNullable(create.selectFrom(table).fetch())
                    .ifPresent(data -> data.forEach(r -> {
                        EntityId cityId = EntityId.valueOf(r.getValue(table.CIT_ID).longValue());
                        ResourceOwner owner = ownerProvider.getOwnerById(cityId);
                        long time = r.getValue(table.LAST_TIME_COMPUTED).getTime();
                        float[] values = new float[5];
                        values[0] = r.getMetal().floatValue();
                        values[1] = r.getEnergy().floatValue();
                        values[2] = r.getMoney().floatValue();
                        values[3] = r.getResearch().floatValue();
                        values[4] = r.getInhabitant().floatValue();
                        owner.getProducer().setNewValues(time, new ResourceValue(values));
                    }));
        }
    }

    @Override
    public ResourcesProducer save(final ResourcesProducer data, Connection c) {
        try (DSLContext create = this.getDSL(c)) {
            create.insertInto(
                    table,
                    Resources.RESOURCES.CIT_ID,
                    Resources.RESOURCES.LAST_TIME_COMPUTED,
                    Resources.RESOURCES.METAL,
                    Resources.RESOURCES.ENERGY,
                    Resources.RESOURCES.MONEY,
                    Resources.RESOURCES.RESEARCH,
                    Resources.RESOURCES.INHABITANT)
                    .values(
                            (int) data.getCity().value,
                            new Timestamp(data.getLastUpdate()),
                            (double)data.getResource(0),
                            (double)data.getResource(1),
                            (double)data.getResource(2),
                            (double)data.getResource(3),
                            (double)data.getResource(4)).execute();
        return data;
        }
    }

    @Override
    public void update(ResourcesProducer data, Connection c) {
        try (DSLContext create = this.getDSL(c)) {
            ResourcesRecord resources = create.fetchOne(table, table.CIT_ID.equal((int)data.getCity().value));
            resources.setMetal((double)data.getResource(0));
            resources.setEnergy((double)data.getResource(1));
            resources.setMoney((double)data.getResource(2));
            resources.setResearch((double)data.getResource(3));
            resources.setInhabitant((double)data.getResource(4));
            create.executeUpdate(resources);
        }
    }

    private DSLContext getDSL(Connection c) {
        Settings settings = new Settings();
        settings.setExecuteLogging(false);
        return DSL.using(c, settings);
    }
}
