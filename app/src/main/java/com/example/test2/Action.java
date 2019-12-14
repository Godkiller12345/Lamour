package com.example.test2;


import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Action extends AppCompatActivity {

    int role = 0;

    private Toolbar actiontoolbar;
    private TabLayout actiontabLayout;
    private ViewPager actionviewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("請選擇角色");
        final String[] items = {"瑜荃","薄燕","艿妹"};
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                role = which;
                Toast.makeText(Action.this,items[which],Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
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
        viewPagerAdapter.addFragment(new Dialog(), "聊天");
        viewPagerAdapter.addFragment(new Custom(), "自訂");
        viewPager.setAdapter(viewPagerAdapter);

    }
}
