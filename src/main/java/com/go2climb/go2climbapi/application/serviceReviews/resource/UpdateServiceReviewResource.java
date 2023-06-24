package com.go2climb.go2climbapi.application.serviceReviews.resource;

import lombok.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UpdateServiceReviewResource {
    private Long id;
    @NotNull
    @NotBlank
    private String comment;

    @NotNull
    @NotBlank
    private String date;

    @NotNull
    private float score;
}
