package com.kyunghunlee.studentmanagementsystem.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

  @Id @GeneratedValue private Long id;

  private String content;

  @CreatedDate private LocalDateTime saveTime = LocalDateTime.now();

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "student_id")
  private Student student;
}
