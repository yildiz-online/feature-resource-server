/*
 * This file is generated by jOOQ.
*/
package be.yildizgames.engine.feature.resource.generated.database.tables;


import be.yildizgames.engine.feature.resource.generated.database.Indexes;
import be.yildizgames.engine.feature.resource.generated.database.Keys;
import be.yildizgames.engine.feature.resource.generated.database.Public;
import be.yildizgames.engine.feature.resource.generated.database.tables.records.ResourcesRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Resources extends TableImpl<ResourcesRecord> {

    private static final long serialVersionUID = -97909325;

    /**
     * The reference instance of <code>PUBLIC.RESOURCES</code>
     */
    public static final Resources RESOURCES = new Resources();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResourcesRecord> getRecordType() {
        return ResourcesRecord.class;
    }

    /**
     * The column <code>PUBLIC.RESOURCES.RES_ID</code>.
     */
    public final TableField<ResourcesRecord, Integer> RES_ID = createField("RES_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.RESOURCES.CIT_ID</code>.
     */
    public final TableField<ResourcesRecord, Integer> CIT_ID = createField("CIT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.RESOURCES.LAST_TIME_COMPUTED</code>.
     */
    public final TableField<ResourcesRecord, Timestamp> LAST_TIME_COMPUTED = createField("LAST_TIME_COMPUTED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>PUBLIC.RESOURCES.METAL</code>.
     */
    public final TableField<ResourcesRecord, Double> METAL = createField("METAL", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>PUBLIC.RESOURCES.ENERGY</code>.
     */
    public final TableField<ResourcesRecord, Double> ENERGY = createField("ENERGY", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>PUBLIC.RESOURCES.MONEY</code>.
     */
    public final TableField<ResourcesRecord, Double> MONEY = createField("MONEY", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>PUBLIC.RESOURCES.RESEARCH</code>.
     */
    public final TableField<ResourcesRecord, Double> RESEARCH = createField("RESEARCH", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>PUBLIC.RESOURCES.INHABITANT</code>.
     */
    public final TableField<ResourcesRecord, Double> INHABITANT = createField("INHABITANT", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>PUBLIC.RESOURCES</code> table reference
     */
    public Resources() {
        this(DSL.name("RESOURCES"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.RESOURCES</code> table reference
     */
    public Resources(String alias) {
        this(DSL.name(alias), RESOURCES);
    }

    /**
     * Create an aliased <code>PUBLIC.RESOURCES</code> table reference
     */
    public Resources(Name alias) {
        this(alias, RESOURCES);
    }

    private Resources(Name alias, Table<ResourcesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Resources(Name alias, Table<ResourcesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ResourcesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESOURCES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ResourcesRecord> getPrimaryKey() {
        return Keys.PK_RESOURCES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResourcesRecord>> getKeys() {
        return Arrays.<UniqueKey<ResourcesRecord>>asList(Keys.PK_RESOURCES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Resources as(String alias) {
        return new Resources(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Resources as(Name alias) {
        return new Resources(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Resources rename(String name) {
        return new Resources(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Resources rename(Name name) {
        return new Resources(name, null);
    }
}