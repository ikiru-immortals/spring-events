package cn.com.immortals.publisher;

import cn.com.immortals.events.ExceptionEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @author zhuowen_pan
 */
@Service
public class ExceptionEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publisher(Throwable throwable) {
        applicationEventPublisher.publishEvent(new ExceptionEvent(this, "A10000", throwable.getMessage()));
    }
}
