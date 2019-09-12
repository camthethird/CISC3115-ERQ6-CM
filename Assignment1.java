/*
 * Clifton McDonald
 * CISC 3115
 * Brooklyn College
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
        int attempts = 0;
        int maxatts = 4;

		System.out.println("WELCOME TO THE BANK OF BC.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		attempts++;

        while (entry != pin && attempts < maxatts) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
            attempts++;
        }

        if (entry == pin)
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        else if (attempts >= maxatts)
            System.out.println("\n MAXIMUM ATTEMPTS REACHED. ACCOUNT TEMPORARILY LOCKED");
            keyboard.close();
  }
}
