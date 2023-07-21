package com.example.backend0.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity @Data
@Table(name = "confirming")
public class Confirming {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int isAgreed;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
