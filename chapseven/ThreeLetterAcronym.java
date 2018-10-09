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
public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String threeLetters = input.nextLine();
        
     if(threeLetters.length() >= 3){
              System.out.println(threeLetters.substring(0, 3).toUpperCase());

     }
     
}
    }

