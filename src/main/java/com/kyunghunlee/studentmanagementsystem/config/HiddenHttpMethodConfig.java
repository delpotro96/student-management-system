package com.kyunghunlee.studentmanagementsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration
public class HiddenHttpMethodConfig {

  @Bean
  public HiddenHttpMethodFilter httpMethodFilter() {
    HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
    return hiddenHttpMethodFilter;
  }
}
