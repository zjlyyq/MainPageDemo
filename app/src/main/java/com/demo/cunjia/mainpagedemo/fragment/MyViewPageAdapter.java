package com.demo.cunjia.mainpagedemo.fragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.demo.cunjia.mainpagedemo.R;

import java.util.ArrayList;


public class MyViewPageAdapter extends PagerAdapter {
    private ArrayList<View> mList = new ArrayList<>();
    private Context mContext;
    public  MyViewPageAdapter(Context context){
        this.mContext = context;
        for(int i = 0;i < 3;i ++){
            ImageView imageView = new ImageView(mContext);
            if (i == 0){
                imageView.setImageResource(R.drawable.lunbo1);
            }
            if (i == 1){
                imageView.setImageResource(R.drawable.lunbo2);
            }
            if (i == 2){
                imageView.setImageResource(R.drawable.lunbo3);
            }
            mList.add(imageView);
            Log.d("zjl","开始插入");
        }
    }
    @Override
    public int getCount() {
        return 100000;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(mList.get(position%3));
        return mList.get(position);
    }
}

