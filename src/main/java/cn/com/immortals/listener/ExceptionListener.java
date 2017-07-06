package cn.com.immortals.listener;

import cn.com.immortals.events.ExceptionEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @author zhuowen_pan
 */
@Service
public class ExceptionListener implements ApplicationListener<ExceptionEvent> {

    public void onApplicationEvent(ExceptionEvent exceptionEvent) {

    }
}
