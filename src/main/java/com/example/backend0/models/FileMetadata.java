package com.example.backend0.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
@Table(name = "file_metadatas")
public class FileMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_path")
    private String filePath;

    @ManyToOne
    @JoinColumn(name = "report_id")
    private Report report;
}