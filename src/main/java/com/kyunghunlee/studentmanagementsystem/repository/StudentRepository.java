package com.kyunghunlee.studentmanagementsystem.repository;

import com.kyunghunlee.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentByGrade(String grade);
}
