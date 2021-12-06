package com.kyunghunlee.studentmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "student")
@Data
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
