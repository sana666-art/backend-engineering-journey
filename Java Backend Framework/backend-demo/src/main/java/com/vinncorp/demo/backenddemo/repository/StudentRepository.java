package com.vinncorp.demo.backenddemo.repository;

import com.vinncorp.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}