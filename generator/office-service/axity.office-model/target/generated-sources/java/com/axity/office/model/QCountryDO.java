package com.axity.office.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCountryDO is a Querydsl query type for CountryDO
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCountryDO extends EntityPathBase<CountryDO> {

    private static final long serialVersionUID = -371023154L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCountryDO countryDO = new QCountryDO("countryDO");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final ListPath<OfficeDO, QOfficeDO> offices = this.<OfficeDO, QOfficeDO>createList("offices", OfficeDO.class, QOfficeDO.class, PathInits.DIRECT2);

    public final QTerritoryDO territory;

    public QCountryDO(String variable) {
        this(CountryDO.class, forVariable(variable), INITS);
    }

    public QCountryDO(Path<? extends CountryDO> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCountryDO(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCountryDO(PathMetadata metadata, PathInits inits) {
        this(CountryDO.class, metadata, inits);
    }

    public QCountryDO(Class<? extends CountryDO> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.territory = inits.isInitialized("territory") ? new QTerritoryDO(forProperty("territory")) : null;
    }

}

