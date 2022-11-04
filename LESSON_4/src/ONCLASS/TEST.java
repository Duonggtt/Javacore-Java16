package ONCLASS;

import java.util.Scanner;

import static ONCLASS.TEST.isPalindrome;

public class TEST {

    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        System.out.println(isPalindrome(x));

    }
    public static boolean isPalindrome(int x) {
        int reverseNum =0;
        int y = x;
        while(x>0) {
            reverseNum = reverseNum * 10 + x%10;
            x/=10;
        }
        return reverseNum == y ? true : false;
    }
    }


