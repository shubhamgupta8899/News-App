package com.newsapp.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mHome, mHealth, mEntertenment, mScience, mSports, mTechnology, mBusiness, mGeneral;

    PagerAdapter pagerAdapter;
    Toolbar mtoolbar ;
    String api = "fca70eb36eca402d917c6ffe74337820";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar = findViewById(R.id.toolBar);
        setSupportActionBar(mtoolbar);

        mHome = findViewById(R.id.home);

        mHealth = findViewById(R.id.health);

        mEntertenment = findViewById(R.id.Entertenment);

        mTechnology = findViewById(R.id.Technology);

        mScience = findViewById(R.id.Science);

        mSports = findViewById(R.id.sports);

        mBusiness = findViewById(R.id.Business);

        mGeneral = findViewById(R.id.General);

        ViewPager viewPager = findViewById(R.id.fragmentContainer);
        tabLayout = findViewById(R.id.include);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),8);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition() == 2 || tab.getPosition() == 3 || tab.getPosition() == 4 || tab.getPosition() == 5 || tab.getPosition() == 6 || tab.getPosition() == 7){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}