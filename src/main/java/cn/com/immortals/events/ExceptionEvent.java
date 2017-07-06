package cn.com.immortals.events;

import org.springframework.context.ApplicationEvent;

/**
 * @author zhuowen_pan
 */
public class ExceptionEvent extends ApplicationEvent {

    public ExceptionEvent(Object source) {
        super(source);
    }

    private String errorCode;

    private String errorMsg;

    public ExceptionEvent(Object source, String errorCode, String errorMsg) {
        super(source);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
