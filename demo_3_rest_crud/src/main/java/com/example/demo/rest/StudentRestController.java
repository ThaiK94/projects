package com.example.demo.rest;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @GetMapping("/students")
    public List<Student> getStudent(){
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("tom", "cat"));
        theStudents.add(new Student("jerry", "mouse"));
        theStudents.add(new Student("daffy", "duck"));
        return theStudents;
    }

}
