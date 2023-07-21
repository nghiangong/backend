package com.example.backend0.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity @Data
@Table(name = "delayingMeetings")
public class DelayingMeeting extends Order{
    @OneToOne
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;
}
