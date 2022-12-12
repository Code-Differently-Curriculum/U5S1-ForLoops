package com.codedifferently.labs.partB.ex01;

public class CountingExample {
    public static String counting() {
        String response = "";
        for(int i = 1; i < 6; i++){
           response += i;
        }
        return response;

    }
    public static void main(String[] args) {
        String count = counting();
        System.out.print(count);
    }
}
