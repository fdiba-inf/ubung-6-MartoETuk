package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = input.nextLine();
        boolean check = true;
        int counter = 0;

      for (int index = 0; index < password.length(); index++) {
        if (Character.isDigit(password.charAt(index))) {
          counter++;
        }
      }

      for (int index = 0; index < password.length(); index++) {
        if (!Character.isLetterOrDigit(password.charAt(index))) {
          check = false;
          break;
        }
      }

      if (password.length() >= 8 && counter >= 2 && check) {
         System.out.println("Password valid!");
      } else {
         System.out.println("Password valid!");
      }
    }
}
