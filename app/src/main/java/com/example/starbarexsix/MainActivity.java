package com.example.starbarexsix;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jaeger.library.StatusBarUtil;

public class MainActivity extends AppCompatActivity {
    private Button mBtnSetColorForSwipeBack;
    private DrawerLayout mDrawerLayout;
    private Toolbar mToolbar;
    private int mStatusBarColor;
    private int mAlpha = StatusBarUtil.DEFAULT_STATUS_BAR_ALPHA;
    private ViewGroup contentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        contentLayout = findViewById(R.id.main);
        mToolbar = findViewById(R.id.toolbar);
        mBtnSetColorForSwipeBack = findViewById(R.id.btn_set_color_for_swipe_back);
        setSupportActionBar(mToolbar);
        mBtnSetColorForSwipeBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SwipeBackActivity.class);
                startActivity(intent);
            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        mDrawerLayout.setDrawerListener(toggle);
        toggle.syncState();
    }
}
