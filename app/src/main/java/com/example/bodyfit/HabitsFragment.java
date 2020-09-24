package com.example.bodyfit;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class HabitsFragment extends Fragment {

    ImageView mButtonEat, mButtonNoSleep, mButtonSugar, mButtonDrink, mButtonSalt, mButtonNothing;
    TextView mTextViewEat, mTextViewNoSleep, mTextViewSugar, mTextViewDrink, mTextViewSalt, mTextViewNothing;

    Integer flag_eat = 0, flag_no_sleep = 0, flag_sugar = 0, flag_drink = 0, flag_salt = 0, flag_nothing = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_habits, container, false);

        mButtonEat = v.findViewById(R.id.button_eat);
        mTextViewEat = v.findViewById(R.id.textViewEat);
        mButtonNoSleep = v.findViewById(R.id.button_no_sleep);
        mTextViewNoSleep = v.findViewById(R.id.textViewNoSleep);
        mButtonSugar = v.findViewById(R.id.button_eat_sugar);
        mTextViewSugar = v.findViewById(R.id.textViewSugar);
        mButtonDrink = v.findViewById(R.id.button_drink);
        mTextViewDrink = v.findViewById(R.id.textViewDrink);
        mButtonSalt = v.findViewById(R.id.button_salt);
        mTextViewSalt = v.findViewById(R.id.textViewSalt);
        mButtonNothing = v.findViewById(R.id.button_nothing);
        mTextViewNothing = v.findViewById(R.id.textViewNothing);


        mButtonEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_eat==0){
                    toTrue(mButtonEat, mTextViewEat);
                    toFalse(mButtonNothing, mTextViewNothing);
                    flag_nothing = 0;
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag_eat = 1;
                }else{
                    toFalse(mButtonEat, mTextViewEat);
                    flag_eat = 0;
                    check();
                }
            }
        });

        mButtonNoSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_no_sleep==0){
                    toFalse(mButtonNothing, mTextViewNothing);
                    flag_nothing = 0;
                    toTrue(mButtonNoSleep, mTextViewNoSleep);
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag_no_sleep = 1;
                }else{
                    toFalse(mButtonNoSleep, mTextViewNoSleep);
                    flag_no_sleep = 0;
                    check();
                }
            }
        });

        mButtonSugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_sugar==0){
                    toFalse(mButtonNothing, mTextViewNothing);
                    flag_nothing = 0;
                    toTrue(mButtonSugar, mTextViewSugar);
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag_sugar = 1;
                }else{
                    toFalse(mButtonSugar, mTextViewSugar);
                    flag_sugar = 0;
                    check();
                }
            }
        });

        mButtonDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_drink==0){
                    toFalse(mButtonNothing, mTextViewNothing);
                    flag_nothing = 0;
                    toTrue(mButtonDrink, mTextViewDrink);
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag_drink = 1;
                }else{
                    toFalse(mButtonDrink, mTextViewDrink);
                    flag_drink = 0;
                    check();
                }
            }
        });

        mButtonSalt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_salt==0){
                    toFalse(mButtonNothing, mTextViewNothing);
                    flag_nothing = 0;
                    toTrue(mButtonSalt, mTextViewSalt);
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag_salt = 1;
                }else{
                    toFalse(mButtonSalt, mTextViewSalt);
                    flag_salt = 0;
                    check();
                }
            }
        });

        mButtonNothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_nothing==0){
                    toTrue(mButtonNothing, mTextViewNothing);
                    make_all_false();
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag_nothing = 1;
                }else{
                    toFalse(mButtonNothing, mTextViewNothing);
                    flag_nothing = 0;
                    check();
                }
            }
        });



        return v;
    }

    private void check(){
        if (flag_drink+flag_eat+flag_no_sleep+flag_nothing+flag_salt+flag_sugar==0){
            ((AskActivity)getActivity()).makeNextButtonGrey();
        }
    }

    private void make_all_false(){
        flag_sugar = 0;
        flag_salt = 0;
        flag_no_sleep = 0;
        flag_eat = 0;
        flag_drink = 0;
        toFalse(mButtonDrink, mTextViewDrink);
        toFalse(mButtonEat, mTextViewEat);
        toFalse(mButtonNoSleep, mTextViewNoSleep);
        toFalse(mButtonSalt, mTextViewSalt);
        toFalse(mButtonSugar, mTextViewSugar);
    }

    private void toTrue(ImageView button, TextView textView){
        button.setImageResource(R.drawable.square_grin);
        textView.setTextColor(Color.parseColor("#9AF335"));
    }

    private void toFalse(ImageView button, TextView textView){
        button.setImageResource(R.drawable.square_grey);
        textView.setTextColor(Color.parseColor("#4E4444"));
    }


}