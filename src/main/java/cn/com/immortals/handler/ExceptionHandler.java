package cn.com.immortals.handler;

import cn.com.immortals.publisher.ExceptionEventPublisher;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ErrorHandler;

import java.lang.reflect.Method;

/**
 * @author panzhuowen
 * @version 1.0.0
 */
public class ExceptionHandler implements AsyncUncaughtExceptionHandler {

    @Autowired
    private ExceptionEventPublisher exceptionEventPublisher;


    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {
        exceptionEventPublisher.publisher(throwable);
    }
}
