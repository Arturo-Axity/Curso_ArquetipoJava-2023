package com.axity.office.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoleDO is a Querydsl query type for RoleDO
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoleDO extends EntityPathBase<RoleDO> {

    private static final long serialVersionUID = -705615244L;

    public static final QRoleDO roleDO = new QRoleDO("roleDO");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final ListPath<UserDO, QUserDO> users = this.<UserDO, QUserDO>createList("users", UserDO.class, QUserDO.class, PathInits.DIRECT2);

    public QRoleDO(String variable) {
        super(RoleDO.class, forVariable(variable));
    }

    public QRoleDO(Path<? extends RoleDO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleDO(PathMetadata metadata) {
        super(RoleDO.class, metadata);
    }

}

