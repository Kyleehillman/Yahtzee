import javax.swing.*;
import java.awt.*;

public class DiceJPanel extends JPanel implements ActionListener
{
  public void paintComponent (Graphics g)
  {
    Dice dice = new Dice ();
    
    ImageIcon image;
    
    JButton die1, die2, die3, die4, die5;
    JButton rollButton;
  
    setPrefferedSize (new Dimension (1500, 500));
    
    setLayout (new GridLayout (1, 5, 20, 0));
    
    for (int i = 0; i < 5; i++)
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
      {
        die1 = new JButton (image);
        add (die1);
        die1.setVisible (true);
      }
      else if (i == 1)
      {
        die2 = new JButton (image);
        add (die2);
        die2.setVisible (true);
      }
      else if (i == 2)
      {
        die3 = new JButton (image);
        add (die3);
        die3.setVisible (true);
      }
      else if (i == 3)
      {
        die4 = new JButton (image);
        add (die4);
        die4.setVisible (true);
      }
      else
      {
        die5 = new JButton (image);
        add (die5);
        die5.setVisible (true);
      }
    }
  }
}
