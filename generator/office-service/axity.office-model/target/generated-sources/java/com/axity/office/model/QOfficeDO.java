package com.axity.office.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOfficeDO is a Querydsl query type for OfficeDO
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOfficeDO extends EntityPathBase<OfficeDO> {

    private static final long serialVersionUID = 10387066L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOfficeDO officeDO = new QOfficeDO("officeDO");

    public final StringPath addressLine1 = createString("addressLine1");

    public final StringPath addressLine2 = createString("addressLine2");

    public final StringPath city = createString("city");

    public final QCountryDO country;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath phone = createString("phone");

    public final StringPath postalCode = createString("postalCode");

    public final StringPath state = createString("state");

    public QOfficeDO(String variable) {
        this(OfficeDO.class, forVariable(variable), INITS);
    }

    public QOfficeDO(Path<? extends OfficeDO> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOfficeDO(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOfficeDO(PathMetadata metadata, PathInits inits) {
        this(OfficeDO.class, metadata, inits);
    }

    public QOfficeDO(Class<? extends OfficeDO> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.country = inits.isInitialized("country") ? new QCountryDO(forProperty("country"), inits.get("country")) : null;
    }

}

