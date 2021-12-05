package com.kyunghunlee.studentmanagementsystem;

import com.kyunghunlee.studentmanagementsystem.entity.Student;
import com.kyunghunlee.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

  @Autowired private StudentRepository studentRepository;

  public static void main(String[] args) {
    SpringApplication.run(StudentManagementSystemApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    //        Student student1 = new Student("Kyunghun", "Lee", "freeone1224@gmail.com");
    //        studentRepository.save(student1);
    //
    //        Student student2 = new Student("Sangmin", "Park", "hackermin96@gmail.com");
    //        studentRepository.save(student2);
    //
    //        Student student3 = new Student("Joohyun", "Kim", "jooyunii96@gmail.com");
    //        studentRepository.save(student3);
  }
}
