package com.example.bodyfit;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class DayFragment extends Fragment {

    ImageView mButtonOffice, mButtonWalk, mButtonWork, mButtonHome;
    TextView mTextViewOffice, mTextViewWalk, mTextViewWork, mTextViewHome;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_day, container, false);

        mButtonOffice = v.findViewById(R.id.button_office);
        mButtonWalk = v.findViewById(R.id.button_walk);
        mButtonWork = v.findViewById(R.id.button_work);
        mButtonHome = v.findViewById(R.id.button_home);

        mTextViewOffice = v.findViewById(R.id.textViewOffice);
        mTextViewWalk = v.findViewById(R.id.textViewWalk);
        mTextViewWork = v.findViewById(R.id.textViewWork);
        mTextViewHome = v.findViewById(R.id.textViewHome);

        mButtonOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskActivity)getActivity()).makeNextButtonGreen();
                mButtonOffice.setImageResource(R.drawable.square_grin);
                mButtonWalk.setImageResource(R.drawable.square_grey);
                mButtonWork.setImageResource(R.drawable.square_grey);
                mButtonHome.setImageResource(R.drawable.square_grey);

                mTextViewOffice.setTextColor(Color.parseColor("#9AF335"));
                mTextViewWalk.setTextColor(Color.parseColor("#4E4444"));
                mTextViewWork.setTextColor(Color.parseColor("#4E4444"));
                mTextViewHome.setTextColor(Color.parseColor("#4E4444"));
            }
        });

        mButtonWalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskActivity)getActivity()).makeNextButtonGreen();
                mButtonOffice.setImageResource(R.drawable.square_grey);
                mButtonWalk.setImageResource(R.drawable.square_grin);
                mButtonWork.setImageResource(R.drawable.square_grey);
                mButtonHome.setImageResource(R.drawable.square_grey);

                mTextViewOffice.setTextColor(Color.parseColor("#4E4444"));
                mTextViewWalk.setTextColor(Color.parseColor("#9AF335"));
                mTextViewWork.setTextColor(Color.parseColor("#4E4444"));
                mTextViewHome.setTextColor(Color.parseColor("#4E4444"));
            }
        });

        mButtonWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskActivity)getActivity()).makeNextButtonGreen();
                mButtonOffice.setImageResource(R.drawable.square_grey);
                mButtonWalk.setImageResource(R.drawable.square_grey);
                mButtonWork.setImageResource(R.drawable.square_grin);
                mButtonHome.setImageResource(R.drawable.square_grey);

                mTextViewOffice.setTextColor(Color.parseColor("#4E4444"));
                mTextViewWalk.setTextColor(Color.parseColor("#4E4444"));
                mTextViewWork.setTextColor(Color.parseColor("#9AF335"));
                mTextViewHome.setTextColor(Color.parseColor("#4E4444"));
            }
        });

        mButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskActivity)getActivity()).makeNextButtonGreen();
                mButtonOffice.setImageResource(R.drawable.square_grey);
                mButtonWalk.setImageResource(R.drawable.square_grey);
                mButtonWork.setImageResource(R.drawable.square_grey);
                mButtonHome.setImageResource(R.drawable.square_grin);

                mTextViewOffice.setTextColor(Color.parseColor("#4E4444"));
                mTextViewWalk.setTextColor(Color.parseColor("#4E4444"));
                mTextViewWork.setTextColor(Color.parseColor("#4E4444"));
                mTextViewHome.setTextColor(Color.parseColor("#9AF335"));
            }
        });


        return v;
    }

}