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
public class PigLatin {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final String vowels = "aeiouAEIOU";
        System.out.println("Enter your word.");
        String word = sc.nextLine();
        while (!word.equalsIgnoreCase("done"))
        {
            String beforVowel = "";
            int cut = 0;
            while (cut < word.length() && !vowels.contains("" + word.charAt(cut)))
            {
                beforVowel += word.charAt(cut);
                cut++;
            }
            if (cut == 0)
            {
                cut = 1;
                word += word.charAt(0) + "w";
            }
            
            System.out.println(word.substring(cut) + beforVowel + "ay");
            System.out.println("Enter your word.");
            word = sc.nextLine();
        }
    }

}
