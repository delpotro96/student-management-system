package com.kyunghunlee.studentmanagementsystem.controller;

import com.kyunghunlee.studentmanagementsystem.entity.Memo;
import com.kyunghunlee.studentmanagementsystem.service.MemoService;
import com.kyunghunlee.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class MemoController {

  private final StudentService studentService;
  private final MemoService memoService;

  @GetMapping("/students/memo/{student_id}")
  public String memoStudent(@PathVariable Long student_id, Model model) {
    model.addAttribute("student", studentService.findStudentById(student_id));
    model.addAttribute("memo", memoService.findAllByStudent_Id(student_id));
    return "memo_student";
  }

  @PostMapping("/students/memo/{student_id}")
  public String saveMemo(@PathVariable Long student_id, Memo memo) {
    System.out.println(memo);
    memoService.saveMemo(memo);
    System.out.println("^^^^^^^^^^^^^^^^");
    return "redirect:/students/memo/{student_id}";
  }

  @PutMapping("/students/memo/{student_id}")
  public String updateMemo(@PathVariable Long student_id, Memo memo) {
    System.out.println("update");
    return "redirect:/students/memo/{student_id}";
  }
}
