package com.example.android.quakereport;

public class Earthquake {
    private Double eMagnitude;
    private String eLocation;
    private long eDate;
    private String eUrl;
    public Earthquake(Double mag, String loc, long date, String url)
    {
        eMagnitude = mag;
        eLocation = loc;
        eDate = date;
        eUrl = url;
    }

    public Double getMagnitude() { return eMagnitude; }
    public String getLocation() { return eLocation; }
    public long getDate() { return eDate; }
    public String getUrl() { return eUrl; }

}
