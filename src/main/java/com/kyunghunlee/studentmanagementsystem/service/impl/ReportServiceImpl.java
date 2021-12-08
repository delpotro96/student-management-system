package com.kyunghunlee.studentmanagementsystem.service.impl;

import com.kyunghunlee.studentmanagementsystem.entity.Report;
import com.kyunghunlee.studentmanagementsystem.repository.ReportRepository;
import com.kyunghunlee.studentmanagementsystem.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

  private final ReportRepository reportRepository;

  @Override
  public Report findByStudentId(Long student_id) {
    return reportRepository.findByStudentId(student_id);
  }

  @Override
  public Report saveReport(Report report) {
    return reportRepository.save(report);
  }

  @Override
  public void deleteById(Long id) {
    reportRepository.deleteById(id);
  }

  @Override
  public void flush() {
    reportRepository.flush();
  }
}
