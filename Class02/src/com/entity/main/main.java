package com.entity.main;

import com.entity.StudentA;
import com.entity.StudentB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        StudentA ZhangSan = context.getBean("StudentA", StudentA.class);
        StudentB LiSi = context.getBean("StudentB", StudentB.class);

        ZhangSan.goHome();
        LiSi.goHome();

    }
}
