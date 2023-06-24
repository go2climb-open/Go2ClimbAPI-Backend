package com.go2climb.go2climbapi.application.tourists.resource;

import lombok.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTouristResource {
    private Long id;
    @NotBlank
    @NotNull
    private String name;
    @NotBlank
    @NotNull
    private String lastName;
    @NotBlank
    @NotNull
    private String email;
    @NotBlank
    @NotNull
    private String password;
    @NotNull
    private int phoneNumber;
    @NotBlank
    @NotNull
    private String address;
    @NotBlank
    @NotNull
    private String photo;
}
