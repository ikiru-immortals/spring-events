package cn.com.immortals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhuowen_pan
 */
@SpringBootApplication
@ComponentScan("cn.com.immortals")
public class ImmortalsApplication {


    public static void main(String[] args) {
        try {
            SpringApplication application = new SpringApplication(ImmortalsApplication.class);
            application.run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
