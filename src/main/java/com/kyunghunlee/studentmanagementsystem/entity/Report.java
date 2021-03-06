package com.kyunghunlee.studentmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@DynamicUpdate
@Entity
@Table(name = "report")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {

  @Id @GeneratedValue private Long id;

  private Integer korean_1;

  private Integer korean_2;

  private Integer english_1;

  private Integer english_2;

  private Integer math_1;

  private Integer math_2;

  private Integer history_1;

  private Integer history_2;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn
  private Student student;
}
