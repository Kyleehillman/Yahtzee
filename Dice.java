import java.util.*;

public class Dice
{
  public class Die
  {
    protected int value;
    
    private Random generator = new Random ();
    
    public Die ()
    {
      setNewValue ();
    }
    
    public void setNewValue ()
    {
      value = generator.nextInt (6);
      value++;
    }
  }
  
  private Die die;
  public Die[] dice;
  private boolean[] hold;
  
  public Dice ()
  {
    dice = new Die[5];
    hold = new boolean[5];
    
    for (int i = 0; i < 5; i++)
    {
      dice[i] = new Die ();
      hold[i] = false;
    }
  }
  
  public void Roll ()
  {
    for (int i = 0; i < 5; i++)
    {
      if (!hold[i])
      {
        die = dice[i];
        die.setNewValue ();
        dice[i] = die;
      }
    } 
  }
  
  public int getValue (int index)
  {
    Die die;
    
    die = dice[index];
    
    return die.value;
  }
  
  public void setHold (int index)
  {
    hold[index] = true;
  }
  
  public void unsetHold (int index)
  {
    hold[index] = false;
  }
}
