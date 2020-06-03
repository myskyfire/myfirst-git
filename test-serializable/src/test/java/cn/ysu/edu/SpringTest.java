package cn.ysu.edu;

import cn.edu.ysu.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("/spring/spring-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class SpringTest {

   @Autowired
    MyService myService;







    @Test
    public void testStaticInject(){
        myService.print("sadasdasd");
        log.info("aaaaa");
    }

}
