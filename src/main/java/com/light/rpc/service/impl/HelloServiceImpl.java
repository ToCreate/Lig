package com.light.rpc.service.impl;

import com.light.rpc.service.HelloService;
import com.light.rpc.service.RpcService;

@RpcService(HelloService.class) // 指定远程接口
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }
}