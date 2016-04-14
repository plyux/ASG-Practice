package ua.com.solidpart.asg;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import ua.com.solidpart.asg.fragments.ForgotFragment;
import ua.com.solidpart.asg.fragments.LogInFragment;

public class Authorization extends AppCompatActivity implements View.OnClickListener{

    private ViewPager viewPager;
    private LinearLayout forgot;
    private LinearLayout send;
    private ForgotFragment forgotFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_autorization);

        forgotFragment = new ForgotFragment();

        send = (LinearLayout) findViewById(R.id.forgot2);
        send.setVisibility(View.INVISIBLE);

        viewPager = (ViewPager) findViewById(R.id.pager);
        /** set the adapter for ViewPager */
        viewPager.setAdapter(new SamplePagerAdapter(
                getSupportFragmentManager()));



        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                LinearLayout forgor_text = (LinearLayout) findViewById(R.id.ll);
                switch (position) {
                    case 0:
                        forgor_text.setVisibility(View.VISIBLE);
                        send.setVisibility(View.INVISIBLE);
                        if(forgot != null){
                            forgot.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 1:
                        forgor_text.setVisibility(View.INVISIBLE);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });



        TextView forget = (TextView)findViewById(R.id.MarqueeText);
        forget.setSelected(true);

    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId()){
            case R.id.recover_button:
                send.setVisibility(View.VISIBLE);
                forgot = (LinearLayout)findViewById(R.id.forgot1);
                forgot.setVisibility(View.INVISIBLE);
                viewPager.setCurrentItem(2);
                TextView mail_set = (TextView)findViewById(R.id.text_mail);
                EditText mail_get = (EditText)findViewById(R.id.get_mail);
                mail_set.setText(mail_get.getText());
                break;
        }
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
                    return forgotFragment;

            }
            return null;
        }



        @Override
        public int getCount() {
            return 2;
        }
    }




}
