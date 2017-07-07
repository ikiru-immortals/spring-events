package cn.com.immortals.config;

import cn.com.immortals.handler.ExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author panzhuowen
 * @version 1.0.0
 */
@Configuration
@EnableAsync
@EnableScheduling
public class BeansConfig {

    @Bean
    public ExceptionHandler exceptionHandler() {
        return new ExceptionHandler();
    }

}
