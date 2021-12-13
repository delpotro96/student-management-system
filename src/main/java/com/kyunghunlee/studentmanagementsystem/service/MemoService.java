package com.kyunghunlee.studentmanagementsystem.service;

import com.kyunghunlee.studentmanagementsystem.entity.Memo;
import com.kyunghunlee.studentmanagementsystem.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {

  private final MemoRepository memoRepository;

  public Memo saveMemo(Memo memo) {
    return memoRepository.save(memo);
  }

  public List<Memo> findAllByStudent_Id(Long student_id) {
    return memoRepository.findAllByStudentId(student_id);
  }

  public void delete(Long id) {
    memoRepository.deleteById(id);
  }
}
