// package com.week05;

import java.io.*;
import java.util.*;

public class Senti1 {
	public static void main(String [] args){
	    try
	    {
		Scanner in = new Scanner(new File(args[1]));
		int count = 0;
		while(in.hasNext()){
			String next = in.next();
			if(next.contains(args[0])){
				count += 1;
			}
		}
		System.out.println(args[0] + " appears " + count + " times.");
	    }
        catch(FileNotFoundException e)
            {
                System.out.println("The file does not exist");
            }
	}
}
