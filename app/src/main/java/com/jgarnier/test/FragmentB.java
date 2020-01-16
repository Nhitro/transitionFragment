package com.jgarnier.test;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class FragmentB extends Fragment {

    private static final String TAG = FragmentB.class.getName();

    public FragmentB() {
        // Required empty public constructor
    }

    public static FragmentB newInstance() {
        return new FragmentB();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Nullable
    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        Animation animation= null;

        if (nextAnim != 0) {
            animation = AnimationUtils.loadAnimation(getContext(), nextAnim);
            String name = getResources().getResourceName(nextAnim);
            if (enter) {
                Log.d(TAG, String.format("enter avec l'animation : %s", name));
            } else {
                Log.d(TAG, String.format("popExit avec l'animation : %s", name));
            }

        }

        return animation;
    }
}
