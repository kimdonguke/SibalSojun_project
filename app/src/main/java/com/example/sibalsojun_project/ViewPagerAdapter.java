package com.example.sibalsojun_project;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> list;
    String[] title=new String[]{"Borrow","Alert","connect","setting"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        list = new ArrayList<>();
        //list.add(fragment)로 사용 가능
    }
    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
