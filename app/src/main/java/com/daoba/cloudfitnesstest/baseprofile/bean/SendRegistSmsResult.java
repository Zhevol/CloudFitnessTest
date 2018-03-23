package com.daoba.cloudfitnesstest.baseprofile.bean;

/**
 * 发送注册验证码的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class SendRegistSmsResult {

    private boolean success;
    /**
     * data 为 true 则发送成功
     */
    private boolean data;
    private String currentExceptionMessage;

    public boolean isSuccess() {
        return success;
    }

    public boolean isData() {
        return data;
    }

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }
}
