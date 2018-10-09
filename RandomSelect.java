/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frebby
 */
import java.util.Random;
public class RandomSelect {

    public static void main (String [] args) {

         String [] arr = {"A", "B", "C", "D"};
         Random random = new Random();

         // randomly selects an index from the arr
         int select = random.nextInt(arr.length); 
                  String dfff = "C";

         boolean vg = arr[select] == dfff;

         if(vg){
                                   System.out.println("true"); 

                      System.out.println(arr[select]); 

         }
         // prints out the value at the randomly selected index
         System.out.println(select); 
         
    }
}if(scissorsValid ||
                    rockValid || paperValid){
                                System.out.println("correct");
    }
                    else if(validRockMisspell ||
                    validPaperMisspell || validScissorsMisspell){
                                System.out.println("correct");

            }