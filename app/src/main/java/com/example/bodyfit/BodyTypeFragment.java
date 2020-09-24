package com.example.bodyfit;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class BodyTypeFragment extends Fragment {

    ImageView mButtonEcto, mButtonMezo, mButtonEndo;
    TextView mTextViewEcto1, mTextViewMezo1, mTextViewEndo1;
    TextView mTextViewEcto2, mTextViewMezo2, mTextViewEndo2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_body_type, container, false);

        mButtonEcto = v.findViewById(R.id.ecto_image);
        mButtonMezo = v.findViewById(R.id.mezo_image);
        mButtonEndo = v.findViewById(R.id.endo_image);

        mTextViewEcto1 = v.findViewById(R.id.text_ecto1);
        mTextViewEcto2 = v.findViewById(R.id.text_ecto2);
        mTextViewMezo1 = v.findViewById(R.id.text_mezo1);
        mTextViewMezo2 = v.findViewById(R.id.text_mezo2);
        mTextViewEndo1 = v.findViewById(R.id.text_endo1);
        mTextViewEndo2 = v.findViewById(R.id.text_endo2);

        mButtonEcto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskActivity)getActivity()).makeNextButtonGreen();
                mButtonEcto.setImageResource(R.drawable.ecto_grin);
                mButtonMezo.setImageResource(R.drawable.mezo_grey);
                mButtonEndo.setImageResource(R.drawable.endo_grey);

                mTextViewEcto1.setTextColor(Color.parseColor("#9AF335"));
                mTextViewEcto2.setTextColor(Color.parseColor("#9AF335"));
                mTextViewMezo1.setTextColor(Color.parseColor("#382F2F"));
                mTextViewMezo2.setTextColor(Color.parseColor("#382F2F"));
                mTextViewEndo1.setTextColor(Color.parseColor("#382F2F"));
                mTextViewEndo2.setTextColor(Color.parseColor("#382F2F"));


            }
        });

        mButtonMezo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskActivity)getActivity()).makeNextButtonGreen();
                mButtonEcto.setImageResource(R.drawable.ecto_grey);
                mButtonMezo.setImageResource(R.drawable.mezo_grin);
                mButtonEndo.setImageResource(R.drawable.endo_grey);

                mTextViewEcto1.setTextColor(Color.parseColor("#382F2F"));
                mTextViewEcto2.setTextColor(Color.parseColor("#382F2F"));
                mTextViewMezo1.setTextColor(Color.parseColor("#9AF335"));
                mTextViewMezo2.setTextColor(Color.parseColor("#9AF335"));
                mTextViewEndo1.setTextColor(Color.parseColor("#382F2F"));
                mTextViewEndo2.setTextColor(Color.parseColor("#382F2F"));
            }
        });

        mButtonEndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskActivity)getActivity()).makeNextButtonGreen();
                mButtonEcto.setImageResource(R.drawable.ecto_grey);
                mButtonMezo.setImageResource(R.drawable.mezo_grey);
                mButtonEndo.setImageResource(R.drawable.endo_grin);

                mTextViewEcto1.setTextColor(Color.parseColor("#382F2F"));
                mTextViewEcto2.setTextColor(Color.parseColor("#382F2F"));
                mTextViewMezo1.setTextColor(Color.parseColor("#382F2F"));
                mTextViewMezo2.setTextColor(Color.parseColor("#382F2F"));
                mTextViewEndo1.setTextColor(Color.parseColor("#9AF335"));
                mTextViewEndo2.setTextColor(Color.parseColor("#9AF335"));
            }
        });

        return v;
    }

}