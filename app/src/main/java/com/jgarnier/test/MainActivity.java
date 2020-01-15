package com.jgarnier.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import com.jgarnier.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        startFragmentA();
    }

    private void startFragmentA() {
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(binding.mainContainer.getId(), new FragmentA())
                .addToBackStack(null)
                .commit();
    }

    public void goToFragmentB(@NonNull View view){
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_in_right,R.anim.slide_out_left,R.anim.slide_in_left, R.anim.slide_out_right)
                .replace(binding.mainContainer.getId(), new FragmentB())
                .addToBackStack(null)
                .commit();
    }

    public void goBack(@NonNull View view){
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.popBackStack();
    }
}
