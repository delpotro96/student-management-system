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
  public List<Report> findAllByStudentId(Long student_id) {
    return reportRepository.findAllByStudentId(student_id);
  }
}
