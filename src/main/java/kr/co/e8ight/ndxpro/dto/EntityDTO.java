package kr.co.e8ight.ndxpro.dto;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.util.HashMap;

public class EntityDTO extends HashMap<String, Object> {

    private String id;

    private String type;

    @CreatedDate
    private LocalDate createdAt;

    @LastModifiedDate
    private LocalDate modifiedAt;
}
