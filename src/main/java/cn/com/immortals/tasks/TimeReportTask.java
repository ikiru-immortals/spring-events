package cn.com.immortals.tasks;

import cn.com.immortals.biz.ExceptionBizService;
import cn.com.immortals.exceptions.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author panzhuowen
 * @version 1.0.0
 */
@Component
public class TimeReportTask {

    @Autowired
    private ExceptionBizService exceptionBizService;

    @Scheduled(fixedRate = 1000)
    public void run() throws Exception {
        async();
    }

    @Async
    public void async() throws Exception {
        exceptionBizService.reportTime();
    }
}
