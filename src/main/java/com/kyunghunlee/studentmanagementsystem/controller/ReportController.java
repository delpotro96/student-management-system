package com.kyunghunlee.studentmanagementsystem.controller;

import com.kyunghunlee.studentmanagementsystem.entity.Report;
import com.kyunghunlee.studentmanagementsystem.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ReportController {

  private final ReportService reportService;

  @GetMapping("/students/grade/{student-id}")
  public List<Report> showGrade(@PathVariable Long student_id) {
    return reportService.findAllByStudentId(student_id);
  }

  @PostMapping("/students/grade/{student-id}")
  public List<Report> addGrade(@PathVariable Long student_id) {
    return null;
  }
}
