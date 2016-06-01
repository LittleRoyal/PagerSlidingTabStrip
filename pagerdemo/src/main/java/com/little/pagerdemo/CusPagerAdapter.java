package com.little.pagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class CusPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> list;

    private String[] titles;

    public CusPagerAdapter(FragmentManager fm, List<Fragment> pages, String[] titles) {

        super(fm);

        this.list = pages;
        this.titles = titles;
    }


    @Override
    public CharSequence getPageTitle(int position) {

        return this.titles[position];
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Fragment getItem(int arg0) {
        return list.get(arg0);
    }


    public void resetTitle(String[] titles) {
        this.titles = titles;
    }

}
