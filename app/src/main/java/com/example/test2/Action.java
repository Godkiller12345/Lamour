package com.example.test2;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Action extends AppCompatActivity {

    private Toolbar actiontoolbar;
    private TabLayout actiontabLayout;
    private ViewPager actionviewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        actiontoolbar = (Toolbar) findViewById(R.id.action_Toolbar);
        actiontabLayout = (TabLayout) findViewById(R.id.action_TabLayout);
        actionviewPager = (ViewPager) findViewById(R.id.ActionViewPager);

        setSupportActionBar(actiontoolbar);
        setupViewPager(actionviewPager);

        actiontabLayout.setupWithViewPager(actionviewPager);
    }


    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new CharacterOne(), "角色1");
        viewPagerAdapter.addFragment(new CharacterTwo(), "角色2");
        viewPager.setAdapter(viewPagerAdapter);

    }
}
