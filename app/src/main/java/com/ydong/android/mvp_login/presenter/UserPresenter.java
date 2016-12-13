package com.ydong.android.mvp_login.presenter;


import com.ydong.android.mvp_login.biz.IUserBiz;
import com.ydong.android.mvp_login.biz.IUserloginListener;
import com.ydong.android.mvp_login.biz.UserBiz;
import com.ydong.android.mvp_login.view.IUserView;

/**
 * Created by yangdong on 2016/12/13.
 * UserPresenter：作为model和view的调度中心
 */
public class UserPresenter {//通过持有view和model的接口引用部分来充当这个中间桥梁。
    IUserView iUserView;//view的抽象部分
    IUserBiz iUserBiz;//model的抽象部分

    public UserPresenter(IUserView iUserView) {//
        this.iUserView=iUserView;
        this.iUserBiz=new UserBiz();
    }

public  void login(){
        String userName = iUserView.getUserName();//通过回调方式获取username
        String userPwd = iUserView.getUserPwd();//通过回调方式获取userpwd

        iUserBiz.login(userName, userPwd, new IUserloginListener() {//model
            /*
            * IUserloginListener接口的回调方法loginSuccess，
            */
            @Override
            public void loginSuccess() {
                iUserView.loginSuccess();//回调
            }
            /*
            * IUserloginListener接口的回调方法loginFailed，
            */
            @Override
            public void loginFailed() {
                iUserView.loginFailed();
            }
        });//匿名内部类作为参数传递进去
    }
}
