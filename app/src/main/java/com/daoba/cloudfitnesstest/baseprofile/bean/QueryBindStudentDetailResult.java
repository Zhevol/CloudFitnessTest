package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 查询学生体测登记卡的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class QueryBindStudentDetailResult {

    private String currentExceptionMessage;
    private boolean success;
    private List<BindStudentDetailData> data;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<BindStudentDetailData> getData() {
        return data;
    }

    public static class BindStudentDetailData {
        private String realname;
        private int academyid;
        private int gradecode;
        private String schoolgradename;
        private int classid;
        private String classname;
        private String studentcode;
        private int ethnicitycode;
        private String ethnicityName;
        private int sexcode;
        private String birthday;
        private String homeaddress;
        private int effectyear;

        /**
         * 总分数 标准分与附加分之和
         */
        private double totalscorce;

        /**
         * 标准分
         */
        private double standardscorce;

        /**
         * 附加分
         */
        private double totaladdon;

        /**
         * 评分等级
         */
        private int ratelevel;

        /**
         * 项目代码
         */
        private int projectid;

        /**
         * 项目附加分
         */
        private double addonscorce;

        /**
         * 项目得分
         */
        private double scorce;

        /**
         * 评价等级
         */
        private String signlevel;

        /**
         * 测试结果
         */
        private double testresult;

        /**
         * 实际得分
         */
        private double realscorce;

        /**
         * 项目名称
         */
        private String projectname;

        public String getRealname() {
            return realname;
        }

        public int getAcademyid() {
            return academyid;
        }

        public int getGradecode() {
            return gradecode;
        }

        public String getSchoolgradename() {
            return schoolgradename;
        }

        public int getClassid() {
            return classid;
        }

        public String getClassname() {
            return classname;
        }

        public String getStudentcode() {
            return studentcode;
        }

        public int getEthnicitycode() {
            return ethnicitycode;
        }

        public String getEthnicityName() {
            return ethnicityName;
        }

        public int getSexcode() {
            return sexcode;
        }

        public String getBirthday() {
            return birthday;
        }

        public String getHomeaddress() {
            return homeaddress;
        }

        public int getEffectyear() {
            return effectyear;
        }

        public double getTotalscorce() {
            return totalscorce;
        }

        public double getStandardscorce() {
            return standardscorce;
        }

        public double getTotaladdon() {
            return totaladdon;
        }

        public int getRatelevel() {
            return ratelevel;
        }

        public int getProjectid() {
            return projectid;
        }

        public double getAddonscorce() {
            return addonscorce;
        }

        public double getScorce() {
            return scorce;
        }

        public String getSignlevel() {
            return signlevel;
        }

        public double getTestresult() {
            return testresult;
        }

        public double getRealscorce() {
            return realscorce;
        }

        public String getProjectname() {
            return projectname;
        }
    }
}
