// package com.week05;

public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
    public boolean lessThan(Order other)
    {
        Point p = (Point) other;
        if (this.x == p.x){
            return this.y < p.y;
        } else {
            return this.x < p.x;
        }
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}