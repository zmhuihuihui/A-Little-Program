package com.entity;

public class StudentB extends Student {

    //set方法注入
    public void setCar(Car car)
    {

        this.car = car;
    }

    @Override
    public void goHome() {
        car.Start();
        car.goRight();
        car.goRight();
        car.Stop();
    }
}
