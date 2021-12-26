package com.kyunghunlee.studentmanagementsystem.controller;

import com.kyunghunlee.studentmanagementsystem.entity.Report;
import com.kyunghunlee.studentmanagementsystem.service.ReportService;
import com.kyunghunlee.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ReportController {

  private final ReportService reportService;
  private final StudentService studentService;

  @GetMapping("/students/report/{student_id}")
  public String showReport(@PathVariable Long student_id, Model model) {

    model.addAttribute("report", reportService.findByStudentId(student_id));
    model.addAttribute("student", studentService.findStudentById(student_id));
    return "report_menu";
  }

  @GetMapping("/students/report/edit/{student_id}")
  public String saveReportForm(@PathVariable Long student_id, Model model) {

    model.addAttribute("report", reportService.findByStudentId(student_id));
    model.addAttribute("student", studentService.findStudentById(student_id));
    return "report_save";
  }

  @PostMapping("/students/report/{student_id}")
  public String saveReport(@PathVariable Long student_id, Report report) {

    reportService.saveReport(report, student_id);
    return "redirect:/students/report/{student_id}";
  }
}
