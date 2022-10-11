package kr.co.e8ight.ndxpro.dto;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

public class RelationshipDTO {

    private String type;

    private Object object; // List<String> or String

    @CreatedDate
    private LocalDate createdAt;

    @LastModifiedDate
    private LocalDate modifiedAt;
}
