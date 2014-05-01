//Evan Ramos
//CS 110 Final
//WarGame class uses a deck and draws cards from it to then comprae cards
//and return outcomes of each round played
public class WarGame extends Deck
{
  //Initialize deck and amount of cards each player has
  private Deck deck;
  private Card player1, player2;
  private int player1Cards, player2Cards;
  
  //Constructor
  public WarGame()
  {
   //Shuffles the deck
   deck = new Deck();
   deck.shuffle();
  }
  
  public void player1Draw()
  { 
   //Deals a card to player1
   player1 = deck.deal();
  }
  
  public void player2Draw()
  {
   //Deals a card to player2
   player2 = deck.deal();
  }
  
  public String Play()
  {
   //Plays the game by drawing a card for each player then comparing and returning a string of the outcome
   //Adds winning cards to players pile
   //Game is over once there are no cards left in the deck
   //Player with the most cards at the end wins
   player1Draw();
   player2Draw();
   if (player1.getValue() > player2.getValue())
   {
      String s;
      s = "Player1 wins this round";
      player1Cards+=2;
      return s;
   }
   else if (player1.getValue() < player2.getValue())
   {
      String s;
      s = "Player2 wins this round";
      player2Cards+=2;
      return s;
   }
   else
   {
      player1Draw();
      player2Draw();
      
      player1Draw();
      player2Draw();
      if (player1.getValue() > player2.getValue())
      {
         String s;
         s = "Player1 wins this round it was a war!";
         player1Cards+=6;
         return s;
      }
      else if (player1.getValue() < player2.getValue())
      {
         String s;
         s = "Player2 wins this round it was a war!";
         player2Cards+=6;
         return s;
      }
      else
      {
         String s;
         s = "It's a tie!";
         player2Cards+=3;
         player1Cards+=3;
         return s;
      }
   }
   
  }
  //Returns a status of the game, at the end it displays the winner
  public String gameStatus()
  {
      if (deck.isEmpty() == true)
      {
         String s;
         if (player1Cards > player2Cards)
         {
            s = "Player1 wins the game";
         }
         else
         {
            s = "Player2 Wins this game";
         }
         return s;
      }
      else 
      {
         String s;
         s = "KEEP CLICKING WAR!!";
         return s;
      }
  }
  //Returns player 1's card
  public Card getCard1()
  {
      return player1;
  }
  //Returns player 2's card
  public Card getCard2()
  {
      return player2;
  }
}  