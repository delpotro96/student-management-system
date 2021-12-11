package com.kyunghunlee.studentmanagementsystem.service;

import com.kyunghunlee.studentmanagementsystem.entity.Report;
import com.kyunghunlee.studentmanagementsystem.repository.ReportRepository;
import com.kyunghunlee.studentmanagementsystem.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportService {

  private final ReportRepository reportRepository;

  public Report findByStudentId(Long student_id) {
    return reportRepository.findByStudentId(student_id);
  }

  public Report saveReport(Report report) {
    return reportRepository.save(report);
  }

  public void deleteById(Long id) {
    reportRepository.deleteById(id);
  }

  public void flush() {
    reportRepository.flush();
  }
}
