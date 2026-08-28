package com.example.demo_1.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
public class PingPongCoach implements Coach{

    public PingPongCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct // this allows you to do things after bean has been constructed
    public void doWhateverAfterBeanConstruction(){
        System.out.println("Hello World!");
        System.out.println("doWhateverAftetBeanConstruction() " + getClass().getSimpleName());
    }


    @PreDestroy //this allows you to tidy up before the bean gets destroyed
    public void doWhateverBeforeBeanDestruction(){
        System.out.println("Buh bye world!");
        System.out.println("In doWhateverBeforeBeanDestruction: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Watch a ping pong match for 1 hr daily!";
    }
}
