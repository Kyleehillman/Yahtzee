import java.util.*;

public class Dice
{
  private int die;
  public int[] dice;
  private boolean[] hold;              //boolean array to store true and false for die kept
  
  Random generator = new Random ();
  
  public Dice ()
  {
    dice = new int[5];                //dice holds 5 die
    hold = new boolean[5];            //to choose which are kept
    
    for (int i = 0; i < 5; i++)
    { 
      hold[i] = false;                           //nothing is kept yet
    }
    
    Roll ();                                     //sets values of dice
  }
  
  public void Roll ()
  //will roll the dice
  {
    for (int i = 0; i < 5; i++)
    {
      if (!hold[i])                              //if die is not kept
      {
        dice[i] = generator.nextInt (6);         //set value of die to new value
        dice[i]++;
      }
    } 
  }
  
  public int getValue (int index)
  {
    return dice[index];              //gets the number on the die
  }
  
  public void setHold (int index)
  {
    hold[index] = true;             ///set true if player wants to keep
  } 
  
  public void unsetHold (int index)
  {
    hold[index] = false;            //set false if player doesnt want to keep
  }
}
