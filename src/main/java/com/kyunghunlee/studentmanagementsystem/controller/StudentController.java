package com.kyunghunlee.studentmanagementsystem.controller;

import com.kyunghunlee.studentmanagementsystem.entity.Student;
import com.kyunghunlee.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class StudentController {

  private final StudentService studentService;

  @GetMapping("/students")
  public String listStudent(Model model) {
    model.addAttribute("students", studentService.getAllStudent());
    return "students";
  }

  /*
   *  grade로 학생 조회
   * */
  @GetMapping("/students/{grade}")
  public String listStudentByGrade(Model model, @PathVariable String grade) {
    model.addAttribute("students", studentService.getStudentByGrade(grade));
    System.out.println(studentService.getStudentByGrade(grade));
    System.out.println(grade);
    return "studentsByGrade";
  }

  @GetMapping("/students/new")
  public String createStudentForm(Model model) {

    // create student object to hold student form data
    Student student = new Student();
    model.addAttribute("student", student);
    return "create_student";
  }

  @PostMapping("/students")
  public String saveStudent(@Valid @ModelAttribute("student") Student student) {
    studentService.saveStudent(student);
    return "redirect:/students";
  }

  @GetMapping("/students/edit/{id}")
  public String editStudentForm(@PathVariable Long id, Model model) {
    model.addAttribute("student", studentService.getStudentById(id));
    System.out.println(id);
    return "edit_student";
  }

  @PostMapping("/students/{id}")
  public String updateStudent(
      @PathVariable Long id, @ModelAttribute("student") Student student, Model model) {

    // get student from database by id
    Student existingStudent = studentService.getStudentById(id);
    existingStudent.setName(student.getName());
    existingStudent.setGrade(student.getGrade());
    existingStudent.setContact(student.getContact());

    // save updated student object
    studentService.updateStudent(existingStudent);
    return "redirect:/students";
  }

  // handler method to handle delete student request
  @GetMapping("/students/delete/{id}")
  public String deleteStudent(@PathVariable Long id) {
    studentService.deleteStudentById(id);
    return "redirect:/students";
  }

  @GetMapping("/students/menu/{id}")
  public String menuStudent(@PathVariable Long id, Model model) {
    model.addAttribute("student", studentService.getStudentById(id));
    return "menu_student";
  }
}
