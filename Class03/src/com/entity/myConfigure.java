package com.entity;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.entity")   //开启包扫描
@Lazy   //懒加载
public class myConfigure {

    /* 另一种方法构造Bean

    @Bean(name = "CarA")
    @Scope("prototype")
    public CarA getCarA()
    {
        return new CarA();
    }

    @Bean(name = "CarB")
    @Scope("prototype")
    public CarB getCarB()
    {
        return new CarB();
    }

     */



}
