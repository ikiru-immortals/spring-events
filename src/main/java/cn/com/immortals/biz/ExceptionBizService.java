package cn.com.immortals.biz;

import cn.com.immortals.exceptions.BizException;
import org.springframework.stereotype.Service;

import java.time.Instant;

/**
 * @author zhuowen_pan
 */
@Service
public class ExceptionBizService {

    public void reportTime() throws Exception {
        Instant instant = Instant.now();
        System.out.println(instant);
        int a = instant.getNano();
        if (a % 2 == 0) {
            throw new Exception("runtime error");
        }
    }

}
