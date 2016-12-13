package com.ydong.android.mvp_login.biz;

/**
 * Created by yangdong on 2016/12/13.
 * 抽取回调接口
 */

public interface IUserloginListener {
    void loginSuccess();
    void loginFailed();
}
