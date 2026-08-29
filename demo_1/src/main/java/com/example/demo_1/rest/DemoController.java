package com.example.demo_1.rest;


import com.example.demo_1.common.Coach;
import com.example.demo_1.common.PingPongCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;


    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }



    @GetMapping("/dailyworkouts")
    public String getDailyWorkout() {

        return myCoach.getDailyWorkout();
    }







}
