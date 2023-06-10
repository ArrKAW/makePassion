package com.project.littleBank.sample.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTestExample is a Querydsl query type for TestExample
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTestExample extends EntityPathBase<TestExample> {

    private static final long serialVersionUID = -447160854L;

    public static final QTestExample testExample = new QTestExample("testExample");

    public final StringPath content = createString("content");

    public final StringPath id = createString("id");

    public final NumberPath<Integer> num = createNumber("num", Integer.class);

    public QTestExample(String variable) {
        super(TestExample.class, forVariable(variable));
    }

    public QTestExample(Path<? extends TestExample> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTestExample(PathMetadata metadata) {
        super(TestExample.class, metadata);
    }

}

