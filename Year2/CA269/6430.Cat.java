// package com.week05;

public class Cat implements Order
{
    private String name;
    
    public Cat(String n){
        name = n;
    }
    
    public String toString(){
        return "Cat: " + name;
    }
    
    public boolean lessThan(Order p){
    	Cat cat2 = (Cat) p;
    	if(name.length() < cat2.name.length())
    		return true;
    	return false;
    }
}
