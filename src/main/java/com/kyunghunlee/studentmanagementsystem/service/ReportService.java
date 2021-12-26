package com.kyunghunlee.studentmanagementsystem.service;

import com.kyunghunlee.studentmanagementsystem.entity.Report;
import com.kyunghunlee.studentmanagementsystem.repository.ReportRepository;
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

  public Report saveReport(Report report, Long student_id) {
    Report oldReport = reportRepository.findByStudentId(student_id);

    if (oldReport != null) {
      reportRepository.deleteById(oldReport.getId());
      reportRepository.flush();
    }
    return reportRepository.save(report);
  }

  public void deleteById(Long id) {
    reportRepository.deleteById(id);
  }
}
