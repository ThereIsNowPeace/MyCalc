package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Main.calc(scanner.nextLine()));
    }

    public static String calc(String input) {


        char z;

        int x;
        if (" ".equals(String.valueOf(input.charAt(1)))) {
            x = Integer.parseInt(String.valueOf(input.charAt(0)));
            z = input.charAt(2);
        } else {
            x = Integer.parseInt(String.valueOf(input.charAt(0)) + input.charAt(1));
            z = input.charAt(3);
        }
        if (x <= 0 || x > 10){
            throw new RuntimeException("Numbers only from 1 to 10");
        }

        int y;
        if (input.length() == 7) {
            y = Integer.parseInt(String.valueOf(input.charAt(5)) + input.charAt(6));
        } else if (z == input.charAt(2) && input.length() == 6){
            y = Integer.parseInt(String.valueOf(input.charAt(4)) + input.charAt(5));
        } else if (z == input.charAt(3) && input.length() == 6) {
            y = Integer.parseInt(String.valueOf(input.charAt(5)));
        } else {
            y = Integer.parseInt(String.valueOf(input.charAt(4)));
        }
        if (y <= 0 || y > 10){
            throw new RuntimeException("Numbers only from 1 to 10");
        }

        int result = 0;
        if (z == '+') {
            result = x + y;
        } else if (z == '-') {
            result = x - y;
        } else if (z == '*') {
            result = x * y;
        } else if (z == '/') {
            result = x / y;
        }

        return String.valueOf(result);
    }

}



