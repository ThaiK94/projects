package com.example.demo_1.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Hit 3 balls everyday play pingpong";
    }
}
