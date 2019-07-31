package com.entity.main;

import com.entity.StudentA;
import com.entity.StudentB;
import com.entity.StudentC;
import com.entity.myConfigure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(myConfigure.class);
        StudentA zhangsan = context.getBean("StudentA",StudentA.class);
        StudentB lisi = context.getBean("StudentB",StudentB.class);
        StudentC wangwu = context.getBean("StudentC",StudentC.class);

        zhangsan.goHome();
        lisi.goHome();
        wangwu.goHome();
    }
}
