package com.example.bodyfit;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FigureFragment extends Fragment {

    Button mSaveButton;
    EditText mEditTextAge, mEditTextHeight, mEditTextWeight;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_figure, container, false);

        mSaveButton = v.findViewById(R.id.saveButton);
        mEditTextAge = v.findViewById(R.id.editTextAge);
        mEditTextHeight = v.findViewById(R.id.editTextHeigh);
        mEditTextWeight = v.findViewById(R.id.editTextCurrentWeight);


        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((TextUtils.isEmpty(mEditTextAge.getText().toString())) || (TextUtils.isEmpty(mEditTextHeight.getText().toString())) || (TextUtils.isEmpty(mEditTextWeight.getText().toString())) ) {
                } else {
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    ((AskActivity)getActivity()).hideKeyboard();
                }
            }
        });

        return v;
    }

}