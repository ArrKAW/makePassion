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

    public final StringPath CUS_ADDR1 = createString("CUS_ADDR1");

    public final StringPath CUS_ADDR2 = createString("CUS_ADDR2");

    public final StringPath CUS_GRADE = createString("CUS_GRADE");

    public final StringPath CUS_ID = createString("CUS_ID");

    public final StringPath CUS_NAME = createString("CUS_NAME");

    public final NumberPath<java.math.BigInteger> CUS_NUM = createNumber("CUS_NUM", java.math.BigInteger.class);

    public final StringPath CUS_PASSWORD = createString("CUS_PASSWORD");

    public final StringPath CUS_PHONE = createString("CUS_PHONE");

    public final StringPath CUS_TEL = createString("CUS_TEL");

    public final StringPath USE_YN = createString("USE_YN");

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

