package kr.co.e8ight.ndxpro.dto;

import org.springframework.data.mongodb.core.geo.GeoJson;

import java.util.HashMap;

public class GeoPropertyDTO extends HashMap<String, Object> {

    private String type;

    private GeoJson value;

    private String observedAt;
}
