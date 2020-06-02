package com.example.calcio.tab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.calcio.R;
import com.example.calcio.fragment.CalcFragment;
import com.example.calcio.fragment.HealthFragment;
import com.example.calcio.fragment.InfoFragment;
import com.example.calcio.fragment.PlaneGeometryFragment;
import com.example.calcio.fragment.SolidGeometryFragment;

public class MyAdapter extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3,
            R.string.tab_text_4, R.string.tab_text_5};
    private final Context mContext;

    public MyAdapter(FragmentManager fm, Context c){
        super(fm);
        mContext = c;
        double scale = c.getResources().getDisplayMetrics().density;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag= null;

        if(position ==0){
            frag = new CalcFragment();
        }else if(position == 1){
            frag = new PlaneGeometryFragment();
        }else if(position == 2){
            frag = new SolidGeometryFragment();
        }else if(position == 3){
            frag = new HealthFragment();
        }else if(position == 4){
            frag = new InfoFragment();
        }

        Bundle b = new Bundle();
        b.putInt("position", position);
        frag.setArguments(b);
        return frag;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString( TAB_TITLES[position] );
    }

    @Override
    public int getCount() {
        return 5;
    }
}

