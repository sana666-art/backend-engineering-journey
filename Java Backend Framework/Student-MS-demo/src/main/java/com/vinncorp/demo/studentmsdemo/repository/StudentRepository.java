package com.vinncorp.demo.studentmsdemo.repository;

import com.vinncorp.demo.studentmsdemo.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}