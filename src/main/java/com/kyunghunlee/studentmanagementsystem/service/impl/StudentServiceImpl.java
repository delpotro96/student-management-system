package com.kyunghunlee.studentmanagementsystem.service.impl;

import com.kyunghunlee.studentmanagementsystem.entity.Student;
import com.kyunghunlee.studentmanagementsystem.repository.StudentRepository;
import com.kyunghunlee.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

  private final StudentRepository studentRepository;

  @Override
  public List<Student> getAllStudent() {
    return studentRepository.findAll();
  }

  @Override
  public Student saveStudent(Student student) {
    return studentRepository.save(student);
  }

  @Override
  public Student getStudentById(Long id) {
    return studentRepository.findById(id).get();
  }

  @Override
  public Student updateStudent(Student student) {
    return studentRepository.save(student);
  }

  @Override
  public void deleteStudentById(Long id) {
    studentRepository.deleteById(id);
  }

  @Override
  public List<Student> getStudentByGrade(String grade) {
    return studentRepository.findStudentByGrade(grade);
  }
}
