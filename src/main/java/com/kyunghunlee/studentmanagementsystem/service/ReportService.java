package com.kyunghunlee.studentmanagementsystem.service;

import com.kyunghunlee.studentmanagementsystem.entity.Report;

import java.util.List;

public interface ReportService {
  List<Report> findAllByStudentId(Long student_id);
}
