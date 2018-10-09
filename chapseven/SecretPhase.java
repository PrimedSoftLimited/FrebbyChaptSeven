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
public class SecretPhase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = "Random";
        String missWord = "R***om";
        System.out.println(missWord + ": Type in the complete word");
        String letters = input.nextLine();

        if(letters.substring(1, 4).equals(word.substring(1, 4))){
             
            System.out.println("correct");
            System.out.println("R" + letters.substring(1, 4) + "om");


            }
        if(letters.substring(1, 3).equals(word.substring(1, 3))){
            
                        System.out.println("not there yet");
              System.out.println("R" + letters.substring(1, 3) + "*om");
                      
        }
       
       
    }
}
