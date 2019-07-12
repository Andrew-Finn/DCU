// package com.week05;

public class Point
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }
   
   public Point midPoint(Point p2)
   {
       Double x = ((this.x + p2.x) / 2);
       Double y = ((this.y + p2.y) / 2);
       return new Point(x, y);
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
}