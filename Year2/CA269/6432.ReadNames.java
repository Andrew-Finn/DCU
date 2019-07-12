// package com.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadNames
{
    public static void main(String [] args)
    {
            Scanner in = new Scanner(System.in);
            Scanner in2 = null;
            try
            {
                System.out.print("Enter the file name: ");
                String fileName = in.next();
                in2 = new Scanner(new File(fileName));
                int numNames = in2.nextInt();
                String [] names = new String[numNames];
                for(int i = 0; i < numNames; i++)
                    names[i] = in2.next();
            
                System.out.println("The names in reverse order are:");
                for(int i = numNames - 1; i >= 0; i--)
                    System.out.print(names[i] + " ");
                System.out.println();
            }
            catch(FileNotFoundException e)
            {
                System.out.println("The file does not exist");
            }
            in2.close();
    }
}
