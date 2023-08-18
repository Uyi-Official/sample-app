package com.interswitch.maven;

public class UpperLowerCase {

    public String toUpperCase(String txt){
        if (txt != null) {
            String[] arr = txt.split(" ");
            String word = arr[0].toUpperCase();
            return word;

        }
        else {
            throw new IllegalArgumentException("");
        }
    }

    public String toLowerCase(String txt){
        if (txt != null) {
            String[] arr = txt.split(" ");
            String word = arr[0].toLowerCase();
            return word;

        }
        else {
            throw new IllegalArgumentException("");
        }
    }
}
