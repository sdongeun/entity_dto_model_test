package kr.co.e8ight.ndxpro.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.geo.GeoJson;

import java.util.HashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value = { "createdAt", "modifiedAt", "creDate", "modDate", "md", "mdNames" })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeoPropertyDTO extends HashMap<String, Object> {

    private String type;

    private GeoJson value;

    private String observedAt;

}
