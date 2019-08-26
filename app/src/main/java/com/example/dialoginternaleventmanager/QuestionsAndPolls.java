package com.example.dialoginternaleventmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class QuestionsAndPolls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_and_polls);

    }

    public void changeFragment(View view) {
        Fragment fragment;

        if(view == findViewById(R.id.btnQues)){
            fragment = new Fragment();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragQuesAndPolls, fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.btnPolls)){
            fragment = new Fragment();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragQuesAndPolls, fragment);
            ft.commit();
        }
    }
}
