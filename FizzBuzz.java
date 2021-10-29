package com.engeto.urm.ukolHotel;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Array;
import java.util.ArrayList;

public class FizzBuzz {
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }


    public static void fizzBuzz1(ArrayList<Integer> integer, ArrayList<String> string){
        for(int i = 1; i <= 100; i++) {
            int temp = 0;
            // temp to help print String
            int tempSkip = 0;
            // temp to skip printing of i
            for (Integer integer1 : integer
            ) {
                //for every integer put into the AL<Integer> select each number
                if (i % integer1 == 0) {
                    // here we check if the selected number can divide "i" from for loop
                    System.out.print(string.get(temp));
                    // if it passes, we print out a word which is mean to replace the i in for loop
                    tempSkip = i;
                    // teamskip copies "i" for us to be able to SKIP IT #1
                }
                temp++;
                // temp increased
            }
            if (i == tempSkip){
                System.out.println();
                // printing new line because we chose don't print one earlier
                continue;
                // #1
            }
            System.out.println(i);
        }
    }
}
