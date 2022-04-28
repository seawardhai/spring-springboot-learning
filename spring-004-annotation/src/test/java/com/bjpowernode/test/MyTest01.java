package com.bjpowernode.test;

import com.bjpowernode.vo1.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 18:44
 */
public class MyTest01 {
    @Test
    public void testStudent() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("vo1/applicationConfig.xml");
        Student stu = (Student) ctx.getBean("stu");
        System.out.println(stu);
    }
}
