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
public class ConstructID {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String fullNameAndAddress = input.nextLine();
        String space = "";
        
       for(int x = 0; x < fullNameAndAddress.length(); ++x){
           if(fullNameAndAddress.charAt(x) == ' '){
               
               space += fullNameAndAddress.charAt(x); 
               x = 0;
               System.out.println(fullNameAndAddress.charAt(0));
           }
           
           
       }
    }
}
