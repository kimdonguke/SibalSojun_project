package com.example.sibalsojun_project.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sibalsojun_project.R;
import com.example.sibalsojun_project.ViewPagerAdapter;

public class ViewPagerActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
            tabLayout = findViewById(R.id.tabLayout);
            viewPager = findViewById(R.id.viewPager);
            mAdapter= new ViewPagerAdapter(getSupportFragmentManager());
            viewPager.setAdapter(mAdapter);
            tabLayout.setupWithViewPager(viewPager);
    }
}
