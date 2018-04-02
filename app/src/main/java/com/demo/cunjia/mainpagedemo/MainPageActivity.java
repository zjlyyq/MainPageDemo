package com.demo.cunjia.mainpagedemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.cunjia.mainpagedemo.fragment.FoodFragment;
import com.demo.cunjia.mainpagedemo.fragment.ViewPageFragment;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fg = fm.findFragmentById(R.id.fragment_container);
        Fragment fg2 = fm.findFragmentById(R.id.fragment_viewPage);
        /*如果fg为空，则创建一个*/
        if (fg == null){
            fg = FoodFragment.newInstance(2);
            fm.beginTransaction().add(R.id.fragment_container,fg).commit();
        }
        if (fg2 == null){
            fg2 = ViewPageFragment.newInstance("1","1");
            fm.beginTransaction().add(R.id.fragment_viewPage,fg2).commit();
        }
    }
}
