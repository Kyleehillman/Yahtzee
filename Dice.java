import java.util.*;

public class Dice
{
  public class Die
  {
    protected int value;
    
    private Random generator = new Random ();     //to generate random rolls
    
    public Die ()                               //constructor
    {
      setNewValue ();                             
    }
    
    public void setNewValue ()                //sets new values for the die
    {
      value = generator.nextInt (6);          //will generate a number 1-6
      value++;                                //increments value
    }
  }
  
  private Die die;
  public Die[] dice;
  private boolean[] hold;              //boolean array to store true and false for die kept
  
  public Dice ()
  {
    dice = new Die[5];                //dice holds 5 die
    hold = new boolean[5];            //to choose which are kept
    
    for (int i = 0; i < 5; i++)
    //makes 5 die
    {
      dice[i] = new Die ();           //creates the dice
      hold[i] = false;                //nothing is kept yet
    }
  }
  
  public void Roll ()
  //will roll the dice
  {
    for (int i = 0; i < 5; i++)
    {
      if (!hold[i])             //if die is not kept
      {
        die = dice[i];          //sets a new die in the array
        die.setNewValue ();     //will set a new value for the die
        dice[i] = die;          //puts into dice array
      }
    } 
  }
  
  public int getValue (int index)
  {
    Die die;
    
    die = dice[index];              //die is what number dice it is
    
    return die.value;               //gets the number on the die
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
