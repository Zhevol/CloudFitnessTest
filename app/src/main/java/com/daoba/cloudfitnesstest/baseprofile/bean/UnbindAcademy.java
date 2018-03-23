package com.daoba.cloudfitnesstest.baseprofile.bean;

/**
 * 取消关注院校的结果，data 和 success 都为 true 的时候取消关注成功
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class UnbindAcademy {

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
