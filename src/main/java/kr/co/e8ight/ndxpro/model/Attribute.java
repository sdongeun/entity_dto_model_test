package kr.co.e8ight.ndxpro.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.util.List;

@Data
public class Attribute {

    private String type;

    private Object value;

    private Object md;

    private List<String> mdNames;

    @CreatedDate
    private LocalDate creDate;

    @LastModifiedDate
    private LocalDate modDate;

}
