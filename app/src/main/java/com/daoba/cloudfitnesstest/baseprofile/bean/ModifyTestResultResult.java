package com.daoba.cloudfitnesstest.baseprofile.bean;

/**
 * 修改体测成绩的方法
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class ModifyTestResultResult {

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
