package com.entity;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("StudentA")
public class StudentA {

    @Autowired
    @Qualifier("CarA")   //field注入，指定id=CarA注入
    private Car car;

    public void goHome() {
        car.Start();
        car.goLeft();
        car.goLeft();
        car.Stop();
    }
}
