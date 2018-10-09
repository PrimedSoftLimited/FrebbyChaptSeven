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
public class ValidatePassword {
    public static void main(String[] args) {
       
Scanner input = new Scanner(System.in);
        String str = input.nextLine();
    boolean upperCase = false;
    boolean lowerCase= false;
    boolean digit = false;
    for(int x = 0; x < str.length(); ++x) {
        int ch = str.charAt(x);
        if(Character.isDigit(ch) && Character.isUpperCase(ch) &&
               Character.isLowerCase(ch)) {
            digit = true;
            upperCase = true;
   lowerCase= true;
            System.out.println("access granted");
            
        }
        if(!(Character.isDigit(ch) && Character.isUpperCase(ch) &&
               Character.isLowerCase(ch))){
           
            upperCase = false;
  lowerCase= false;
   digit = false;
        System.out.println("acces denied");
    }
   

}
    }
}
