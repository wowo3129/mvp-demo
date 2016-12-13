package com.ydong.android.mvp_login.biz;

/**
 * Created by yangdong on 2016/12/13.
 * model 接口
 */

public interface IUserBiz {
    void login(String name, String pwd, IUserloginListener iUserloginListener);
}
