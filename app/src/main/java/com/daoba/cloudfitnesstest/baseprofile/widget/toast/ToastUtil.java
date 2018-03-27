package com.daoba.cloudfitnesstest.baseprofile.widget.toast;

import com.daoba.cloudfitnesstest.baseprofile.application.FitnessApplication;

/**
 * 展示 Toast 的方法类
 *
 * @author Zhevol
 * @date 2018/3/27 0027
 */
public class ToastUtil {

    /**
     * 在顶部展示一个短时的 Toast
     *
     * @param toastMsg 内容
     */
    public static void showTopShortToast(String toastMsg) {
        Toast.make(Toast.Position.TOP, FitnessApplication.getInstance().getApplicationContext(), toastMsg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 在顶部展示一个长时的 Toast
     *
     * @param toastMsg 内容
     */
    public static void showTopLongToast(String toastMsg) {
        Toast.make(Toast.Position.TOP, FitnessApplication.getInstance().getApplicationContext(), toastMsg, Toast.LENGTH_LONG).show();
    }

    /**
     * 在底部展示一个短时的 Toast
     *
     * @param toastMsg 内容
     */
    public static void showBottomShortToast(String toastMsg) {
        Toast.make(Toast.Position.BOTTOM, FitnessApplication.getInstance().getApplicationContext(), toastMsg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 在底部展示一个长时的 Toast
     *
     * @param toastMsg 内容
     */
    public static void showBottomLongToast(String toastMsg) {
        Toast.make(Toast.Position.BOTTOM, FitnessApplication.getInstance().getApplicationContext(), toastMsg, Toast.LENGTH_LONG).show();
    }
}
