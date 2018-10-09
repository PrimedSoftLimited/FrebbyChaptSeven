/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapseven;

/**
 *
 * @author Frebby
 */
public class Card {
    private String spades = "Spades";
    private String hearts = "Hearts";
    private String diamonds = "Diamonds";
    private String clubs = "Clubs";
    private String cardRank;
    private int setValue;

    public int getSetValue() {
        return setValue;
    }

    public void setSetValue(int setValue) {
        this.setValue = setValue;
    }

    public Card(String cardRank) {
        this.cardRank = cardRank;
    }

    public String getSpades() {
        return spades;
    }

    public void setSpades(String spades) {
        this.spades = spades;
    }

    public String getHearts() {
        return hearts;
    }

    public void setHearts(String hearts) {
        this.hearts = hearts;
    }

    public String getDiamonds() {
        return diamonds;
    }

    public void setDiamonds(String diamonds) {
        this.diamonds = diamonds;
    }

    public String getClubs() {
        return clubs;
    }

    public void setClubs(String clubs) {
        this.clubs = clubs;
    }

    public String getCardRank() {
        return cardRank;
    }

    public void setCardRank(String cardRank) {
        
        this.cardRank = cardRank;
    }

   
  
    
}
