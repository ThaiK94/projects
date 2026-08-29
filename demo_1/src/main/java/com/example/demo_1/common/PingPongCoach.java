package com.example.demo_1.common;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
public class PingPongCoach implements Coach{

    public PingPongCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }




    @Override
    public String getDailyWorkout() {
        return "Watch a ping pong match for 1 hr daily!";
    }
}
