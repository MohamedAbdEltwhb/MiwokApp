package com.example.mm.miwokapp.data;

import com.example.mm.miwokapp.R;

import java.util.ArrayList;
import java.util.List;

public final class Data {

    private static final List<Word> mNumbersFragmentData = new ArrayList<Word>(){{

        add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

    }};

    private static final List<Word> mColorsFragmentData = new ArrayList<Word>(){{

        add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));

    }};

    private static final List<Word> mFamilyFragmentData = new ArrayList<Word>(){{

        add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
        add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        add(new Word("son", "angsi", R.drawable.family_son, R.raw.family_son));
        add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        add(new Word("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        add(new Word("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        add(new Word("grandmother ", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        add(new Word("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));


    }};

    private static final List<Word> mPhrasesFragmentData = new ArrayList<Word>(){{

        add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        add(new Word("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        add(new Word("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));

    }};


    public static List<Word> getmNumbersFragmentData() {
        return mNumbersFragmentData;
    }

    public static List<Word> getmColorsFragmentData() {
        return mColorsFragmentData;
    }

    public static List<Word> getmFamilyFragmentData() {
        return mFamilyFragmentData;
    }

    public static List<Word> getmPhrasesFragmentData() {
        return mPhrasesFragmentData;
    }
}
