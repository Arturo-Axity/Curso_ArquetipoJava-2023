package com.axity.office.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserDO is a Querydsl query type for UserDO
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserDO extends EntityPathBase<UserDO> {

    private static final long serialVersionUID = -616229751L;

    public static final QUserDO userDO = new QUserDO("userDO");

    public final StringPath email = createString("email");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath lastName = createString("lastName");

    public final StringPath name = createString("name");

    public final ListPath<RoleDO, QRoleDO> roles = this.<RoleDO, QRoleDO>createList("roles", RoleDO.class, QRoleDO.class, PathInits.DIRECT2);

    public final StringPath username = createString("username");

    public QUserDO(String variable) {
        super(UserDO.class, forVariable(variable));
    }

    public QUserDO(Path<? extends UserDO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserDO(PathMetadata metadata) {
        super(UserDO.class, metadata);
    }

}

