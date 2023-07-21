package com.example.backend0.repository;

import com.example.backend0.models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
