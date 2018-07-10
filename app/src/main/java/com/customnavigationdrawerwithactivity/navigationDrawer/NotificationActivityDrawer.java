package com.customnavigationdrawerwithactivity.navigationDrawer;

import android.os.Bundle;

import com.customnavigationdrawerwithactivity.R;


/**
 * Created by Krishan.Verma on 7/4/2018.
 */

public class NotificationActivityDrawer extends NavigationDrawerBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_activity);
        appBarTxt.setText("NotificationActivityDrawer");
    }


}
