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
public class Alphabetize {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        
        if (str.charAt(0) <= str.charAt(1) &&
    str.charAt(1) <= str.charAt(2) &&
    str.charAt(2) <= str.charAt(3)) {
        System.out.println("In order");
} else
    System.out.println("NOT in order");
    }
}
