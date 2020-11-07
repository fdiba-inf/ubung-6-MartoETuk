package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        assert number > 0;
        for (int index = 0;; index*=10) {
          int a = number % index;
          number = (number - a) / 10;
        }
}
