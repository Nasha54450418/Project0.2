package cn.edu.cqu.caijimovie.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.edu.cqu.caijimovie.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends MyFragment {


    public SignUpFragment() {
        super("Sign Up");
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

}