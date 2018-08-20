package lv.ctco.javaschool.anagrams;

import java.util.Scanner;

public class Main {
    public static int numbRec (int number) {
        if (number >= 2) {
            return number*numbRec(number-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        int lenghtStr = str.length();
        System.out.println(numbRec(lenghtStr));
    }
}
