//Evan Ramos
//CS110 Final
//Card Class makes a card with rank and suit
public class Card 
{ 
   private String suit;
   private int value;
   //Constructor
   public Card(int val)
   {
      value = findCard(val);
      suit = findSuit(val);
   }
   
   public Card(String val, int val2)
   {
      suit = val;
      value = val2;
   }
   
   //returns the suit
   public String getSuit()
   {
      return suit;
   }
   
   
   //returns rank of card
   public int getValue()
   {
      return this.value;
   }
   
   
   //finds rank of card takes in int 
   public int findCard(int cardNum)
   {
      int card = (cardNum % 13);
   
      return card;
   }
   
   
   //takes an int, finds the suit of the card
   public String findSuit(int cardNum)
   {
      String suit;
      
      if ((cardNum / 13) == 0) 
      suit = "DIAMONDS";
      else if((cardNum / 13) == 1) 
      suit = "HEARTS";
      else if((cardNum / 13) == 2) 
      suit = "SPADES";
      else if((cardNum / 13) == 3) 
      suit = "CLUBS";
      else
      suit = "HEARTS";      
      return suit;
   }
   
   
   //convert  to a name. ie jack, king, queen, ace
   public String toString()
   {
      String name = "";
      if (value >= 10 || value == 0)
      {
         if (value == 12)
            name = "KING OF "+suit;
         else if (value == 11)
            name = "QUEEN OF "+suit;
         else if (value == 10)
            name = "JACK OF "+suit;
         else if (value == 0)
            name = "ACE OF "+suit;
   
         return name;
      }
      else
         return  (value) +" OF "+ suit; 
   
   }
   
   
}