package com.axity.office.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTerritoryDO is a Querydsl query type for TerritoryDO
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTerritoryDO extends EntityPathBase<TerritoryDO> {

    private static final long serialVersionUID = -203699438L;

    public static final QTerritoryDO territoryDO = new QTerritoryDO("territoryDO");

    public final ListPath<CountryDO, QCountryDO> countries = this.<CountryDO, QCountryDO>createList("countries", CountryDO.class, QCountryDO.class, PathInits.DIRECT2);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QTerritoryDO(String variable) {
        super(TerritoryDO.class, forVariable(variable));
    }

    public QTerritoryDO(Path<? extends TerritoryDO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTerritoryDO(PathMetadata metadata) {
        super(TerritoryDO.class, metadata);
    }

}

