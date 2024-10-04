package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int counter = 1;

        do {
            String printout = Integer.toString(counter);

            if (counter % 3 == 0) {
                printout += "Brrr";
            }
            if (counter % 7 == 0) {
                printout += "Pfft";
            }

            System.out.println(printout);
            counter++;
        } while (counter != 100);
    }
}