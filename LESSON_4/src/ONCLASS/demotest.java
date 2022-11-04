package ONCLASS;

import java.util.Scanner;

public class demotest {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Integer number = new Scanner(System.in).nextInt();
        String process_number = String.valueOf(number);
        int reversible_number = 0;
        if (process_number.length() % 2 == 0) {
            for (int i = 0; i <= process_number.length() / 2 - 1; i++) {
                reversible_number += ((int) process_number.charAt(i)-48) * (Math.pow(10, process_number.length() - 1 - i) + Math.pow(10, i));
                //((int) process_number.charAt(i)-48) because of ASCII
            }
        } else {
            for (int i = 0; i <= process_number.length() / 2; i++) {
                reversible_number += ((int) process_number.charAt(i)-48) * (Math.pow(10, process_number.length() - 1 - i)+Math.pow(10, i));
                if (i == (process_number.length() - 1) / 2) {
                    reversible_number -= ((int) process_number.charAt(i)-48) * Math.pow(10, i);
                }
            }
        }
        if (reversible_number == number) {
            System.out.println(number + " is a reversible number.");
        } else {
            System.out.println(number + " isn't a reversible number.");
        }




    }
}
