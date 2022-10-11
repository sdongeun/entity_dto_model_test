package kr.co.e8ight.ndxpro.vo;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.util.List;

public class EntityVO {

    private EntityIdVO id;

    private List<String> attrNames;

    @CreatedDate
    private LocalDate creDate;

    @LastModifiedDate
    private LocalDate modDate;

    private String lastCorrelator;
}
