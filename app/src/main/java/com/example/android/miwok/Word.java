package com.example.android.miwok;

/**
 * Created by iffat on 10/6/17.
 */

public class Word {

    // States
    private String mDefaultTranslation;
    private String mUrduTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED; // Drawable resource ID
    private final static int NO_IMAGE_PROVIDED=-1;


    // Constructor
    public  Word (String defaultTranslation, String urduTranslation, int imageResourceId) {
        mDefaultTranslation=defaultTranslation;
        mUrduTranslation=urduTranslation;
        mImageResourceId=imageResourceId;
    }
    // Constructor
    public  Word(String defaultTranslation, String urduTranslation) {
        mDefaultTranslation=defaultTranslation;
        mUrduTranslation=urduTranslation;
    }

    // Methods
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getUrduTranslation(){
        return mUrduTranslation;
    }
    public int getImgResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
