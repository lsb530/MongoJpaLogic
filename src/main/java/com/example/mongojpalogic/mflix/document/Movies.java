package com.example.mongojpalogic.mflix.document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document
public class Movies implements Persistable<ObjectId> {

    @Id
    private ObjectId id;

    private String plot;

    private List<String> genres;

    private Integer runtime;

    private List<String> cast;

    private Integer numMflixComments;

    private String poster;

    private String title;

    private String fullPlot;

    private List<String> languages;

    private Date released;

    private List<String> directors;

    private List<String> writers;

    private Awards awards;

    private LocalDateTime lastUpdated;

    private Integer year;

    private Imdb imdb;

    private List<String> countries;

    private String type;

    private Tomatoes tomatoes;
    @Getter
    public static class Awards {
        private Integer wins;
        private Integer nominations;
        private String text;
    }

    @Getter
    public static class Imdb {
        private Double rating;
        private Integer votes;
        private Integer id;
    }

    @Getter
    public static class Tomatoes {

        private Viewer viewer;

        private Date lastUpdated;

        @Getter
        public static class Viewer {
            private Double rating;
            private Integer numReviews;
            private Integer meter;
        }
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
