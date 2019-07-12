// package com.week05;

public class Time
{
   // Private variables
   private String time;
   private String hours;
   private String minutes;
   
   // Constructor (with a String parameter)
   public Time(String t)
   {
       time = t;
       hours = time.substring(0,2);
       minutes = time.substring(2);
   }
   
   // isLater(Time otherTime) // boolean method to compare two times
   public boolean isLater(Time t2)
   {
       return Integer.parseInt(this.time) >+ Integer.parseInt(t2.time); 
   }
   
   // String toString() // return a String representation of the time (hh:mm)
   public String toString()
   {
       return this.hours + ":" + this.minutes;
   }
}