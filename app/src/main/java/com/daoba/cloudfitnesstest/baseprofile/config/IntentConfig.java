package com.daoba.cloudfitnesstest.baseprofile.config;

import java.io.Serializable;

/**
 * Intent 传值的时候的相关值的键，做一个集中的保存，方便管理
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class IntentConfig {

    /**
     * 在 BaseActivity 中使用的键
     * 具体使用见{@link com.daoba.cloudfitnesstest.baseprofile.activity.BaseActivity#startActivity(Class, String)}
     */
    public static final String STRING_DATA = "intentStringData";

    /**
     * 在 BaseActivity 中使用的键
     * 具体使用见{@link com.daoba.cloudfitnesstest.baseprofile.activity.BaseActivity#startActivity(Class, Serializable)}
     */
    public static final String SERIAL_DATA = "intentSerialData";

}
