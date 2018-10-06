package com.snownaul.mistymoon.tools;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

public class BaseTool {

    private static String fcmToken;
    private static String uuid;


    public static String getFcmToken() {
        if (fcmToken==null||fcmToken.equals("null")||fcmToken.isEmpty()) {
            fcmToken = FirebaseInstanceId.getInstance().getToken();
            SharedPreferenceManager.putString(SharedPreferenceManager.FCM,fcmToken);
        }
        return fcmToken;
    }

    public static String getUuid() {

        //현재 BaseTool의 uuid를 가져옵니다.
        if(uuid==null||uuid.isEmpty()){

            //SharedPreference에 저장된 uuid가 있는지 확인하고 있다면 그것을 가져옵니다.
            uuid = SharedPreferenceManager.getString(SharedPreferenceManager.UUID);

            if (uuid==null||uuid.isEmpty()) {
                uuid= Settings.Secure.getString(App.getContext().getContentResolver(), Settings.Secure.ANDROID_ID);
                SharedPreferenceManager.putString(SharedPreferenceManager.UUID,uuid);
            }
        }

        return uuid;

    }

    public static void log(String tag, String message){
        Log.w(tag,message);
    }

    public static void error(String tag, String message){
        Log.e(tag, message);
    }
}
