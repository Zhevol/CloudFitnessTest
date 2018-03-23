package com.daoba.cloudfitnesstest.baseprofile.bean;

/**
 * 关注学生的结果，data 和 success 都为 true 的时候绑定成功
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class BindStudentResult {

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
