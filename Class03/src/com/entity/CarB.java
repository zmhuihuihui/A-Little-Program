package com.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("CarB")
@Scope("prototype")
public class CarB implements Car {

    @Override
    public void Start() {
        System.out.println("B is starting!");
    }

    @Override
    public void Stop() {
        System.out.println("B is stopping!");
    }

    @Override
    public void goLeft() {
        System.out.println("B is going left!");
    }

    @Override
    public void goRight() {
        System.out.println("B is going right!");
    }
}
