/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapseven;

import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class PalindromeOne {

    public static void main(String args[]) {
        int r, sum = 0, temp;
        int n = 3443;//It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
    
      String original, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in); 
      System.out.println("Enter a string/number to check if it is a palindrome");
      original = in.nextLine(); 
      int length = original.length(); 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
      if (original.equals(reverse))
         System.out.println("Entered string/number is a palindrome.");
      else
         System.out.println("Entered string/number isn't a palindrome."); 
   }
}


