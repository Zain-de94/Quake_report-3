package com.example.android.quakereport;

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMillisecond;



    public Earthquake(Double magnitude , String location , long timeInMilliseconds)
    {
        mMagnitude= magnitude;
        mLocation = location;
        mTimeInMillisecond = timeInMilliseconds;
    }

    public Double getMagnitude()
    {
        return mMagnitude;
    }
    public String getLocation()
    {
        return mLocation;
    }
    public String getDate()
    {
        return mDate;
    }

    public long getTimeInMilliseconds()
    {
        return mTimeInMillisecond;
    }










}
