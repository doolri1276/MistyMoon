package com.snownaul.mistymoon.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.iid.FirebaseInstanceId;
import com.snownaul.mistymoon.R;
import com.snownaul.mistymoon.tools.BaseTool;
import com.snownaul.mistymoon.tools.MovingTool;

public class IntroActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //서버 점검 확인 메소드
        checkServerUpdate();

        //앱 업데이트 확인 메소드
        checkRequireAppUpdate();

        //자동 SNS로그인 체크
        doSnsLogin();


    }

    /*
    * 서버 점검을 체크하는 메소드
    * */
    private void checkServerUpdate() {

    }

    /*
    * 앱 업데이트 확인 메소드
    * */
    private void checkRequireAppUpdate() {

    }

    /*
    * SNS 자동 로그인 하는 곳
    * */
    private void doSnsLogin(){

        String fcmToken = BaseTool.getFcmToken();
        String uuid = BaseTool.getUuid();

        BaseTool.log("fcmData","fcm : ["+fcmToken+"], uuid : ["+uuid+"]");

    }



    /*
    * 자동 로그인 실패시 이동하는 곳
    * */
    public void goToLoginActivity(View v){
        MovingTool.goToLoginActivity();
    }

    public void goToMainActivity(View v){
        MovingTool.goToMainActivity();
    }
}
