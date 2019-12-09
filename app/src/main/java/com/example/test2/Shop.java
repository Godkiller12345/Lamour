package com.example.test2;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Shop extends AppCompatActivity {

    private Toolbar shoptoolbar;
    private TabLayout shoptabLayout;
    private ViewPager shopviewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        shoptoolbar = (Toolbar) findViewById(R.id.Shop_Toolbar);
        shoptabLayout = (TabLayout) findViewById(R.id.Shop_TabLayout);
        shopviewPager = (ViewPager) findViewById(R.id.ShopViewPager);

        setSupportActionBar(shoptoolbar);
        setupViewPager(shopviewPager);

        shoptabLayout.setupWithViewPager(shopviewPager);
    }


    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new MoneyShop(), "課金商店");
        viewPagerAdapter.addFragment(new ScoreShop(), "積分商店");
        viewPager.setAdapter(viewPagerAdapter);

    }
}
