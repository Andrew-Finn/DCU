// package com.week05;

public class Period
{
   // Private variables
   private Time start;
   private Time end;
   
   // Constructor (with two Time parameters)
   public Period(Time t1, Time t2)
   {
       start = t1;
       end = t2;
   }
   
   // overlaps(Period otherPeriod) // boolean method to check if two periods overlap
   public boolean overlaps(Period period2)
   {
       return this.end.isLater(period2.start) && period2.end.isLater(this.start);
   }
   
   // String toString() // return a String representation of the Period
   public String toString()
   {
       return this.start + " -> " + this.end;
   }
}