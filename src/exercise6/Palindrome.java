package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        assert number > 0;
        int palindrome = 0;
        int preslava = number;

        while (preslava > 0) {
          int a = preslava % 10;
          preslava = (preslava - a) / 10;
          palindrome *= 10;
          palindrome = palindrome + a; 
        }

        boolean pal = false;
        if (palindrome == number) {
          pal = true;
        }

        System.out.println("Palindrome: " + pal);
    }
}
