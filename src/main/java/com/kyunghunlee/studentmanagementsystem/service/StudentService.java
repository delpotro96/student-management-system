package com.kyunghunlee.studentmanagementsystem.service;

import com.kyunghunlee.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
  List<Student> getAllStudent();

  Student saveStudent(Student student);

  Student findStudentById(Long id);

  Student updateStudent(Student student);

  void deleteStudentById(Long id);

  List<Student> findStudentByGrade(String grade);

  List<Student> findStudentByNameContains(String keyword);
}
