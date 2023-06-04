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

    public final StringPath b_id = createString("b_id");

    public final DateTimePath<java.util.Date> b_last_use_time = createDateTime("b_last_use_time", java.util.Date.class);

    public final StringPath b_name = createString("b_name");

    public final StringPath b_position = createString("b_position");

    public final StringPath b_pwd = createString("b_pwd");

    public final StringPath b_seq = createString("b_seq");

    public final StringPath b_tel = createString("b_tel");

    public final StringPath basic_auth = createString("basic_auth");

    public final DateTimePath<java.util.Date> chg_date = createDateTime("chg_date", java.util.Date.class);

    public final StringPath chg_id = createString("chg_id");

    public final StringPath dept = createString("dept");

    public final DateTimePath<java.util.Date> reg_date = createDateTime("reg_date", java.util.Date.class);

    public final StringPath reg_id = createString("reg_id");

    public final StringPath user_use_yn = createString("user_use_yn");

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

