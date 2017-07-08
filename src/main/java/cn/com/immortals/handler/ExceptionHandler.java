package cn.com.immortals.handler;

import cn.com.immortals.publisher.ExceptionEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ErrorHandler;

/**
 * @author panzhuowen
 * @version 1.0.0
 */
public class ExceptionHandler implements ErrorHandler {

    @Autowired
    private ExceptionEventPublisher exceptionEventPublisher;


    @Override
    public void handleError(Throwable t) {
        exceptionEventPublisher.publisher(t);
    }
}
