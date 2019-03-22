package com.xu.providers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicProvider_1 {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-provider_1.xml"});
        context.start();

        System.in.read(); // press any key to exit
    }

}