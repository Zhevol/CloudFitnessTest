package com.daoba.cloudfitnesstest.baseprofile.bean;

/**
 * 注册 APP 用户的结果，success 和 data 都为 true 表示注册成功
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class RegistAppUserResult {

    private String currentExceptionMessage;
    private boolean data;
    private boolean success;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public boolean isData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }
}
