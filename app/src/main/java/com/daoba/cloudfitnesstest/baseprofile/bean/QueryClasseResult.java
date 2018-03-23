package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 查询所有班级的方法
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class QueryClasseResult {

    private String currentExceptionMessage;
    private boolean success;
    private List<QueryClasseData> data;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<QueryClasseData> getData() {
        return data;
    }

    public static class QueryClasseData {

        /**
         * 院校编号
         */
        private int academyid;

        /**
         * 年级代码
         */
        private int schoolgradecode;

        /**
         * 班级代码
         */
        private int academyclassid;

        /**
         * 班级名称
         */
        private String academyclassname;

        /**
         * 对应年度
         */
        private int effectyear;

        public int getAcademyid() {
            return academyid;
        }

        public int getSchoolgradecode() {
            return schoolgradecode;
        }

        public int getAcademyclassid() {
            return academyclassid;
        }

        public String getAcademyclassname() {
            return academyclassname;
        }

        public int getEffectyear() {
            return effectyear;
        }
    }
}
