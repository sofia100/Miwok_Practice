package com.example.android.miwok;

public class Word {
    private int miwok,english;
    private int id=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int vid;

    public int getEnglish() {
        return english;
    }


    public int getId() {
        return id;
    }

    public int getMiwok() {
        return miwok;
    }


    public Word(int e,int m,int position)
    {
        english=e;
        miwok=m;
        vid = position;
    }

    public int getVid() {
        return vid;
    }


    public boolean hasImg()
    {
        return id!=NO_IMAGE_PROVIDED;
    }

    public Word(int e,int m,int imgId,int position)
    {
        id=imgId;
        vid = position;
        english=e;
        miwok=m;
    }
}
