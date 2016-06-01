package com.little.pagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.little.pager.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongate on 2016/5/31.
 */
public class PagerSlidingActivity extends FragmentActivity {
    private ViewPager viewpager;
    private PagerSlidingTabStrip tabs;

    private final String[] titles = {"北京", "上海", "广州", "深圳"};
    private Fragment contentFragment, sickFragment, medicineFragment, productFragment;
    private List<Fragment> pages = new ArrayList<Fragment>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagertab);
        findViews();
    }

    private void findViews() {
        viewpager= (ViewPager) findViewById(R.id.label_pager);
        tabs= (PagerSlidingTabStrip) findViewById(R.id.label_tabs);
        if (contentFragment == null) {
            contentFragment = new Fragment1();
        }
        if (sickFragment == null) {
            sickFragment = new Fragment2();
        }
        if (medicineFragment == null) {
            medicineFragment = new Fragment3();
        }
        if (productFragment == null) {
            productFragment = new Fragment4();
        }
        pages.add(contentFragment);
        pages.add(sickFragment);
        pages.add(medicineFragment);
        pages.add(productFragment);
        viewpager.setAdapter(new CusPagerAdapter(getSupportFragmentManager(), pages, titles));
        viewpager.setOffscreenPageLimit(3);

        //初始化 默认显示哪个
        viewpager.setCurrentItem(0);
        tabs.setViewPager(viewpager);
    }

}
