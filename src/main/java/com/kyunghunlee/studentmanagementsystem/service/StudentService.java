package com.kyunghunlee.studentmanagementsystem.service;

import com.kyunghunlee.studentmanagementsystem.entity.Student;
import com.kyunghunlee.studentmanagementsystem.repository.StudentRepository;
import com.kyunghunlee.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;

  public List<Student> getAllStudent() {
    return studentRepository.findAll();
  }

  public Student saveStudent(Student student) {
    return studentRepository.save(student);
  }

  public Student findStudentById(Long id) {
    return studentRepository.findById(id).get();
  }

  public Student updateStudent(Student student) {
    return studentRepository.save(student);
  }

  public void deleteStudentById(Long id) {
    studentRepository.deleteById(id);
  }

  public List<Student> findStudentByGrade(String grade) {
    return studentRepository.findStudentByGrade(grade);
  }

  public List<Student> findStudentByNameContains(String keyword) {
    return studentRepository.findStudentByNameContains(keyword);
  }
}
