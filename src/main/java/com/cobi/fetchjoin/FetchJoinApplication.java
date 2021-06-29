package com.cobi.fetchjoin;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class FetchJoinApplication {

  public static void main(String[] args) {
    SpringApplication.run(FetchJoinApplication.class, args);
  }

  // @Bean
  // CommandLineRunner onStartUp(TestService testService) {
  //   return args -> {
  //     testService.initialize();
  //     Object allLeftFetchWithMember = testService.findAll();
  //     log.info("{}", allLeftFetchWithMember);
  //   };
  // }

}
