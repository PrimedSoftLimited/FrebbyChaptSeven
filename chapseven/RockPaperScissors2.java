/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapseven;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class RockPaperScissors2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rock, Paper, or Scissors. Type one >>> ");
        String choice = input.nextLine();

        String[] arr = {"rock", "paper", "scissors"};
        Random random = new Random();
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        String choiceValid = choice.toLowerCase();
        boolean rockValid = choiceValid.equals(rock);
        boolean paperValid = choiceValid.equals(paper);
        boolean scissorsValid = choiceValid.equals(scissors);
        boolean validRockMisspell = choice.substring(1, 2).equals(rock.substring(1, 2));
        boolean validPaperMisspell = choice.substring(1, 2).equals(paper.substring(1, 2));
        boolean validScissorsMisspell = choice.substring(1, 2).equals(scissors.substring(1, 2));
        String paperRand = arr[1];
        String scissorsRand = arr[2];
        int rounds = 0;
        int select = random.nextInt(arr.length);
        String rockRand = arr[0];
boolean rockPlayAndCom = arr[select].equals(rockRand);
boolean paperPlayAndCom = arr[select].equals(paperRand);
boolean scissorsPlayAndCom = arr[select].equals(scissorsRand);

boolean matchRockPlayAndCom = rockValid == rockPlayAndCom;
boolean matchPaperPlayAndCom = paperValid == paperPlayAndCom;
boolean matchScissorsPlayAndCom = scissorsValid == scissorsPlayAndCom;

       

        
while(rounds < 10){
            if(scissorsValid ||
                    rockValid || paperValid){
                                System.out.println("correct");
    }
                   else if(validRockMisspell ||
                    validPaperMisspell || validScissorsMisspell){
                                System.out.println("correct");

            }
                    else{
                             System.out.println("wrong");

                    }
            System.out.println("Rock, Paper, or Scissors. Type one >>> ");
            choice = input.nextLine();
        }

            
}
    }

