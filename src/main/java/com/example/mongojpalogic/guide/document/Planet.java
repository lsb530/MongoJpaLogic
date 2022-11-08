package com.example.mongojpalogic.guide.document;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document
public class Planet {

    @Id
    private ObjectId id;
    private String name;
    private Integer orderFromSun;
    private Boolean hasRings;
    private List<String> mainAtmosphere;
    private SurfaceTemperatureC surfaceTemperatureC;

    @Getter
    @Setter
    @ToString
    public static class SurfaceTemperatureC {
        private Double min;
        private Double max;
        private Double mean;
    }
}
