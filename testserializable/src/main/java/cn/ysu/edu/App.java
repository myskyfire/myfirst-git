package cn.ysu.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);
    private static Logger LOG_SECURITY = LoggerFactory.getLogger("SECURITY");

    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (int i = 0; i < 10; i++) {
//            logger.info("Hello worsss ld!");
            LOG_SECURITY.info("hhhhh " + i);
        }
    }
}
