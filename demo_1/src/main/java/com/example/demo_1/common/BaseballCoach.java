package com.example.demo_1.common;


import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 15min catching a ball!";
    }
}
