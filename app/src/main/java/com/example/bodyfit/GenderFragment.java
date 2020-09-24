package com.example.bodyfit;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GenderFragment extends Fragment {

    Button mButtonMen, mButtonWomen;
    TextView mTextMen, mTextWomen;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gender, container, false);


        mButtonMen = v.findViewById(R.id.men_button);
        mButtonWomen = v.findViewById(R.id.women_button);
        mTextMen = v.findViewById(R.id.textViewMen);
        mTextWomen = v.findViewById(R.id.textViewWomen);

        mButtonMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButtonMen.setBackgroundResource(R.drawable.round_shape4);
                mTextMen.setTextColor(Color.parseColor("#9AF335"));
                mButtonWomen.setBackgroundResource(R.drawable.round_shape3);
                mTextWomen.setTextColor(Color.parseColor("#4E4444"));
                ((AskActivity)getActivity()).makeNextButtonGreen();
            }
        });

        mButtonWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButtonWomen.setBackgroundResource(R.drawable.round_shape4);
                mTextWomen.setTextColor(Color.parseColor("#9AF335"));
                mButtonMen.setBackgroundResource(R.drawable.round_shape3);
                mTextMen.setTextColor(Color.parseColor("#4E4444"));
                ((AskActivity)getActivity()).makeNextButtonGreen();
            }
        });

        return v;
    }


}