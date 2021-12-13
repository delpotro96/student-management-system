package com.kyunghunlee.studentmanagementsystem.repository;

import com.kyunghunlee.studentmanagementsystem.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
  List<Memo> findAllByStudentId(Long student_id);
}
