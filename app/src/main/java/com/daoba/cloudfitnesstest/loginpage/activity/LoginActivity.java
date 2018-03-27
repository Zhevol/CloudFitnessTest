package com.daoba.cloudfitnesstest.loginpage.activity;

import com.daoba.cloudfitnesstest.R;
import com.daoba.cloudfitnesstest.baseprofile.activity.BaseActivity;
import com.irozon.sneaker.Sneaker;

/**
 * 登录界面
 *
 * @author Zhevol
 * @date 2018/3/27 0027
 */
public class LoginActivity extends BaseActivity {

    @Override
    protected int bindLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void bindViews() {
        super.bindViews();
    }

    @Override
    protected void onClick(int id) {
        super.onClick(id);
        switch (id) {
            case R.id.btnDemo:
                Sneaker.with(this)
                        .setTitle("Error!!", R.color.colorWhite)
                        .sneak(R.color.colorThemeBlue);
                break;
            default:
                break;
        }
    }
}
