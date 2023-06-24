package com.go2climb.go2climbapi.application.services.resource;

import lombok.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UpdateServiceResource {
    private Long id;
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String description;
    @NotNull
    @NotBlank
    private String location;
    @NotNull
    private int score;
    @NotNull
    private float price;
    @NotNull
    private float newPrice;
    @NotNull
    @NotBlank
    private String creationDate;
    @NotNull
    @NotBlank
    private String photos;
    @NotNull
    private int isOffer;
    @NotNull
    private int isPopular;
}
