package kr.co.e8ight.ndxpro.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class EntityId {

    @Field("id")
    private String id;

    private String type;

    private String servicePath;
}
