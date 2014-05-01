//Evan Ramos
//CS110 Final
//Deck Class to deal cards out and keep track and randomize order

import java.util.*;


public class Deck 
{
   private final int CARDS = 52; //amount of cards in a deck
   private Card [] deck; //creating an array of cards
   private int top = 0; //the top of the deck

   public Deck()
   {
      deck = new Card[CARDS];
      //Creates all 52 cards
   
      for(int i=0; i < CARDS; i++)
         deck[i] = new Card(i);
   }
   
   //returns the deck with cards in random order
   public void shuffle()
   {
      Random rand = new Random();
   
      for (int i=0; i < CARDS; i++)
      {
         int ranCard = rand.nextInt(52); //random number 0-51
   
         Card temp;
         temp = deck[i];
   
         deck[i] = deck[ranCard];
         deck[ranCard] = temp;
      }
   }
   
   //returns true if the deck is empty else false
   public boolean isEmpty()
   {
      boolean empty = false;
   
      if (top == 52)
      {
         empty = true;
      }
         return empty;
       
   }
   
   //returns the top card on the deck and removes it from the deck
   public Card deal()
   {
      int temp = top;
      top ++;
   
      return deck[temp];
      
   }
   
}