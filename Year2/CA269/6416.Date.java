// package com.week05;

import java.util.Scanner;

public class Date
{
    private int day;
    private int month;
    private int year;
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    public Boolean isOnOrAfter(Date day2)
    {
        if(this.year < day2.year)
            return false;
        if(this.month < day2.month)
            return false;
        if(this.day < day2.day)
            return false;
        return true;
    }
    
    public Date(String s)
    {
        String [] dmy;
        dmy = s.split(" ");
        
        
        day = Integer.parseInt(dmy[0]);
        month= Integer.parseInt(dmy[1]);
        year = Integer.parseInt(dmy[2]);
    
    }
    // Here is the main method which will read in a sequence of dates.
    // Modify it so that it prints the latest date.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        String line;
        Date largest = new Date(in.nextLine());
        while(in.hasNextLine())
        {
            line = in.nextLine();
            if(line.length() != 0)
                {
                Date date = new Date(line);
                if(date.isOnOrAfter(largest))
                    largest = date;
            }

        }
        System.out.println(largest); // Print the latest date
    }
}