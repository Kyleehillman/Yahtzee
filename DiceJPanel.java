import javax.swing.*;
import java.awt.*;

public class DiceJPanel extends JPanel implements ActionListener
{
  public void paintComponent (Graphics g)
  {
    Dice dice = new Dice ();                //gets a new dice
    
    ImageIcon image;                        //variable for picture of dice
    
    JButton die1, die2, die3, die4, die5;   //makes each die into a button
    JButton rollButton;                     //creates a roll button
  
    setPrefferedSize (new Dimension (1500, 500));   //edits layout
    
    setLayout (new GridLayout (1, 5, 20, 0));       //edits layout
    
    for (int i = 0; i < 5; i++)
    //adds the picture for each value rolled
    {
      if (dice.getValue (i) == 1)
      {
        image = new ImageIcon (getClass ().getResource ("die1.png"));
      }
      else if (dice.getValue (i) == 2)
      {
        image = new ImageIcon (getClass ().getResource ("die2.png"));
      }
      else if (dice.getValue (i) == 3)
      {
        image = new ImageIcon (getClass ().getResource ("die3.png"));
      }
      else if (dice.getValue (i) == 4)
      {
        image = new ImageIcon (getClass ().getResource ("die4.png"));
      }
      else if (dice.getValue (i) == 5)
      {
        image = new ImageIcon (getClass ().getResource ("die5.png"));
      }
      else
      {
        image = new ImageIcon (getClass ().getResource ("die6.png"));
      }
      
      if (i == 0)
      //if die one is chosen to keep
      {
        die1 = new JButton (image); 
        add (die1);
        die1.setVisible (true);
      }
      else if (i == 1)
      //if die two is chosen to keep
      {
        die2 = new JButton (image);
        add (die2);
        die2.setVisible (true);
      }
      else if (i == 2)
      //if die three is chosen to keep
      {
        die3 = new JButton (image);
        add (die3);
        die3.setVisible (true);
      }
      else if (i == 3)
      //if die four is chosen to keep
      {
        die4 = new JButton (image);
        add (die4);
        die4.setVisible (true);
      }
      else
      //if die five is chosen to keep
      {
        die5 = new JButton (image);
        add (die5);
        die5.setVisible (true);
      }
    }
  }
}
