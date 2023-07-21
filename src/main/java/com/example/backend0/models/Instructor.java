package com.example.backend0.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity @Data
@Table(name = "instructors")
public class Instructor extends User{
    @OneToMany(mappedBy = "instructor")
    private List<Group> groups;

    @OneToMany(mappedBy = "instructor")
    private List<FreeTime> freeTimes;
}
