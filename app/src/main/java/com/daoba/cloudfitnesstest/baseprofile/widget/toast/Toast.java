package com.daoba.cloudfitnesstest.baseprofile.widget.toast;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daoba.cloudfitnesstest.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 说明
 *
 * @author Zhevol
 * @date 2018/3/27 0027
 */
class Toast extends FrameLayout {

    /**
     * dropdown duration
     */
    static final long DEFAULT_DURATION = 800;
    /**
     * show time
     */
    static final long DEFAULT_TIME = 300;

    /**
     * 长时播放
     */
    static final int LENGTH_LONG = 5000;

    /**
     * 短时展示
     */
    static final int LENGTH_SHORT = 3000;

    private static final String SERVICE_PARENT = "service_parent";
    private static Intent intent;
    private TextView messageTextView;
    private long time;
    private Interpolator enterInterpolator;
    private Interpolator exitInterpolator;
    private Position position;

    Toast(@NonNull Context context) {
        this(context, null);
    }

    Toast(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    Toast(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    /**
//     * show the toast in the app views.
//     *
//     * @param viewGroup 布局
//     * @param message   内容
//     * @param time      持续时间时间
//     * @return Toast
//     */
//    static Toast make(Position position, @NonNull ViewGroup viewGroup, String message, long time) {
//        Toast toast = (Toast) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_toast_message, viewGroup, false);
//        toast.setText(message);
//        toast.setPosition(position);
//        toast.setTime(time);
//        toast.setVisibility(INVISIBLE);
//        viewGroup.addView(toast);
//        return toast;
//    }

    /**
     * show the toast in the android window
     *
     * @param context 上下文
     * @param message 内容
     * @param time    持续时间
     * @return Toast
     */
    static Toast make(Position position, @NonNull Context context, String message, long time) {
        Toast toast = new Toast(context);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && MiUi8Judge.isMIUI8orLater()) {
            if (!Settings.canDrawOverlays(context)) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                        Uri.parse("package:" + context.getPackageName()));
                context.startActivity(intent);
                return toast;
            }
        }
        intent = new Intent(context, FloatWindowService.class);
        intent.putExtra("message", message);
        intent.putExtra("time", time > 0 ? time : DEFAULT_TIME);
        intent.putExtra("position", position);
        return toast;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        messageTextView = findViewById(R.id.tvToastMessage);
    }

    /**
     * 设置动画
     *
     * @param enterInterpolator 进入动画
     * @param exitInterpolator  退出动画
     * @return Toast
     */
    Toast setAnimationInterpolator(Interpolator enterInterpolator, Interpolator exitInterpolator) {
        this.enterInterpolator = enterInterpolator;
        this.exitInterpolator = exitInterpolator;
        return this;
    }

    /**
     * 设置动画
     *
     * @param enterInterpolator 进入动画
     * @return Toast 实例
     * @deprecated use {@link Toast#setAnimationInterpolator(Interpolator, Interpolator)} instead of it.
     */
    Toast setAnimationInterpolator(Interpolator enterInterpolator) {
        this.enterInterpolator = enterInterpolator;
        this.exitInterpolator = null;
        return this;
    }

    /**
     * 设置背景颜色
     *
     * @param color 背景颜色
     * @return Toast
     */
    Toast setBackground(int color) {
        if (color == 0) {
            return this;
        }
        if (intent != null) {
            intent.putExtra("backgroundColor", color);
        } else {
            setBackgroundColor(color);
        }
        return this;
    }

    /**
     * 设置持续时间
     *
     * @param position 位置
     */
    void setPosition(Position position) {
        this.position = position;

        if (position == Position.BOTTOM) {
            if (getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((LayoutParams) getLayoutParams()).gravity = Gravity.BOTTOM;
            } else if (getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) getLayoutParams()).addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            }
            setAnimationInterpolator(new LinearInterpolator(), null);
        } else {
            if (getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((LayoutParams) getLayoutParams()).gravity = Gravity.TOP;
            } else if (getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) getLayoutParams()).addRule(RelativeLayout.ALIGN_PARENT_TOP);
            }
            setAnimationInterpolator(new BounceInterpolator(), null);
        }
    }

    /**
     * 设置文本内容
     *
     * @param msg 内容
     */
    void setText(String msg) {
        if (messageTextView != null && !TextUtils.isEmpty(msg)) {
            messageTextView.setText(msg);
        }
    }

    /**
     * 设置文本颜色
     *
     * @param color 颜色
     * @return Toast
     */
    Toast setTextColor(int color) {
        if (color == 0) {
            return this;
        }
        if (intent != null) {
            intent.putExtra("textColor", color);
        } else {
            messageTextView.setTextColor(color);
        }
        return this;
    }

    /**
     * 设置持续时间
     *
     * @param time 持续时间
     */
    void setTime(long time) {
        if (time != 0) {
            this.time = time;
        }
    }

    /**
     * 立即显示
     */
    void show() {
        show(0);
    }

    /**
     * 展示Toast
     *
     * @param delay 延迟时间
     */
    void show(final long delay) {
        if (intent != null) {
            intent.putExtra("delay", delay);
            getContext().startService(intent);
            intent = null;
        } else {
            post(new Runnable() {
                @Override
                public void run() {
                    Toast.this.setVisibility(VISIBLE);
                    if (position == Position.BOTTOM) {
                        Toast.this.setY((getY() + getHeight()));
                    } else {
                        Toast.this.setY((getY() - getHeight()));
                    }
                }
            });
            postDelayed(new Runnable() {
                @Override
                public void run() {
                    Toast.this.animate().translationY(0).setDuration(DEFAULT_DURATION).setInterpolator(enterInterpolator == null ? new BounceInterpolator() : enterInterpolator).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationStart(Animator animation) {
                            super.onAnimationStart(animation);
                            Toast.this.setVisibility(VISIBLE);
                            if (Toast.this.getParent() instanceof View && SERVICE_PARENT.equals(((View) Toast.this.getParent()).getTag())) {
                                ((View) Toast.this.getParent()).setVisibility(VISIBLE);
                            }
                        }
                    }).start();
                }
            }, delay);
            if (time != -1) {
                postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.this.animate().translationY(position == Position.BOTTOM ? getHeight() : -getHeight()).setDuration(DEFAULT_DURATION).setInterpolator(exitInterpolator == null ? new AccelerateInterpolator() : exitInterpolator).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                                if (Toast.this.getParent() instanceof View
                                        && "service_parent".equals(((View) Toast.this.getParent()).getTag())) {
                                    ((View) Toast.this.getParent()).setVisibility(GONE);
                                }
                                if (Toast.this.getParent() instanceof ViewGroup) {
                                    ((ViewGroup) Toast.this.getParent()).removeView(Toast.this);
                                }
                            }
                        }).start();
                    }
                }, time > 0 ? delay + time + DEFAULT_DURATION : delay + DEFAULT_TIME + DEFAULT_DURATION);
            }
        }
    }

    /**
     * 显示的位置
     */
    enum Position {
        /**
         * 在顶部显示
         */
        TOP,
        /**
         * 在底部显示
         */
        BOTTOM,
    }

    /**
     * MiUi8 判断
     */
    private static class MiUi8Judge {

        private static Boolean MIUI8orLater;

        private static boolean isMIUI8orLater() {
            if (MIUI8orLater != null) {
                return MIUI8orLater;
            }
            String propName = "ro.miui.ui.version.name";
            String line = null;
            BufferedReader input = null;
            try {
                Process p = Runtime.getRuntime().exec("getprop " + propName);
                input = new BufferedReader(new InputStreamReader(p.getInputStream()), 1024);
                line = input.readLine();
                input.close();
            } catch (IOException ex) {
                MIUI8orLater = false;
            } finally {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException ignored) {
                    }
                }
            }
            if (line != null) {
                try {
                    int num = Integer.parseInt(line.replaceAll("[\\D]", ""));
                    MIUI8orLater = num >= 8;
                } catch (Exception e) {
                    MIUI8orLater = false;
                }
            } else {
                MIUI8orLater = false;
            }
            return MIUI8orLater;
        }
    }
}
