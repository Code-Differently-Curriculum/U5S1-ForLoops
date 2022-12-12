package com.codedifferently.labs.partA.ex01;

public class Countdown {
    public static String countDownLoop() {
        String response = "";
        for (int i = 5; i >= 0; i--) {
            response += i + " ";
        }
        return response;
    }

    public static String countUpLoop() {

        return null;
    }

    public static String evenNumbers(){

        return null;
    }
    public static void main(String[] args) {

        System.out.println("Countdown to Launch: ");

        String outputFromDown = countDownLoop();
        System.out.println(outputFromDown);

        System.out.println("Blast Off!");

        System.out.println("CountUp to Launch One: ");

        String outputCountUp = countUpLoop();
        System.out.println(outputCountUp);

        System.out.println("Blast Off!");
    }
}
