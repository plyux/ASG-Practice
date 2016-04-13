package ua.com.solidpart.asg;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import ua.com.solidpart.asg.fragments.ForgotFragment;
import ua.com.solidpart.asg.fragments.LogInFragment;
import ua.com.solidpart.asg.fragments.MessegeSend;

public class Authorization extends AppCompatActivity implements View.OnClickListener{

    ViewPager viewPager;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_autorization);

        viewPager = (ViewPager) findViewById(R.id.pager);
        /** set the adapter for ViewPager */
        viewPager.setAdapter(new SamplePagerAdapter(
                getSupportFragmentManager()));

        but = (Button)findViewById(R.id.recover_button);


        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
                switch (position) {
                    case 0:
                        ll.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        ll.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        ll.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        TextView tv = (TextView)findViewById(R.id.MarqueeText);
        tv.setSelected(true);

    }

    @Override
    public void onClick(View v) {
        viewPager.setCurrentItem(2);
    }

    public class SamplePagerAdapter extends FragmentPagerAdapter {

        public SamplePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            /** Show a Fragment based on the position of the current screen */

            switch (position){
                case 0:
                    return new LogInFragment();
                case 1:
                    return new ForgotFragment();
                case 2:
                    return new MessegeSend();

            }
            return null;
        }



        @Override
        public int getCount() {
            // Show 2 total pages.
            return 3;
        }
    }




}
