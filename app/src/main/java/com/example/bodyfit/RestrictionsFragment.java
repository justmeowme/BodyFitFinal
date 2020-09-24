package com.example.bodyfit;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RestrictionsFragment extends Fragment {

    Integer flag1=0, flag2=0, flag3=0, flag4=0, flag5=0;
    Button mButton1, mButton2, mButton3, mButton4, mButton5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_restrictions, container, false);

        mButton1 = v.findViewById(R.id.button1);
        mButton2 = v.findViewById(R.id.button2);
        mButton3 = v.findViewById(R.id.button3);
        mButton4 = v.findViewById(R.id.button4);
        mButton5 = v.findViewById(R.id.button5);


        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag1==0){
                    toTrue(mButton1);
                    toFalse(mButton5);
                    flag5 = 0;
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag1 = 1;
                }else{
                    toFalse(mButton1);
                    flag1 = 0;
                    check();
                }
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag2==0){
                    toTrue(mButton2);
                    toFalse(mButton5);
                    flag5 = 0;
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag2 = 1;
                }else{
                    toFalse(mButton2);
                    flag2 = 0;
                    check();
                }
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag3==0){
                    toTrue(mButton3);
                    toFalse(mButton5);
                    flag5 = 0;
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag3 = 1;
                }else{
                    toFalse(mButton3);
                    flag3 = 0;
                    check();
                }
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag4==0){
                    toTrue(mButton4);
                    toFalse(mButton5);
                    flag5 = 0;
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag4 = 1;
                }else{
                    toFalse(mButton4);
                    flag4 = 0;
                    check();
                }
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag5==0){
                    make_all_false();
                    toTrue(mButton5);
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    flag5 = 1;
                }else{
                    toFalse(mButton5);
                    flag5 = 0;
                    check();
                }
            }
        });

        return v;
    }

    private void check(){
        if (flag1+flag2+flag3+flag4+flag5==0){
            ((AskActivity)getActivity()).makeNextButtonGrey();
        }
    }

    private void toTrue(Button mButton){
        ((AskActivity)getActivity()).makeNextButtonGreen();
        mButton.setBackgroundResource(R.drawable.round_shape4);
        mButton.setTextColor(Color.parseColor("#9AF335"));
    }

    private void toFalse(Button mButton){
        mButton.setBackgroundResource(R.drawable.round_shape3);
        mButton.setTextColor(Color.parseColor("#4E4444"));
    }

    private void make_all_false(){
        flag1 = 0;
        flag2 = 0;
        flag3 = 0;
        flag4 = 0;
        flag5 = 0;
        toFalse(mButton1);
        toFalse(mButton2);
        toFalse(mButton3);
        toFalse(mButton4);
        toFalse(mButton5);
    }


}