module be.yildizgames.feature.resource.server {

    requires java.annotation;

    requires be.yildizgames.feature.resource.shared;
    requires be.yildizgames.module.database;
    requires be.yildizgames.common.model;

    requires org.jooq;
    requires java.sql;

    exports be.yildizgames.engine.feature.resource.persistence;
}
