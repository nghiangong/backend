package com.example.backend0.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalTime;

@Entity @Data
@Table(name = "freetimes")
public class FreeTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    @NotBlank
    private LocalTime openTime;

    @NotBlank
    private LocalTime closeTime;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;
}
