import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Dice
{
  public class Die
  {
    protected int value;
    protected ImageIcon image;
    protected JLabel icon;
    
    private Random generator = new Random ();
    
    public Die ()
    {
      setNewValue ();
      setIcon (value);
    }
    
    public void setNewValue ()
    {
      value = generator.nextInt (6);
      value++;
    }
    
    public void setIcon (int val)
    {
      switch (val)
      {
        case 1:
          image = new ImageIcon (getClass ().getResource ("die1.png"));
          icon = new JLabel (image);
          break;
        case 2:
          image = new ImageIcon (getClass ().getResource ("die2.png"));
          icon = new JLabel (image);
          break;
        case 3:
          image = new ImageIcon (getClass ().getResource ("die3.png"));
          icon = new JLabel (image);
          break;
        case 4:
          image = new ImageIcon (getClass ().getResource ("die4.png"));
          icon = new JLabel (image);
          break;
        case 5:
          image = new ImageIcon (getClass ().getResource ("die5.png"));
          icon = new JLabel (image);
          break;
        case 6:
          image = new ImageIcon (getClass ().getResource ("die6.png"));
          icon = new JLabel (image);
          break;
      }
    }
  }
  
  
}
