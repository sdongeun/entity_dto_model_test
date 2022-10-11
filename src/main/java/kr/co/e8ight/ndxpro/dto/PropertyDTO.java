package kr.co.e8ight.ndxpro.dto;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.util.HashMap;

public class PropertyDTO extends HashMap<String, Object> {

    private String type;

    private Object value;

    private String observedAt;

    private String unitCode;

    @CreatedDate
    private LocalDate createdAt;

    @LastModifiedDate
    private LocalDate modifiedAt;
}
