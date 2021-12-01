import javax.swing.*;
import java.awt.*;

public class DiceJPanel extends JPanel implements ActionListener
{
  public void paintComponent (Graphics g)
  {
    setPrefferedSize (new Dimension (1500, 500));
    
    GridLayout diceGrid = new GridLayout (1, 5, 20, 0);
    
    
  }
}
