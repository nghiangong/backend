package com.example.backend0.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity @Data
@Table(name = "reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private LocalDateTime deadline;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private LocalDateTime submitTime;

    @OneToMany(mappedBy = "report")
    private List<FileMetadata> files;

    @OneToOne
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;
}
