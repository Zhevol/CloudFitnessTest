package com.daoba.cloudfitnesstest.baseprofile.application;

import android.app.Activity;
import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Application类，可以在里面初始化相关的全局变量
 *
 * @author Zhevol
 * @date 2018/3/23 0023
 */
public class FitnessApplication extends Application {

    private static FitnessApplication mFitnessApplication;
    private List<Activity> activityList;

    @Override
    public void onCreate() {
        super.onCreate();
        mFitnessApplication = this;
        activityList = new ArrayList<>();
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    /**
     * 获取本应用的 Application 的实例
     *
     * @return FitnessApplication 实例
     */
    public static FitnessApplication getInstance() {
        return mFitnessApplication;
    }

    /**
     * 将 Activity 添加到 {@code activityList} 中.
     *
     * @param activity Activity 实例
     */
    public void addActivity(Activity activity) {
        activityList.add(activity);
    }

    /**
     * app的退出管理，关闭所有的Activity并退出程序
     */
    public void exitApp() {
        try {
            for (Activity activity : activityList) {
                if (activity != null) {
                    activity.finish();
                }
            }
            activityList.clear();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }
}
