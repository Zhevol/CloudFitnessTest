package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 查询所有年级的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class QueryGradeResult {

    private String currentExceptionMessage;
    private boolean success;
    private List<QueryGradeData> data;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<QueryGradeData> getData() {
        return data;
    }

    public static class QueryGradeData {

        /**
         * 院校编号
         */
        private int academyid;

        /**
         * 年级代码
         */
        private int schoolgradecode;

        /**
         * 年级名称
         */
        private String schoolgradename;

        public int getAcademyid() {
            return academyid;
        }

        public int getSchoolgradecode() {
            return schoolgradecode;
        }

        public String getSchoolgradename() {
            return schoolgradename;
        }
    }
}
