package com.project.littlebank.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBanker is a Querydsl query type for Banker
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBanker extends EntityPathBase<Banker> {

    private static final long serialVersionUID = -1224513094L;

    public static final QBanker banker = new QBanker("banker");

    public final StringPath bankerDept = createString("bankerDept");

    public final StringPath bankerId = createString("bankerId");

    public final DateTimePath<java.util.Date> bankerLastUseTime = createDateTime("bankerLastUseTime", java.util.Date.class);

    public final StringPath bankerName = createString("bankerName");

    public final StringPath bankerPosition = createString("bankerPosition");

    public final StringPath bankerPwd = createString("bankerPwd");

    public final StringPath bankerSeq = createString("bankerSeq");

    public final StringPath bankerTel = createString("bankerTel");

    public final StringPath basicAuth = createString("basicAuth");

    public final DateTimePath<java.util.Date> changeDate = createDateTime("changeDate", java.util.Date.class);

    public final StringPath changeId = createString("changeId");

    public final DateTimePath<java.util.Date> registerDate = createDateTime("registerDate", java.util.Date.class);

    public final StringPath registerId = createString("registerId");

    public final StringPath userUseYn = createString("userUseYn");

    public QBanker(String variable) {
        super(Banker.class, forVariable(variable));
    }

    public QBanker(Path<? extends Banker> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBanker(PathMetadata metadata) {
        super(Banker.class, metadata);
    }

}

