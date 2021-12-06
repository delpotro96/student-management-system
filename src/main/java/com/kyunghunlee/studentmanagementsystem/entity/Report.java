package com.kyunghunlee.studentmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name = "report")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {

  @Id @GeneratedValue private Long id;

  @ColumnDefault("점수를 입력해주세요")
  private Integer korean_1;

  @ColumnDefault("점수를 입력해주세요")
  private Integer korean_2;

  @ColumnDefault("점수를 입력해주세요")
  private Integer english_1;

  @ColumnDefault("점수를 입력해주세요")
  private Integer english_2;

  @ColumnDefault("점수를 입력해주세요")
  private Integer math_1;

  @ColumnDefault("점수를 입력해주세요")
  private Integer math_2;

  @ColumnDefault("점수를 입력해주세요")
  private Integer history_1;

  @ColumnDefault("점수를 입력해주세요")
  private Integer history_2;

  @ManyToOne private Student student;
}
