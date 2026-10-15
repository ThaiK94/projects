package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("tom", "cat"));
        theStudents.add(new Student("jerry", "mouse"));
        theStudents.add(new Student("daffy", "duck"));
    }

    @GetMapping("/students")
    public List<Student> getStudent(){

        return theStudents;
    }

    @GetMapping("/students/{studentID}")
    public Student getStudent(@PathVariable int studentID){
        if((studentID >= theStudents.size()) || (studentID < 0 )){
            throw new StudentNotFoundException("Student id not found - " + studentID);
        }

        return theStudents.get(studentID);
    }



}
