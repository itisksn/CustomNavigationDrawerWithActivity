package com.customnavigationdrawerwithactivity.navigationDrawer;

import android.os.Bundle;

import com.customnavigationdrawerwithactivity.R;


/**
 * Created by Krishan.Verma on 7/4/2018.
 */

public class HomeActivityDrawer extends NavigationDrawerBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        appBarTxt.setText("HomeActivityDrawer");
    }


}
