package com.entity;

public class StudentA extends Student {

    //构造器注入
    public StudentA(Car car)
    {

        this.car=car;
    }

    @Override
    public void goHome() {
        car.Start();
        car.goLeft();
        car.goLeft();
        car.Stop();
    }
}
