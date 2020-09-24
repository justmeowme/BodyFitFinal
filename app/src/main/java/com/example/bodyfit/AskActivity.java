package com.example.bodyfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Toast;

public class AskActivity extends AppCompatActivity {

    Button mNextButton;
    Button mButtonGender, mButtonWeight, mButtonFigure, mButtonBodyType, mButtonDay;
    Button mButtonHabits, mButtonSport, mButtonSleep, mButtonWater, mButtonRestrictions;

    HorizontalScrollView mBottomScrollView
            ;
    ConstraintLayout mLayout;

    private ViewPager mViewPager;

    //For fragments
    Integer flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask);

        mNextButton = findViewById(R.id.button_next_step);

        mLayout = findViewById(R.id.layout);
        mBottomScrollView = findViewById(R.id.scroll_bottom_menu);

        mViewPager = findViewById(R.id.container);
        mViewPager.beginFakeDrag();
        setupViewPager(mViewPager);

        //All bottom buttons
        mButtonGender = findViewById(R.id.button_gender);
        mButtonWeight = findViewById(R.id.button_weight);
        mButtonFigure = findViewById(R.id.button_figure);
        mButtonBodyType = findViewById(R.id.button_body_type);
        mButtonDay = findViewById(R.id.button_day);
        mButtonHabits = findViewById(R.id.button_habits);
        mButtonSport = findViewById(R.id.button_sport);
        mButtonSleep = findViewById(R.id.button_sleep);
        mButtonWater = findViewById(R.id.button_water);
        mButtonRestrictions = findViewById(R.id.button_restrictions);

        //Next Button
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag += 1;
                makeAllButtonsFalse();
                mViewPager.setCurrentItem(flag);
                makeNextButtonGrey();
                mBottomScrollView.scrollTo((int)mBottomScrollView.getScrollX() + 250, (int)mBottomScrollView.getScrollY());
            }
        });
    }



    public void makeNextButtonGrey(){
        mNextButton.setBackgroundResource(R.drawable.round_shape3);
        mNextButton.setEnabled(false);
        mNextButton.setTextColor(Color.parseColor("#4E4444"));
    }

    public void makeNextButtonGreen(){
        mNextButton.setBackgroundResource(R.drawable.round_shape1);
        mNextButton.setEnabled(true);
        mNextButton.setTextColor(Color.parseColor("#FFFFFF"));
    }

    private void setupViewPager(ViewPager viewPager){
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new GenderFragment());
        adapter.addFragment(new WeightFragment());
        adapter.addFragment(new FigureFragment());
        adapter.addFragment(new BodyTypeFragment());
        adapter.addFragment(new DayFragment());
        adapter.addFragment(new HabitsFragment());
        adapter.addFragment(new SportFragment());
        adapter.addFragment(new SleepFragment());
        adapter.addFragment(new WaterFragment());
        adapter.addFragment(new RestrictionsFragment());
        viewPager.setAdapter(adapter);
    }


    @SuppressLint("ResourceAsColor")
    public void makeAllButtonsFalse(){
        mButtonGender.setBackgroundResource(R.drawable.round_shape3);
        mButtonGender.setTextColor(Color.parseColor("#4E4444"));
        mButtonWeight.setBackgroundResource(R.drawable.round_shape3);
        mButtonWeight.setTextColor(Color.parseColor("#4E4444"));
        mButtonFigure.setBackgroundResource(R.drawable.round_shape3);
        mButtonFigure.setTextColor(Color.parseColor("#4E4444"));
        mButtonBodyType.setBackgroundResource(R.drawable.round_shape3);
        mButtonBodyType.setTextColor(Color.parseColor("#4E4444"));
        mButtonDay.setBackgroundResource(R.drawable.round_shape3);
        mButtonDay.setTextColor(Color.parseColor("#4E4444"));
        mButtonHabits.setBackgroundResource(R.drawable.round_shape3);
        mButtonHabits.setTextColor(Color.parseColor("#4E4444"));
        mButtonSport.setBackgroundResource(R.drawable.round_shape3);
        mButtonSport.setTextColor(Color.parseColor("#4E4444"));
        mButtonSleep.setBackgroundResource(R.drawable.round_shape3);
        mButtonSleep.setTextColor(Color.parseColor("#4E4444"));
        mButtonWater.setBackgroundResource(R.drawable.round_shape3);
        mButtonWater.setTextColor(Color.parseColor("#4E4444"));
        mButtonRestrictions.setBackgroundResource(R.drawable.round_shape3);
        mButtonRestrictions.setTextColor(Color.parseColor("#4E4444"));

        if (flag==1){
            mButtonWeight.setBackgroundResource(R.drawable.round_shape1);
            mButtonWeight.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (flag==2){
            mButtonFigure.setBackgroundResource(R.drawable.round_shape1);
            mButtonFigure.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (flag==3){
            mButtonBodyType.setBackgroundResource(R.drawable.round_shape1);
            mButtonBodyType.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (flag==4){
            mButtonDay.setBackgroundResource(R.drawable.round_shape1);
            mButtonDay.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (flag==5){
            mButtonHabits.setBackgroundResource(R.drawable.round_shape1);
            mButtonHabits.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (flag==6){
            mButtonSport.setBackgroundResource(R.drawable.round_shape1);
            mButtonSport.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (flag==7){
            mButtonSleep.setBackgroundResource(R.drawable.round_shape1);
            mButtonSleep.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (flag==8){
            mButtonWater.setBackgroundResource(R.drawable.round_shape1);
            mButtonWater.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (flag==9){
            mButtonRestrictions.setBackgroundResource(R.drawable.round_shape1);
            mButtonRestrictions.setTextColor(Color.parseColor("#FFFFFF"));
        }

    }

    public void hideKeyboard(){
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(mLayout.getWindowToken(), 0);
    }

}