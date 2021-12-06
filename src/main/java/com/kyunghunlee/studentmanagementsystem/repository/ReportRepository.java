package com.kyunghunlee.studentmanagementsystem.repository;

import com.kyunghunlee.studentmanagementsystem.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
  Report findByStudentId(Long student_id);
}
