package com.example.mm.miwokapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mm.miwokapp.fragments.ColorsFragment;
import com.example.mm.miwokapp.fragments.FamilyFragment;
import com.example.mm.miwokapp.fragments.NumbersFragment;
import com.example.mm.miwokapp.fragments.PhrasesFragment;

public class WordMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_main);

        Intent intent = getIntent();

        int id = intent.getIntExtra("frameLayout1", 0);

        if(savedInstanceState == null) {

            switch (id) {
                case R.id.frameLayout2:
                    NumbersFragment numbersFragment = new NumbersFragment();
                    getSupportFragmentManager().beginTransaction().add(R.id.contaner, numbersFragment).commit();
                    break;

                case R.id.frameLayout3:
                    FamilyFragment familyFragment = new FamilyFragment();
                    getSupportFragmentManager().beginTransaction().add(R.id.contaner, familyFragment).commit();
                    break;

                case R.id.frameLayout5:
                    ColorsFragment colorsFragment = new ColorsFragment();
                    getSupportFragmentManager().beginTransaction().add(R.id.contaner, colorsFragment).commit();
                    break;

                case R.id.frameLayout7:
                    PhrasesFragment phrasesFragment = new PhrasesFragment();
                    getSupportFragmentManager().beginTransaction().add(R.id.contaner, phrasesFragment).commit();
                    break;


            }
        }

    }
}
