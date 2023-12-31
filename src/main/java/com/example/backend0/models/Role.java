package com.example.backend0.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity @Table(name = "roles")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERole name;
}