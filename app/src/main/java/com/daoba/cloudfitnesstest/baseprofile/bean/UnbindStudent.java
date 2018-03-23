package com.daoba.cloudfitnesstest.baseprofile.bean;

/**
 * 取消关注学生的结果，当且仅当 data 和 success 都为 true 的时候，取消成功
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class UnbindStudent {

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
