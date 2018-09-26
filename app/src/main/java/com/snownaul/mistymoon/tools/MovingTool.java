package com.snownaul.mistymoon.tools;

import android.content.Intent;
import android.support.v4.content.ContextCompat;

import com.snownaul.moonfog.activities.MainActivity;

public class MovingTool {

    public static void goToMainActivity(){
        Intent intent = new Intent(App.getContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getContext(), intent, null);
    }
}
