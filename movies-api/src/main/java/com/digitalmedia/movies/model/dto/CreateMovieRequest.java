package com.digitalmedia.movies.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreateMovieRequest {

    @Schema(example = "tt2278388")
    @NotBlank
    private String imdbId;

    @Schema(example = "Grand Budapest Hotel")
    @NotBlank
    private String title;

    @Schema(example = "Wes Anderson", description = "Movie's director")
    @NotBlank
    private String director;

    @Schema(example = "2014", description = "Movie's year")
    @NotBlank
    private String year;

    @Schema(example = "https://www.lahiguera.net/cinemania/pelicula/6524/el_gran_hotel_budapest-cartel-5391.jpg")
    private String poster;
}