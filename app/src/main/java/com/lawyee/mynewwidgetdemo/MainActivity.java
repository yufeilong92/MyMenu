package com.lawyee.mynewwidgetdemo;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final int START_ITEM = Menu.FIRST;  //Menu.FIRST的值就是1
       private static final int OVER_ITEM = Menu.FIRST+1;
       private static final int SET_ITEM1 = Menu.FIRST+2;
       private static final int SET_ITEM2 = Menu.FIRST+3;
    @BindView(R.id.drawer_left)
    NavigationView drawerLeft;
    @BindView(R.id.activity_main)
    DrawerLayout activityMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menus,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
