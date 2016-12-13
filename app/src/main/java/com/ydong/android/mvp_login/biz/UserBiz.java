package com.ydong.android.mvp_login.biz;

/**
 * Created by yangdong on 2016/12/13.
 */

public class UserBiz implements IUserBiz {
    @Override
    public void login(String name, String pwd, IUserloginListener iUserloginListener) {//Presenter处传参数
        if(!"".equals(name) && !"".equals(pwd)){
            iUserloginListener.loginSuccess();//匿名接口的回调
        }else{
            iUserloginListener.loginFailed();//匿名接口的回调
        }
    }
}
