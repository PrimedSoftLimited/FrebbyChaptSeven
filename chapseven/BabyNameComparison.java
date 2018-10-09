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
public class BabyNameComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.next();
        String second = input.next();
        String third = input.next();
        
        System.out.println(first.concat(" " + second));
                System.out.println(first.concat(" " + third));
        System.out.println(second.concat(" " + first));
        System.out.println(second.concat(" " + third));
        System.out.println(third.concat(" " + first));
        System.out.println(third.concat(" " + second));

    }
}
