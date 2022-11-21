package com.digitalmedia.movies.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class AddCommentRequest {

    @Schema(example = "Great Movie!")
    @NotBlank
    private String text;
}
