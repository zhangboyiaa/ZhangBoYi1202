package com.bawei.lianxi01.view.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.bawei.lianxi01.R;
import com.bawei.lianxi01.base.BaseActivity;
import com.bawei.lianxi01.view.fragment.HomeFragment;
import com.bawei.lianxi01.view.fragment.JieShaoFragment;
import com.bawei.lianxi01.view.fragment.MyFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {


    private ViewPager viewPager;
    private RadioGroup radioGroup;
    List<Fragment> list = new ArrayList<>();

    @Override
    protected void initData() {
        list.add(new HomeFragment());
        list.add(new JieShaoFragment());
        list.add(new MyFragment());

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return list.get(i);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio_btua:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.radio_btub:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.radio_btuc:
                        viewPager.setCurrentItem(2);
                        break;
                }
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                radioGroup.check(radioGroup.getChildAt(i).getId());
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @Override
    protected void initView() {
        viewPager = findViewById(R.id.viewpager);
        radioGroup = findViewById(R.id.radio_group);
    }

    public void tiao(){
        viewPager.setCurrentItem(2);
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }
}
