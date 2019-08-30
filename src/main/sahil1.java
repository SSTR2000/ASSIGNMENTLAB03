package main;

import java.util.Scanner;

public class sahil1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = (int) (a);
        double c = (double) ((a - b) * 100);
        double d = Math.ceil(c);
        System.out.print(b + "ruppees and ");
        System.out.println(d + "paise");


    }

}

