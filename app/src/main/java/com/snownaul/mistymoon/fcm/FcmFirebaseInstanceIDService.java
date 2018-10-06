package com.snownaul.mistymoon.fcm;

import com.google.firebase.iid.FirebaseInstanceIdService;
import com.snownaul.mistymoon.tools.BaseTool;

public class FcmFirebaseInstanceIDService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        BaseTool.getFcmToken();


    }
}
