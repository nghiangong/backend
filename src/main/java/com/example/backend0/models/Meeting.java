package com.example.backend0.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity @Data
@Table(name = "meeting")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private LocalDate date;

    @NotBlank
    private LocalTime startTime;

    @NotBlank
    private LocalTime endTime;

    private String address;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EMeetingStatus status;

    @Size(max = 200)
    private String request;

    @Size(max = 200)
    private String comment;

    @OneToOne(mappedBy = "meeting")
    private Report report;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
}
