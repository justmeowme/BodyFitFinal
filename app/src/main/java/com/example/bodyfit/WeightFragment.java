package com.example.bodyfit;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Context.INPUT_METHOD_SERVICE;
import static androidx.core.content.ContextCompat.getSystemService;


public class WeightFragment extends Fragment {

    EditText mWeight;
    Button mSaveButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_weight, container, false);

        mWeight = v.findViewById(R.id.editTextWeight);
        mSaveButton = v.findViewById(R.id.saveButton);


        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(mWeight.getText().toString())) {
                } else {
                    ((AskActivity)getActivity()).makeNextButtonGreen();
                    ((AskActivity)getActivity()).hideKeyboard();
                }
            }
        });

        return v;
    }

}