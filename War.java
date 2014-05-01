//Evan Ramos
//CS110 Final
//GUI implementation of war

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class War extends JFrame
{
   //Create Frame, labels, buttons, and Panels for the game as well as initializing the game
   private JButton war = new JButton("WAR!");
   private JButton exit = new JButton("Quit Game");
   private JPanel box = new JPanel();
   private JPanel buttons = new JPanel();
   private JPanel score1 = new JPanel();
   private JLabel scorePlayer1 = new JLabel("Player1 Card: ");
   private JLabel scorePlayer2 = new JLabel("Player2 Card: ");
   private JLabel status = new JLabel("Click WAR to play.... this area will show you game status..");
   private WarGame theGame = new WarGame(); 
   
   
   public War()
   {
      //Title GUI war
      super("War");
      //Create layout for the panel so the buttons are aligned along y axis and for x axis
      box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
      score1.setLayout(new BoxLayout(score1, BoxLayout.Y_AXIS));
      //Quit on exiting
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      //Add buttons to panels and labels as well
      score1.add(scorePlayer1);
      score1.add(scorePlayer2);
      buttons.add(war);
      buttons.add(exit);
      buttons.add(status);
      box.add(buttons);
      box.add(score1);
      // Add everything tot the frame
      this.getContentPane().add(box);
      super.setSize(500,500);
      exit.addActionListener(new ExitHandler());
      war.addActionListener(new PlayWar());
      setVisible(true);

      
   }
   //Class for when you hit the Quit game button
   class ExitHandler implements ActionListener 
   {

    public void actionPerformed(ActionEvent e) 
    {

        System.exit(0);
    }
   }
   //Plays war displays the card of each player including suit and rank to the apporprate labels
   class PlayWar implements ActionListener 
   {
	  public void actionPerformed(ActionEvent e) 
     {
		if (e.getSource() instanceof JButton) 
      {
         Card p1, p2;
         String roundStatus;
         roundStatus = theGame.Play();
         p1=theGame.getCard1();
         p2=theGame.getCard2();
         //Each round you are made aware of who won
         status.setText(roundStatus);
         scorePlayer1.setText("Player1 Card: "+p1.toString());
         scorePlayer2.setText("Player2 Card: "+p2.toString());
		}
	  }
   }
   //Main function to play on GUI
   public static void main(String[] args)
   {
	  new War();
   }
}