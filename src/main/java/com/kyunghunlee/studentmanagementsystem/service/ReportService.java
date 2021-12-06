package com.kyunghunlee.studentmanagementsystem.service;

import com.kyunghunlee.studentmanagementsystem.entity.Report;

import java.util.List;

public interface ReportService {
  Report findByStudentId(Long student_id);

  Report saveReport(Report report);
}
