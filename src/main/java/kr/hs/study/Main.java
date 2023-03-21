package kr.hs.study;

import kr.hs.study.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Person p1 = ctx.getBean("t1", Person.class);
        p1.prData();

        Person p2 = ctx.getBean("t2", Person.class);
        p2.prData();

        ctx.close();

    }
}