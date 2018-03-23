package com.daoba.cloudfitnesstest.baseprofile.bean;

/**
 * 提交体测成绩的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class SignTestResultResult {

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
