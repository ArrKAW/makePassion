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

    public final StringPath basicauth = createString("basicauth");

    public final StringPath bid = createString("bid");

    public final DateTimePath<java.util.Date> blastusetime = createDateTime("blastusetime", java.util.Date.class);

    public final StringPath bname = createString("bname");

    public final StringPath bposition = createString("bposition");

    public final StringPath bpwd = createString("bpwd");

    public final StringPath bseq = createString("bseq");

    public final StringPath btel = createString("btel");

    public final DateTimePath<java.util.Date> chgdate = createDateTime("chgdate", java.util.Date.class);

    public final StringPath chgid = createString("chgid");

    public final StringPath dept = createString("dept");

    public final DateTimePath<java.util.Date> regdate = createDateTime("regdate", java.util.Date.class);

    public final StringPath regid = createString("regid");

    public final StringPath useruseyn = createString("useruseyn");

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

