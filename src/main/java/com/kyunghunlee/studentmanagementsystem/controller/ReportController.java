package com.kyunghunlee.studentmanagementsystem.controller;

import com.kyunghunlee.studentmanagementsystem.entity.Report;
import com.kyunghunlee.studentmanagementsystem.service.ReportService;
import com.kyunghunlee.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ReportController {

  private final ReportService reportService;
  private final StudentService studentService;

  @GetMapping("/students/report/{student_id}")
  public String showReport(@PathVariable Long student_id, Model model) {

    model.addAttribute("report", reportService.findByStudentId(student_id));
    model.addAttribute("student", studentService.getStudentById(student_id));
    System.out.println(reportService.findByStudentId(student_id));
    return "report_menu";
  }

  @GetMapping("/students/report/edit/{student_id}")
  public String editGradeForm(@PathVariable Long student_id, Model model) {

    model.addAttribute("report", reportService.findByStudentId(student_id));
    model.addAttribute("student", studentService.getStudentById(student_id));
    System.out.println(reportService.findByStudentId(student_id));
    return "report_edit";
  }

  @PostMapping("/students/report/{student_id}")
  public void editGrade(@PathVariable Long student_id) {}
}
