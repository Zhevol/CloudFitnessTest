package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 根据学籍号查询学生信息的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class QueryStudentInfoResult {

    private String currentExceptionMessage;
    private boolean success;
    private List<QueryStudentInfoData> data;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<QueryStudentInfoData> getData() {
        return data;
    }

    public static class QueryStudentInfoData {
        /**
         * realname : 曾影昕
         * academyid : 10
         * gradecode : 16
         * schoolgradename : 六年级
         * classid : 2010104
         * classname : (4)班
         * studentcode : G500382200408225621
         * ethnicitycode : 1
         * ethnicityName : 汉族
         * sexcode : 2
         * birthday : 2004-08-22
         * homeaddress : 科园5路118号
         * effectyear : 2015
         */

        /**
         * 姓名
         */
        private String realname;

        /**
         * 所在院校编号
         */
        private int academyid;

        /**
         * 年级代码
         */
        private int gradecode;

        /**
         * 年级名称
         */
        private String schoolgradename;

        /**
         * 班级代码
         */
        private int classid;

        /**
         * 班级名称
         */
        private String classname;

        /**
         * 学籍号
         */
        private String studentcode;

        /**
         * 民族代码
         */
        private int ethnicitycode;

        /**
         * 民族
         */
        private String ethnicityName;

        /**
         * 性别 1男2女
         */
        private int sexcode;

        /**
         * 生日
         */
        private String birthday;

        /**
         * 住址
         */
        private String homeaddress;

        /**
         * 年度
         */
        private int effectyear;

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
    }
}
