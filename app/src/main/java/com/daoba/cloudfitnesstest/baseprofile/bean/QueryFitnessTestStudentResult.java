package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 分页查询所有参加体测的学生的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class QueryFitnessTestStudentResult {

    private String currentExceptionMessage;
    private QueryFitnessTestStudentData data;
    private boolean success;

    public Object getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public QueryFitnessTestStudentData getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public static class QueryFitnessTestStudentData {

        /**
         * 页码
         */
        private int page;

        /**
         * 总页数
         */
        private int pagecount;

        /**
         * 参加提测的学生的集合
         */
        private List<TestStudentInfo> students;

        public int getPage() {
            return page;
        }
        public int getPagecount() {
            return pagecount;
        }

        public List<TestStudentInfo> getStudents() {
            return students;
        }

        public static class TestStudentInfo {

            /**
             * 院校编号
             */
            private int academyid;

            /**
             * 学生编号
             */
            private int studentid;

            /**
             * 学籍号
             */
            private String studentcode;

            /**
             * 生日
             */
            private String birthday;

            /**
             * 家庭地址
             */
            private String homeaddress;

            /**
             * 班级编号
             */
            private String classid;

            /**
             * 姓名
             */
            private String realname;

            /**
             * 性别1男2女
             */
            private int sexcode;

            /**
             * 测试内容
             */
            private List<TestIndexInfo> testindex;

            public int getAcademyid() {
                return academyid;
            }

            public int getStudentid() {
                return studentid;
            }

            public String getStudentcode() {
                return studentcode;
            }

            public String getBirthday() {
                return birthday;
            }

            public String getHomeaddress() {
                return homeaddress;
            }

            public String getClassid() {
                return classid;
            }

            public String getRealname() {
                return realname;
            }

            public int getSexcode() {
                return sexcode;
            }

            public List<TestIndexInfo> getTestindex() {
                return testindex;
            }

            public static class TestIndexInfo {

                /**
                 * 项目编号
                 */
                private int projectid;

                /**
                 * 学生编号
                 */
                private int studentid;

                /**
                 * 院校编号
                 */
                private int academyid;

                /**
                 * 测试参数编号
                 */
                private int parameterid;

                /**
                 * 测试参数名称
                 */
                private String parametername;

                /**
                 * 单位，如果是分秒则去掉分秒表示
                 */
                private String parameterunit;

                /**
                 * 测试结果
                 */
                private double testresult;

                public int getProjectid() {
                    return projectid;
                }

                public int getStudentid() {
                    return studentid;
                }

                public int getAcademyid() {
                    return academyid;
                }

                public int getParameterid() {
                    return parameterid;
                }

                public String getParametername() {
                    return parametername;
                }

                public String getParameterunit() {
                    return parameterunit;
                }

                public double getTestresult() {
                    return testresult;
                }
            }
        }
    }
}
