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
public class PrepareTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char hyph = '-';
        String zipCode;
        String securityNum = input.nextLine();
        
        for(int x = 0; x < securityNum.length();){
            if(securityNum.charAt(3) == hyph && securityNum.charAt(6) == hyph){
                System.out.println("clear");
                break;
            }
            else if(securityNum.charAt(3) != hyph && securityNum.charAt(6) != hyph){
                System.out.println("nah");           
            }
            securityNum = input.nextLine();
        }
        zipCode = input.nextLine();
        
        }
}
