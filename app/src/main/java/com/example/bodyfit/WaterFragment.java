package com.example.bodyfit;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class WaterFragment extends Fragment {

    Button mButton1, mButton2, mButton3, mButton4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_water, container, false);

        mButton1 = v.findViewById(R.id.button1);
        mButton2 = v.findViewById(R.id.button2);
        mButton3 = v.findViewById(R.id.button3);
        mButton4 = v.findViewById(R.id.button4);


        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toTrue(mButton1);
                toFalse(mButton2);
                toFalse(mButton3);
                toFalse(mButton4);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toFalse(mButton1);
                toTrue(mButton2);
                toFalse(mButton3);
                toFalse(mButton4);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toFalse(mButton1);
                toFalse(mButton2);
                toTrue(mButton3);
                toFalse(mButton4);
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toFalse(mButton1);
                toFalse(mButton2);
                toFalse(mButton3);
                toTrue(mButton4);
            }
        });

        return v;
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

}