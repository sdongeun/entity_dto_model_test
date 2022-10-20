package kr.co.e8ight.ndxpro.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Data
@Document(collection="entities")
public class Entity {

    @Id
    private EntityId id;

    private List<String> attrNames;

    private HashMap<String, Attribute> attrs;

    @CreatedDate
    private LocalDate creDate;

    @LastModifiedDate
    private LocalDate modDate;

    private String lastCorrelator;
}
