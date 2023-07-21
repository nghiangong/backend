package com.example.backend0.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.Duration;
import java.time.LocalTime;

@Entity
@Table(name = "makingAppointments")
public class MakingAppointment extends Order{
    @ManyToOne
    @JoinColumn(name = "freetime_id")
    private FreeTime freetime;

    private LocalTime startTime;

    private Duration duration;
}
