package com.afei.codelearning;

import com.afei.codelearning.aspect.FirstAspect;
import com.afei.codelearning.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeLearningApplication.class, args);
    }

}
