/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frebby
 */
public class CountMovieSpaces {

    public static void main(String[] args) {

        char spaces = ' ';
        int totalSpaces = 0;
        String merlin = "In a land of myth, and a time of magic, blah blach blah";

        for (int x = 0; x < merlin.length(); ++x) {

            if (merlin.charAt(x) == spaces) {
                totalSpaces += 1;
            }
        }
        System.out.println(totalSpaces);

    }
}
