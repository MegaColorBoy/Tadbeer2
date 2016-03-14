package com.heba.tadbeer.Util;

import android.app.Application;
import android.content.Context;

import com.heba.tadbeer.classes.User;

public class Tbr extends Application {
    private static  ApiHelper apiHelper;
    private static DBHelper dbHelper;
    private static User me;

    public ApiHelper getApiHelper() {
        apiHelper = (apiHelper == null) ? new ApiHelper(this, null) : this.apiHelper;
        return apiHelper;
    }

    public static DBHelper getDbHelper(Context context) {
        dbHelper = (apiHelper == null) ? new DBHelper(context, null, null, 1) : dbHelper;
        return dbHelper;
    }

    public static User getMe() {
        return me;
    }

    public static void setMe(User me) {
        Tbr.me = me;
    }
}
