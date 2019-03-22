package com.xu.consumers;

import com.xu.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer_1 {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-consumer_1.xml"});
        context.start();
        HelloService helloService = (HelloService) context.getBean("helloService"); // get remote service proxy

        while (true) {
            Thread.sleep(1000);
            String hello = helloService.sayHello("world"); // call remote method
            System.out.println(hello);
        }


    }
}