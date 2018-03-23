package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 院校首页统计信息查询的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class QueryAcademyStatisticsResult {

    private String currentExceptionMessage;
    private QueryAcademyStatisticsData data;
    private boolean success;

    public String getCurrentExceptionMessage() {
        return currentExceptionMessage;
    }

    public QueryAcademyStatisticsData getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public static class QueryAcademyStatisticsData {

        private int year;

        /**
         * 院校信息
         */
        private List<AcademyInfo> academy;

        /**
         * 评分等级
         */
        private List<RateLevel> level;

        /**
         * 通过率
         */
        private List<PassRate> rate;

        /**
         * 良好率
         */
        private List<BetterRate> betterrate;

        /**
         * 优秀率
         */
        private List<BestRate> bestrate;

        /**
         * 体测进度
         */
        private List<GradeProgress> gradeprogress;

        /**
         * 项目分组体测进度
         */
        private List<ProjectProgress> projectprogress;

        /**
         * 项目通过率
         */
        private List<ProjectPassRate> projectpassrate;

        /**
         * 院校成绩排名
         */
        private List<AcademyRank> academyranking;

        public int getYear() {
            return year;
        }

        public List<AcademyInfo> getAcademy() {
            return academy;
        }

        public List<RateLevel> getLevel() {
            return level;
        }

        public List<PassRate> getRate() {
            return rate;
        }

        public List<BetterRate> getBetterrate() {
            return betterrate;
        }

        public List<BestRate> getBestrate() {
            return bestrate;
        }

        public List<GradeProgress> getGradeprogress() {
            return gradeprogress;
        }

        public List<ProjectProgress> getProjectprogress() {
            return projectprogress;
        }

        public List<ProjectPassRate> getProjectpassrate() {
            return projectpassrate;
        }

        public List<AcademyRank> getAcademyranking() {
            return academyranking;
        }

        public static class AcademyInfo {

            /**
             * 院校编号
             */
            private int academyid;

            /**
             * 院校名称
             */
            private String academyname;

            /**
             * 院校所在行政区划代码
             */
            private int academylocationid;

            /**
             * 院校组织机构代码
             */
            private int academycode;

            /**
             * 院校地址
             */
            private String academyaddress;

            public int getAcademyid() {
                return academyid;
            }

            public String getAcademyname() {
                return academyname;
            }

            public int getAcademylocationid() {
                return academylocationid;
            }

            public int getAcademycode() {
                return academycode;
            }

            public String getAcademyaddress() {
                return academyaddress;
            }
        }

        public static class RateLevel {

            /**
             * 年度
             */
            private int effectyear;

            /**
             * 评分等级 1不及格 2及格3良好4优秀
             */
            private int ratelevel;

            /**
             * 数量
             */
            private int num;

            public int getEffectyear() {
                return effectyear;
            }

            public int getRatelevel() {
                return ratelevel;
            }

            public int getNum() {
                return num;
            }
        }

        public static class PassRate {
            /**
             * 年度
             */
            private int effectyear;

            /**
             * 通过率
             */
            private double rate;

            public int getEffectyear() {
                return effectyear;
            }

            public double getRate() {
                return rate;
            }
        }

        public static class BetterRate {

            /**
             * 年度
             */
            private int effectyear;

            /**
             * 良好率
             */
            private double rate;

            public int getEffectyear() {
                return effectyear;
            }

            public double getRate() {
                return rate;
            }
        }

        public static class BestRate {

            /**
             * 年度
             */
            private int effectyear;

            /**
             * 优秀率
             */
            private double rate;

            public int getEffectyear() {
                return effectyear;
            }

            public double getRate() {
                return rate;
            }
        }

        public static class GradeProgress {

            /**
             * 年级代码
             */
            private int gradecode;

            /**
             * 已完成
             */
            private int complete;

            /**
             * 总数
             */
            private int needsx;

            /**
             * 年级名称
             */
            private String schoolgradename;

            public int getGradecode() {
                return gradecode;
            }

            public int getComplete() {
                return complete;
            }

            public int getNeedsx() {
                return needsx;
            }

            public String getSchoolgradename() {
                return schoolgradename;
            }
        }

        public static class ProjectProgress {

            /**
             * 项目编号
             */
            private int projectid;

            /**
             * 总数量
             */
            private int allnum;

            /**
             * 已完成数量
             */
            private int done;

            /**
             * 项目名称
             */
            private String projectname;

            public int getProjectid() {
                return projectid;
            }

            public int getAllnum() {
                return allnum;
            }

            public int getDone() {
                return done;
            }

            public String getProjectname() {
                return projectname;
            }
        }

        public static class ProjectPassRate {

            /**
             * 项目编号
             */
            private int projectid;

            /**
             * 项目名称
             */
            private String projectname;

            /**
             * 项目通过率
             */
            private double rate;

            public int getProjectid() {
                return projectid;
            }

            public String getProjectname() {
                return projectname;
            }

            public double getRate() {
                return rate;
            }
        }

        public static class AcademyRank {

            /**
             * 姓名（显示时只显示姓，名用*代替）
             */
            private String realname;

            /**
             * 标准分
             */
            private double standardscorce;

            /**
             * 附加分
             */
            private double totaladdon;

            /**
             * 总分
             */
            private double totalscorce;

            public String getRealname() {
                return realname;
            }

            public double getStandardscorce() {
                return standardscorce;
            }

            public double getTotaladdon() {
                return totaladdon;
            }

            public double getTotalscorce() {
                return totalscorce;
            }
        }
    }
}
