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
public class countWords{
public static int countWordsUsingSplit(String input) { 
    if (input == null || input.isEmpty()) { 
        return 0;
}
        String[] words = input.split("\\s+");
        return words.length;
}
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
String words = input.nextLine();
        System.out.println(countWordsUsingSplit(words));
    }
}