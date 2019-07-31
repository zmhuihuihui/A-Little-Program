package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("StudentC")
public class StudentC {

    private CarA car;

    @Autowired  //构造器注入
    public StudentC(CarA car) {
        this.car = car;
    }

    public  void goHome()
    {
        car.Start();
        car.Stop();
    }
}
