package com.k3mshiro.finalproject.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.k3mshiro.finalproject.R;

/**
 * Created by k3mshiro on 4/17/17.
 */

public class MainFrg1 extends Fragment {

    private View rootView;

    public MainFrg1() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_1_main, container, false);
        return rootView;
    }
}
