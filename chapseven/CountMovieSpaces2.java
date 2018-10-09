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
public class CountMovieSpaces2 {

    public static void main(String[] args) {

        char spaces = ' ';
        int totalSpaces = 0;

        Scanner input = new Scanner(System.in);
        String movieQuote = input.nextLine();
        
        for (int x = 0; x < movieQuote.length(); ++x) {

            if (movieQuote.charAt(x) == spaces) {
                totalSpaces += 1;
            }
        }
        System.out.println(totalSpaces);

    }
}


