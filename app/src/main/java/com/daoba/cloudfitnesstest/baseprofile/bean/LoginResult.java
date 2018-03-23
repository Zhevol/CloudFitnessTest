package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 登录请求的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class LoginResult {

    private String currentExceptionMessage;
    private LoginData data;
    private boolean success;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public LoginData getData() {
        return data;
    }

    public void setData(LoginData data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public static class LoginData {

        /**
         * App用户
         */
        private AppUser appuser;

        /**
         * 系统用户（具有体测菜单）
         */
        private SysUser sysuser;

        public AppUser getAppuser() {
            return appuser;
        }

        public SysUser getSysuser() {
            return sysuser;
        }

        public static class AppUser {

            /**
             * 姓名
             */
            private String username;

            /**
             * 手机号码
             */
            private String userphone;

            /**
             * APP 用户编号
             */
            private int userid;

            /**
             * 用户绑定的学员（有可能多个）
             */
            private List<StudentCode> studentcodes;

            public String getUsername() {
                return username;
            }

            public String getUserphone() {
                return userphone;
            }

            public int getUserid() {
                return userid;
            }

            public List<StudentCode> getStudentcodes() {
                return studentcodes;
            }

            public static class StudentCode {

                /**
                 * 用户绑定的学生编号
                 */
                private int appuserstudentbindid;

                /**
                 * APP 用户编号
                 */
                private int appuserid;

                /**
                 * 正式学籍号
                 */
                private String studentcode;

                /**
                 * 临时学籍号
                 */
                private String tmpstudentcode;

                /**
                 * 曾用学籍号
                 */
                private String usedstudentcode;

                /**
                 * 其他用过的学籍号
                 */
                private String othercode;

                /**
                 * 旧版学籍号
                 */
                private String oldcode;

                public int getAppuserstudentbindid() {
                    return appuserstudentbindid;
                }

                public int getAppuserid() {
                    return appuserid;
                }

                public String getStudentcode() {
                    return studentcode;
                }

                public String getTmpstudentcode() {
                    return tmpstudentcode;
                }

                public String getUsedstudentcode() {
                    return usedstudentcode;
                }

                public String getOthercode() {
                    return othercode;
                }

                public String getOldcode() {
                    return oldcode;
                }
            }
        }

        public static class SysUser {

            /**
             * 姓名
             */
            private String username;

            /**
             * 手机号码
             */
            private String userphone;

            /**
             * 用户编号
             */
            private int userid;

            /**
             * 用户所属学校编号
             */
            private int academyid;

            /**
             * 用户所属学校名称
             */
            private String academyname;

            /**
             * 用户所在的行政区划编号
             */
            private int academylocationid;

            public String getUsername() {
                return username;
            }

            public String getUserphone() {
                return userphone;
            }

            public int getUserid() {
                return userid;
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
    }
}
