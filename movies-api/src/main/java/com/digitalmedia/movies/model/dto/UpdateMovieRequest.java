package com.digitalmedia.movies.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UpdateMovieRequest {

    @Schema(example = "Grand Budapest Hotel")
    private String title;

    @Schema(example = "Wes Anderson", description = "Movie's director")
    private String director;

    @Schema(example = "2014", description = "Movie's year")
    private String year;

    @Schema(example = "https://i.pinimg.com/736x/08/ac/36/08ac36fa902a4bfe1881ca2263205665--princess-hotel-hotel-budapest.jpg")
    private String poster;
}