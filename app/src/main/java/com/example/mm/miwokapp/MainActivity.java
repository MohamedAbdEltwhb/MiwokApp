package com.example.mm.miwokapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startWordsActivity(View view) {
        int view1 = view.getId();
        switch (view1){
            case R.id.numbersFrameLayout:
                getID(view1);
                break;

            case R.id.familyFrameLayout:
                getID(view1);
                break;

            case R.id.colorFrameLayout:
                getID(view1);
                break;

            case R.id.phrasesFrameLayout:
                getID(view1);
                break;
        }

    }

    private void getID (int id){
        Intent intent = new Intent(this,WordMainActivity.class);
        intent.putExtra("frameLayout1", id);
        startActivity(intent);
    }
}
