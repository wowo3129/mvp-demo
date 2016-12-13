package com.ydong.android.mvp_login.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ydong.android.mvp_login.R;
import com.ydong.android.mvp_login.presenter.UserPresenter;


public class MainActivity extends AppCompatActivity implements IUserView{

    private EditText name;
    private EditText pwd;
    private Button login;
    UserPresenter userPresenter = new UserPresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userPresenter.login();//Presenter和View之间， view可以完全调用presenter，
            }
        });

    }

    private void initDatas() {
        name = (EditText) findViewById(R.id.name);
        pwd = (EditText) findViewById(R.id.pwd);
        login = (Button) findViewById(R.id.login);
    }
    //回调函数
    @Override
    public String getUserName() {
        return name.getText().toString();
    }
    //回调函数
    @Override
    public String getUserPwd() {
        return pwd.getText().toString();
    }
    //回调函数
    @Override
    public void loginSuccess() {
        Toast.makeText(this, "login Success", Toast.LENGTH_SHORT).show();
    }
    //回调函数
    @Override
    public void loginFailed() {
        Toast.makeText(this, "login Failed", Toast.LENGTH_SHORT).show();
    }

}
