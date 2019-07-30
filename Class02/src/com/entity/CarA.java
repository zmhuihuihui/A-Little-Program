package com.entity;

public class CarA implements Car {

    @Override
    public void Start() {
        System.out.println("A is starting!");
    }

    @Override
    public void Stop() {
        System.out.println("A is stopping!");
    }

    @Override
    public void goLeft() {
        System.out.println("A is going left!");
    }

    @Override
    public void goRight() {
        System.out.println("A is going right!");
    }
}
