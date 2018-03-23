package com.daoba.cloudfitnesstest.baseprofile.bean;

/**
 * 判断 excel 数据是否已经导入系统的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class IsExcelImportInResult {

    private String currentExceptionMessage;

    /**
     * 表示是否已经导入，导入才能开始体测
     */
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
