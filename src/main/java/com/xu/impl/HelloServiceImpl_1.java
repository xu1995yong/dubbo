package com.xu.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.xu.api.HelloService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloServiceImpl_1 implements HelloService {

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext
                .getContext().getRemoteAddress() + "  I am  HelloServiceImpl_1");
        return "Hello " + name + ", response from providers: " + RpcContext.getContext().getLocalAddress();
    }

}
