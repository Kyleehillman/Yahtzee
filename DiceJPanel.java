import javax.swing.*;
import java.awt.*;

public class DiceJPanel extends JPanel implements ActionListener
{
  public void paintComponent (Graphics g)
  {
    Dice dice = new Dice ();
    
    ImageIcon = image;
    
    JButton diceButton;
    JButton rollButton;
  
    setPrefferedSize (new Dimension (1500, 500));
    
    GridLayout diceGrid = new GridLayout (1, 5, 20, 0);
    
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
      else if (dice.getValue (i) == 6)
      {
        image = new ImageIcon (getClass ().getResource ("die6.png"));
      }
      
      diceButton = new JButton (image);
      add (diceButton);
    }
  }
}
