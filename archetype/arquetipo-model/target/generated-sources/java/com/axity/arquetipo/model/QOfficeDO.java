package com.axity.arquetipo.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOfficeDO is a Querydsl query type for OfficeDO
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOfficeDO extends EntityPathBase<OfficeDO> {

    private static final long serialVersionUID = -355415142L;

    public static final QOfficeDO officeDO = new QOfficeDO("officeDO");

    public final StringPath addressLine1 = createString("addressLine1");

    public final StringPath addressLine2 = createString("addressLine2");

    public final StringPath city = createString("city");

    public final StringPath country = createString("country");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath phone = createString("phone");

    public final StringPath postalCode = createString("postalCode");

    public final StringPath state = createString("state");

    public final StringPath territory = createString("territory");

    public QOfficeDO(String variable) {
        super(OfficeDO.class, forVariable(variable));
    }

    public QOfficeDO(Path<? extends OfficeDO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOfficeDO(PathMetadata metadata) {
        super(OfficeDO.class, metadata);
    }

}

