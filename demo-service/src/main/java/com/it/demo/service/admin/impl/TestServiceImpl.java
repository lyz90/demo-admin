package com.it.demo.service.admin.impl;

import com.it.demo.service.admin.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{


    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
    @Override
    public String test(String string) {
        logger.info("这是一个测试的日志");
        return string+"  SpringBoot";
    }
}
