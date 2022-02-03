/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import static ca.sheridancollege.week3.softwarefundamentals.ice1.Card.SUITS;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modified by Megha Patel
 * @ modified by Parul Jolly
 * 03/02/2022
 * @student ID:991661849
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a number between 1 and 13");
        int userNum = in.nextInt();  //input user
        System.out.println("choose the card between Hearts,Diamonds,Spade,Clubs using value 1.2.3.4");
        int userCard = in.nextInt();  //input user

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setSuit(SUITS[randomValForSuit()]);
            c.setValue(randomSelectedVal());
            System.out.println("COMPUTER SELCETD VALUES::" + c.getSuit() + "|==|" + c.getValue());
            Card c2 = new Card();
            c2.setSuit(SUITS[userCard]);
            c2.setValue(userNum);
            System.out.println("USER SELCETD VALUES::" + c2.getSuit() + "|==|" + c2.getValue());
            if (c.equals(c2)) {
                System.out.println("Your letter if it is in those chosen by the computer, Congratulation!!! ");
            } else { 
                System.out.println("Your card is not among those chosen by the Computer");
            }

        }

    }

    public static int randomValForSuit() {
        int randomSuitVal = (int) (Math.random() * 4);
        return randomSuitVal;
    }

    public static int randomSelectedVal() {
        int randomCardVal = (int) (Math.random() * 13);
        return randomCardVal;
    }

}
