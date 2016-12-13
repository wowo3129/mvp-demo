package com.ydong.android.mvp_login.view;

/**
 * Created by yangdong on 2016/12/13.
 */

public interface IUserView {

     String getUserName();
     String getUserPwd();
     void loginSuccess();
     void loginFailed();
}
