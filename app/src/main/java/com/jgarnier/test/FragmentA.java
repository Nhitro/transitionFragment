package com.jgarnier.test;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class FragmentA extends Fragment {

    private static final String TAG = FragmentA.class.getName();

    public FragmentA() {
        // Required empty public constructor
    }

    public static FragmentA newInstance() {
        return new FragmentA();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmen
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Nullable
    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        Animation animation= null;

        if (nextAnim != 0) {
            animation = AnimationUtils.loadAnimation(getContext(), nextAnim);
            String name = getResources().getResourceName(nextAnim);
            if (enter) {
                Log.d(TAG, String.format("popEnter avec l'animation : %s", name));
            } else {
                Log.d(TAG, String.format("exit avec l'animation : %s", name));
            }

        }

        return animation;
    }
}
