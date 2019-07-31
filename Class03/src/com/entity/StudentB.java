package com.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("StudentB")
public class StudentB {

    private Car car;

    @Autowired
    @Qualifier("CarB")   //set方法注入，指定id=CarB注入
    public void setCar(Car car)
    {

        this.car = car;
    }

    public void goHome() {
        car.Start();
        car.goRight();
        car.goRight();
        car.Stop();
    }
}
