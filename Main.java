package com.engeto.urm.ukolHotel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //FizzBuzz.fizzBuzz();
        ArrayList<Integer> integer = new ArrayList<>();
        ArrayList<String> string = new ArrayList<>();
        integer.add(3);
        integer.add(5);
        string.add("Fizz");
        string.add("Buzz");


        long startTime = System.nanoTime();
        FizzBuzz.fizzBuzz();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("\n" + "\n" + duration + "\n" + "\n");

        /*long startTime1 = System.nanoTime();
        FizzBuzz.fizzBuzz1(integer, string);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("\n" + "\n" + duration1 + "\n" + "\n");

         */

        //fizzBuzz() is a little faster (~ 15%) than fizzBuzz1() but offers far less versatility


    }
}
