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
public class PhoneNumberFormat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String phoneNum = input.nextLine();
        
            char firstBracket = '(';
            char secondBracket = ')';
            char dash = '-';
               
            System.out.println(firstBracket + phoneNum.substring(0, 3) + 
                    secondBracket + phoneNum.substring(3, 6) + dash + 
                    phoneNum.substring(7, 11));
    }
}
