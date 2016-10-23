package com.affixus.simulation.pojo.response;

import com.affixus.simulation.pojo.BasePojo;

/**
 * Created by santosh on 10/23/16.
 */
public class ResponsePojo extends BasePojo {
    private boolean success;
    private String replyFor;
    private String message;
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReplyFor() {
        return replyFor;
    }

    public void setReplyFor(String replyFor) {
        this.replyFor = replyFor;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}


