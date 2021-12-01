import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Dice extends JFrame
{
  public class Die extends JFrame
  {
    protected int value;
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
          // set icon to die1.png
          break;
        case 2:
          // set icon to die2.png
          break;
        case 3:
          // set icon to die3.png
          break;
        case 4:
          // set icon to die4.png
          break;
        case 5:
          // set icon to die5.png
          break;
        case 6:
          // set icon to die6.png
          break;
      }
    }
  }
}
