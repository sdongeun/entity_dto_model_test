package kr.co.e8ight.ndxpro.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class EntityId {

    @Field("id")
    private String id;

    private String type;

    private String servicePath;
}
