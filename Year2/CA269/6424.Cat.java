// package com.week05;

// This class cant do much. It can be created and printed.
public class Cat implements Polite
{
    private String name;
    
    public void hello()
    {
        System.out.println("Hello");
    }
    
    public Cat(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return "cat: " + name;
    }
}