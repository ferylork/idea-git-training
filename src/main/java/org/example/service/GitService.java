package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class GitService {

    public String test() {
        System.out.println("这是一个测试");
        System.out.println("这是第二个测试");
        return "hello";
    }

}
