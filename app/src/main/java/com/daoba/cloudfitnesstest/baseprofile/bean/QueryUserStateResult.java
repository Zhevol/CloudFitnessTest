package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 根据用户编号查询用户关注信息的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class QueryUserStateResult {

    private String currentExceptionMessage;
    private UserStateData data;
    private boolean success;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public UserStateData getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public static class UserStateData {

        /**
         * 关注的学校
         */
        private List<BindAcademy> bindacademys;

        /**
         * 关注的学生
         */
        private List<BindStudent> bindstudent;

        public List<BindAcademy> getBindacademys() {
            return bindacademys;
        }

        public List<BindStudent> getBindstudent() {
            return bindstudent;
        }

        public static class BindAcademy {

            /**
             * APP 用户编号
             */
            private int appuserid;

            /**
             * 关注学校的编号
             */
            private int academyid;

            /**
             * 关注学校的名称
             */
            private String academyname;

            /**
             * 关注学校的行政区划代码
             */
            private int academylocationid;

            public int getAppuserid() {
                return appuserid;
            }

            public int getAcademyid() {
                return academyid;
            }

            public String getAcademyname() {
                return academyname;
            }

            public int getAcademylocationid() {
                return academylocationid;
            }
        }

        public static class BindStudent {

            /**
             * 用户关注学生绑定编号
             */
            private int appuserstudentbindid;

            /**
             * APP 用户编号
             */
            private int appuserid;

            /**
             * 关注学生姓名
             */
            private String realname;

            /**
             * 正式学籍号
             */
            private String studentcode;

            /**
             * 旧版学籍号
             */
            private String oldcode;

            /**
             * 其他使用过学籍号
             */
            private String othercode;

            /**
             * 曾用学籍号
             */
            private String usedstudentcode;

            /**
             * 临时学籍号
             */
            private String tmpstudentcode;

            public int getAppuserstudentbindid() {
                return appuserstudentbindid;
            }

            public int getAppuserid() {
                return appuserid;
            }

            public String getRealname() {
                return realname;
            }

            public String getStudentcode() {
                return studentcode;
            }

            public String getOldcode() {
                return oldcode;
            }

            public String getOthercode() {
                return othercode;
            }

            public String getUsedstudentcode() {
                return usedstudentcode;
            }

            public String getTmpstudentcode() {
                return tmpstudentcode;
            }
        }
    }
}
