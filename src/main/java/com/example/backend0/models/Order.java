package com.example.backend0.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity @Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @NotBlank
    private LocalDateTime datetime;

    private int isAccepted;

    @OneToMany(mappedBy = "order")
    private List<Confirming> confirmings;
}
