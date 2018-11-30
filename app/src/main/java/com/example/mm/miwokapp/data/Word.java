package com.example.mm.miwokapp.data;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word (String defaultTranslation , String miwokTranslation, int audioResourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    public Word (String defaultTranslation , String miwokTranslation, int imageResourceID, int audioResourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceID;
        this.mAudioResourceId = audioResourceId;    }

    public String getmDefaultTranslation (){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int  getImageResource(){
        return mImageResourceId;
    }

    public boolean hasImage (){ return mImageResourceId != NO_IMAGE_PROVIDED;}

    public int getAudioResourceId (){ return mAudioResourceId;}
}
