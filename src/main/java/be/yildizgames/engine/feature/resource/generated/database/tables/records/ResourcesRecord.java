/*
 * This file is generated by jOOQ.
*/
package be.yildizgames.engine.feature.resource.generated.database.tables.records;


import be.yildizgames.engine.feature.resource.generated.database.tables.Resources;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

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
public class ResourcesRecord extends UpdatableRecordImpl<ResourcesRecord> implements Record8<Integer, Integer, Timestamp, Double, Double, Double, Double, Double> {

    private static final long serialVersionUID = 1445392393;

    /**
     * Setter for <code>PUBLIC.RESOURCES.RES_ID</code>.
     */
    public void setResId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.RESOURCES.RES_ID</code>.
     */
    public Integer getResId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.RESOURCES.CIT_ID</code>.
     */
    public void setCitId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.RESOURCES.CIT_ID</code>.
     */
    public Integer getCitId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>PUBLIC.RESOURCES.LAST_TIME_COMPUTED</code>.
     */
    public void setLastTimeComputed(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.RESOURCES.LAST_TIME_COMPUTED</code>.
     */
    public Timestamp getLastTimeComputed() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>PUBLIC.RESOURCES.METAL</code>.
     */
    public void setMetal(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.RESOURCES.METAL</code>.
     */
    public Double getMetal() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>PUBLIC.RESOURCES.ENERGY</code>.
     */
    public void setEnergy(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.RESOURCES.ENERGY</code>.
     */
    public Double getEnergy() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>PUBLIC.RESOURCES.MONEY</code>.
     */
    public void setMoney(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.RESOURCES.MONEY</code>.
     */
    public Double getMoney() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>PUBLIC.RESOURCES.RESEARCH</code>.
     */
    public void setResearch(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.RESOURCES.RESEARCH</code>.
     */
    public Double getResearch() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>PUBLIC.RESOURCES.INHABITANT</code>.
     */
    public void setInhabitant(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.RESOURCES.INHABITANT</code>.
     */
    public Double getInhabitant() {
        return (Double) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Timestamp, Double, Double, Double, Double, Double> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Timestamp, Double, Double, Double, Double, Double> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Resources.RESOURCES.RES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Resources.RESOURCES.CIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Resources.RESOURCES.LAST_TIME_COMPUTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Resources.RESOURCES.METAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Resources.RESOURCES.ENERGY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return Resources.RESOURCES.MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return Resources.RESOURCES.RESEARCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return Resources.RESOURCES.INHABITANT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getResId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getLastTimeComputed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getMetal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getEnergy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getResearch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getInhabitant();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getResId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getLastTimeComputed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getMetal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getEnergy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getResearch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getInhabitant();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value1(Integer value) {
        setResId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value2(Integer value) {
        setCitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value3(Timestamp value) {
        setLastTimeComputed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value4(Double value) {
        setMetal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value5(Double value) {
        setEnergy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value6(Double value) {
        setMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value7(Double value) {
        setResearch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value8(Double value) {
        setInhabitant(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord values(Integer value1, Integer value2, Timestamp value3, Double value4, Double value5, Double value6, Double value7, Double value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResourcesRecord
     */
    public ResourcesRecord() {
        super(Resources.RESOURCES);
    }

    /**
     * Create a detached, initialised ResourcesRecord
     */
    public ResourcesRecord(Integer resId, Integer citId, Timestamp lastTimeComputed, Double metal, Double energy, Double money, Double research, Double inhabitant) {
        super(Resources.RESOURCES);

        set(0, resId);
        set(1, citId);
        set(2, lastTimeComputed);
        set(3, metal);
        set(4, energy);
        set(5, money);
        set(6, research);
        set(7, inhabitant);
    }
}
