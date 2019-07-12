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

    public Date(){
        day = 1;
        month = 1;
        year = 2000;
    }

    public Date(String s){
        String [] dmy;
        dmy = s.split(" ");
        day = Integer.parseInt(dmy[0]);
        month = Integer.parseInt(dmy[1]);
        year = Integer.parseInt(dmy[2]);
    }

    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}