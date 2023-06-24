package com.go2climb.go2climbapi.application.serviceReviews.domain.model.entity;

import com.go2climb.go2climbapi.application.tourists.domain.model.entity.Tourist;
import com.go2climb.go2climbapi.application.services.domain.model.entity.Service;
import lombok.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service_reviews")
public class ServiceReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String date;

    @NotNull
    @NotBlank
    private String comment;

    @NotNull
    private float score;

    //Relationships
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tourist_id", nullable = false)
    private Tourist tourist;
}
