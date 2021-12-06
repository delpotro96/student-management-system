package com.kyunghunlee.studentmanagementsystem.controller;

import com.kyunghunlee.studentmanagementsystem.entity.Report;
import com.kyunghunlee.studentmanagementsystem.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReportController {

  private final ReportService reportService;

  @GetMapping("/students/grade/{student_id}")
  public List<Report> showGrade(@PathVariable Long student_id) {
    return reportService.findAllByStudentId(student_id);
  }

  @PostMapping("/students/grade/{student_id}")
  public Report addGrade(@PathVariable Long student_id, @ModelAttribute("report") Report report) {
    return reportService.saveReport(report);
  }
}
