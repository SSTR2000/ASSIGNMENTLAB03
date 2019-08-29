package main;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float s = 0.000000f;
        for (int i = 1; i <= n; i++) {
            s = s + (1 / i);
        }
        System.out.println(s);

    }
}