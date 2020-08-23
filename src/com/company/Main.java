package com.company;

public class Main {

    public static void main(String[] args) {
        String[] mass = new String[1000];
        String beer = String.join("", mass);
        String youOweMeABeer = beer.replace("null", "You owe me a beer\n");
        System.out.println(youOweMeABeer);
    }
}
