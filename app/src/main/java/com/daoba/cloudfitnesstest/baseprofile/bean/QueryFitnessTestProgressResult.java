package com.daoba.cloudfitnesstest.baseprofile.bean;

import java.util.List;

/**
 * 查询当前体测进度的结果
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class QueryFitnessTestProgressResult {

    private String currentExceptionMessage;
    private boolean success;
    private List<QueryFitnessTestProgressData> data;

    public static class QueryFitnessTestProgressData {

        /**
         * 0：未开始  1：进行中  2：已完成
         */
        private int state;

        /**
         * 数量
         */
        private int num;

        public int getState() {
            return state;
        }

        public int getNum() {
            return num;
        }
    }
}
