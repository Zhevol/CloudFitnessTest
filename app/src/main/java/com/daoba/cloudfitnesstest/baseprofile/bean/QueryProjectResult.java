package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 查询所有需要进行的项目的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class QueryProjectResult {

    private String currentExceptionMessage;
    private boolean success;
    private List<QueryProjectData> data;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<QueryProjectData> getData() {
        return data;
    }

    public static class QueryProjectData {

        /**
         * 组别代码
         */
        private int groupid;

        /**
         * 项目编号
         */
        private int projectid;

        /**
         * 项目名称
         */
        private String projectname;

        public int getGroupid() {
            return groupid;
        }

        public int getProjectid() {
            return projectid;
        }

        public String getProjectname() {
            return projectname;
        }
    }
}
