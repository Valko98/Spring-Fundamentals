package com.example.studentexamplesb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JUNE;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Valentin = new Student(
                    "Valentin",
                    "Valentinmitev@gmail.com",
                    LocalDate.of(1998, JUNE, 4)
            );
            Student Zyzy = new Student(
                    "Zuzu",
                    "ZyzyK@gmail.com",
                    LocalDate.of(2001, FEBRUARY, 25)
            );

            repository.saveAll(List.of(Valentin,Zyzy));

        };

    }
}
