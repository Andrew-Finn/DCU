// package com.week05;

import java.lang.Math;
public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY){
        x = newX;
        y = newY;
    }
    
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    
    public boolean lessThan(Order other)
    {
    	Point p = (Point) other;
    	if(Math.sqrt(Math.pow((x), 2) + Math.pow((y), 2)) < Math.sqrt(Math.pow((p.x), 2) + Math.pow((p.y), 2)))
    		return true;
    	return false;  	
    }
}