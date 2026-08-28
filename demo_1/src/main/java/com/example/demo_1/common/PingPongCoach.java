package com.example.demo_1.common;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach{
    
    @Override
    public String getDailyWorkout() {
        return "Watch a pingpong match for 1 hr daily!";
    }
}
