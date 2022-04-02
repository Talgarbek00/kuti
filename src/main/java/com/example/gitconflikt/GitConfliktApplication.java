package com.example.gitconflikt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitConfliktApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitConfliktApplication.class, args);
        myMethod();
    }

    public static void myMethod(){
        System.out.println("hello kutush");
    }
}
