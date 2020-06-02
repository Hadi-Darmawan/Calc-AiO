package com.example.calcio.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.calcio.R;
import com.example.calcio.tab.MyAdapter;
import com.example.calcio.tab.SlidingTabLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import static com.example.calcio.R.id.btn_kurang;
import static com.example.calcio.R.id.view_offset_helper;

public class MainActivity extends AppCompatActivity {

    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Toolbar toolbar = findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        mViewPager= findViewById( R.id.vp_tabs );
        mViewPager.setAdapter(new MyAdapter(getSupportFragmentManager(), this) );

        mSlidingTabLayout= findViewById( R.id.st1_tabs );
        mSlidingTabLayout.setDistributeEvenly(true);
        mSlidingTabLayout.setBackgroundColor(getResources().getColor( R.color.colorSlidingTab ));
        mSlidingTabLayout.setSelectedIndicatorColors(getResources().getColor( R.color.colorSliding ));
        mSlidingTabLayout.setCustomTabView( R.layout.fragment_first, R.id.tv_tab);
        mSlidingTabLayout.setViewPager(mViewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected( item );
    }


    public void btn_0(View view) {
    }
}
