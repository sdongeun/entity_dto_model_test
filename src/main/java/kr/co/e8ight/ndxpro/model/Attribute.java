package kr.co.e8ight.ndxpro.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

public class Attribute {

    private String type;

    private Object value;

    @CreatedDate
    private LocalDate creDate;

    @LastModifiedDate
    private LocalDate modDate;

}
