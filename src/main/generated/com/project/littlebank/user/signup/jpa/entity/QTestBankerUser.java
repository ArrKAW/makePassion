package com.project.littleBank.user.signup.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTestBankerUser is a Querydsl query type for TestBankerUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTestBankerUser extends EntityPathBase<TestBankerUser> {

    private static final long serialVersionUID = -1440816879L;

    public static final QTestBankerUser testBankerUser = new QTestBankerUser("testBankerUser");

    public final StringPath cusAddr1 = createString("cusAddr1");

    public final StringPath cusAddr2 = createString("cusAddr2");

    public final StringPath cusGrade = createString("cusGrade");

    public final StringPath cusId = createString("cusId");

    public final StringPath cusName = createString("cusName");

    public final NumberPath<java.math.BigInteger> cusNum = createNumber("cusNum", java.math.BigInteger.class);

    public final StringPath cusPassword = createString("cusPassword");

    public final StringPath cusPhone = createString("cusPhone");

    public final StringPath cusTel = createString("cusTel");

    public final StringPath useYn = createString("useYn");

    public QTestBankerUser(String variable) {
        super(TestBankerUser.class, forVariable(variable));
    }

    public QTestBankerUser(Path<? extends TestBankerUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTestBankerUser(PathMetadata metadata) {
        super(TestBankerUser.class, metadata);
    }

}

