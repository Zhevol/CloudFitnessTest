package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 发送登录验证码的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class SendLoginSmsResult {

    private String currentExceptionMessage;
    private boolean success;
    private List<SendLoginSmsData> data;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<SendLoginSmsData> getData() {
        return data;
    }

    public static class SendLoginSmsData {

        private String pashash;
        private String userphone;
        private int locked;
        /**
         * 使用标志：1-使用中，若不等于1则不能登录
         */
        private int inuse;

        public String getPashash() {
            return pashash;
        }

        public String getUserphone() {
            return userphone;
        }

        public int getLocked() {
            return locked;
        }

        public int getInuse() {
            return inuse;
        }
    }
}
