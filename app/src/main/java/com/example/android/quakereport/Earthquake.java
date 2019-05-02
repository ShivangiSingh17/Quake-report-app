package com.example.android.quakereport;

/**
 * Created by mohamed on 8/27/17.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mUrl;
    private Long mTimeInMilliSeconds;

    public Earthquake(double magnitude, String place,String url, long timeInMilliSeconds) {
        this.mMagnitude = magnitude;
        this.mLocation = place;
        this.mUrl = url;
        this.mTimeInMilliSeconds = timeInMilliSeconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
