package com.interswitch.maven;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

    UpperLowerCase ulc = new UpperLowerCase();
        System.out.printf("from %s to %s\n","Hello world",ulc.toUpperCase("Hello world"));
        System.out.printf("from %s to %s\n","Hello world",ulc.toLowerCase("Hello world"));
        System.out.println("New go-home feature by"+ " backbone team suggested at "+ LocalDateTime.now());
//        System.out.println( "Hello World!" );
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int x = scn.nextInt();
//        System.out.println("Enter second number");
//        int y = scn.nextInt();
//        add(x,y);
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        sub(x,y);
    }
//
//
//    static void add(int x, int y){
//        System.out.printf("The sum of %d and %d is %d",x,y,x+y);
//        System.out.println();
//        System.out.println("--------------------------------");
//    }
//
//    static void sub(int x, int y){
//        System.out.printf("The difference btw %d and %d is %d",x,y,x-y);
//    }
//
//    static void multiply(int x, int y){
//        System.out.printf("The multiplication of %d and %d is %d",x,y,x*y);
//    }
//
//    static void divide(int x, int y){
//        System.out.printf("The division of %d by %d is %d",x,y,x/y);
//    }
}

//--------------------------------------------------------------------------------------------------
