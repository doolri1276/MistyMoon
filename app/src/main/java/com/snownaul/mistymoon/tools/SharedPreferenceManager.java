package com.snownaul.mistymoon.tools;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceManager {

    public static String PREF="pref";

    public static String UUID="uuid";

    public static String getString(String key){
        final SharedPreferences prefs = App.getContext().getSharedPreferences(PREF,Context.MODE_PRIVATE);
        return prefs.getString(key,"");
    }

    public static void putString(String key, String value){
        final SharedPreferences prefs = App.getContext().getSharedPreferences(PREF, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }


}
