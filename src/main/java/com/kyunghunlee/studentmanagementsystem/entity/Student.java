package com.kyunghunlee.studentmanagementsystem.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "student")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", nullable = false)
  @NotBlank(message = "이름을 입력해주세요")
  private String name;

  @Column(name = "grade", nullable = false)
  @NotBlank(message = "학년을 입력해주세요")
  private String grade;

  @Column(name = "contact")
  private String contact;
}
