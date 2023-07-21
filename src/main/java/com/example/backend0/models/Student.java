package com.example.backend0.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity @Data
@Table(name = "students")
public class Student extends User{
    @ManyToMany(mappedBy = "students")
    private List<Group> groups;

    @OneToMany(mappedBy = "student")
    private List<Order> orders;
}
