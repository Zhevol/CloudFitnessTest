package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 根据院校名称模糊查询院校信息的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class QueryAcademyResult {

    private String currentExceptionMessage;
    private boolean success;
    private List<QueryAcademyData> data;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<QueryAcademyData> getData() {
        return data;
    }

    public static class QueryAcademyData {

        /**
         * 院校编号
         */
        private int academyid;

        /**
         * 院校行政区划代码
         */
        private int academylocationid;

        /**
         * 院校名称
         */
        private String academyname;

        public int getAcademyid() {
            return academyid;
        }

        public int getAcademylocationid() {
            return academylocationid;
        }

        public String getAcademyname() {
            return academyname;
        }
    }
}
