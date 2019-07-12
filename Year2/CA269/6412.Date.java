// package com.week05;

public class Date
{
    private int day;
    private int month;
    private int year;

    public Date(int d, int m , int y){
        day = d;
        month = m;
        year = y;
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}