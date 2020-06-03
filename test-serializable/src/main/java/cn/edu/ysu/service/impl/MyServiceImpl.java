package cn.edu.ysu.service.impl;

import cn.edu.ysu.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author
 */
@Service
@Slf4j
public class MyServiceImpl implements MyService {
    public void print(String name) {
       /* String a = StaticUtils.getFullName(name);
        log.info("name====={}",a);*/
       System.out.println(name);
    }
}
