import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Dice2 extends JFrame
{
    private Color cardCol = new Color(255,102,0);
    private int numOnDice1;
    private int numOnDice2;
    private int numonDice3;
    private int numOnDice4;
    private int numOnDice5;
    private JLabel keptDice;
    public JLabel name;
    private JButton diceRoll;
    private JButton noRoll;
    public Icon idice1;
    public Icon idice2;
    public Icon idice3;
    public Icon idice4;
    public Icon idice5;
    int maxNumRoll = 0;
    static int[] die = new int[5];
    Vector<Integer> diceSelected = new Vector<>();
    //each die as member data
    singleDie dice1 = new singleDie();
    singleDie dice2 = new singleDie();
    singleDie dice3 = new singleDie();
    singleDie dice4 = new singleDie();
    singleDie dice5 = new singleDie();
    
    singleDie dice1kept = new singleDie();
    singleDie dice2kept = new singleDie();
    singleDie dice3kept = new singleDie();
    singleDie dice4kept = new singleDie();
    singleDie dice5kept = new singleDie();
    
    //gives eahc die a number, icon and Jlabel
    public class singleDie
    {
        boolean visible;
        int valueOnDie;
        private int dieNum;
        public JLabel label;
        public JLabel icon;
        
        public singleDie()
        {
        
        }
        
        public int getDieNum(JLabel singleDie)
        {
            return dieNum;
        }
        public int getDieVal()
        {
            return valueOnDie;
        }
        public void visibile()
        {
            label.setVisible(true);
        }
        
        public void notVisible()
        {
            label.setVisible(false);
        }
        
        //sets die values
        public void setValueOnDie(int x)
        {
            if(x == 1)
            {
                valueOnDie = 1;
            }
            else if(x == 2)
            {
                valueOnDie = 2;
            }
            else if(x == 3)
            {
                valueOnDie = 3;
            }
            else if(x == 4)
            {
                valueOnDie = 4;
            }
            else if(x == 5)
            {
                valueOnDie = 5;
            }
            else if(x == 6)
            {
                valueOnDie = 6;
            }
        }
        //sets die numbers
        public void setDieNumber(int x)
        {
            if(x == 1)
            {
                dieNum = 1;
            }
            else if(x == 2)
            {
                dieNum = 2;
            }
            else if(x == 3)
            {
                dieNum = 3;
            }
            else if(x == 4)
            {
                dieNum = 4;
            }
            else if(x == 5)
            {
                dieNum = 5;
            }
            
        }
        //used given number to set icon to jlabel
        public void setIcon(int x)
        {
            switch(x)
            {
                case 1:
                    icon = new ImageIcon(getClass().getResource("die1.png"));
                    label = new JLabel(icon);
                    add(label);
                    label.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent mouseevent)
                        {
                            diceSelected.add(valueOnDie);
                            label.setVisible(false);
                        }
                    })
                    break;
                case 2:
                    icon = new ImageIcon(getClass().getResource("die2.png"));
                    label = new JLabel(icon);
                    add(label);
                    label.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent mouseevent)
                        {
                            diceSelected.add(valueOnDie);
                            label.setVisible(false);
                        }
                    })
                    break;
                case 3:
                    icon = new ImageIcon(getClass().getResource("die3.png"));
                    label = new JLabel(icon);
                    add(label);
                    label.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent mouseevent)
                        {
                            diceSelected.add(valueOnDie);
                            label.setVisible(false);
                        }
                    })
                    break;
                case 4:
                    icon = new ImageIcon(getClass().getResource("die4.png"));
                    label = new JLabel(icon);
                    add(label);
                    label.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent mouseevent)
                        {
                            diceSelected.add(valueOnDie);
                            label.setVisible(false);
                        }
                    })
                    break;
               case 5:
                    icon = new ImageIcon(getClass().getResource("die5.png"));
                    label = new JLabel(icon);
                    add(label);
                    label.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent mouseevent)
                        {
                            diceSelected.add(valueOnDie);
                            label.setVisible(false);
                        }
                    })
                    break;
            }
        }
        //set icon to jlabel
        public void setIHeld(singleDie die, int x);
        {
            switch(x)
            {
                   case 1:
                       if(label == null)
                       {
                            label = new JLabel();
                            //image update
                            die.label.setIcon(new ImageIcon(getClass().getResource("die1.png")));
                            add(die.label);
                        }
                        if(label != null)
                        {
                            die.label.setIcon(new ImageIcon(getClass().getResource("die1.png")));
                        }
                        break;
                    case 2:
                        if(label == null)
                        {
                            label = new JLabel();
                            //image update
                            die.label.setIcon(new ImageIcon(getClass().getResource("die2.png")));
                            add(die.label);
                        }
                        if(label != null)
                        {
                            die.label.setIcon(new ImageIcon(getClass().getResource("die2.png")));
                        }
                        break;
                    case 3:
                        if(label == null)
                        {
                            label = new JLabel();
                            //image update
                            die.label.setIcon(new ImageIcon(getClass().getResource("die3.png")));
                            add(die.label);
                        }
                        if(label != null)
                        {
                            die.label.setIcon(new ImageIcon(getClass().getResource("die3.png")));
                        }
                        break;
                    case 4:
                        if(label == null)
                        {
                            label = new JLabel();
                            //image update
                            die.label.setIcon(new ImageIcon(getClass().getResource("die4.png")));
                            add(die.label);
                        }
                        if(label != null)
                        {
                            die.label.setIcon(new ImageIcon(getClass().getResource("die4.png")));
                        }
                        break;
                    case 5:
                        if(label == null)
                        {
                            label = new JLabel();
                            //image update
                            die.label.setIcon(new ImageIcon(getClass().getResource("die5.png")));
                            add(die.label);
                        }
                        if(label != null)
                        {
                            die.label.setIcon(new ImageIcon(getClass().getResource("die5.png")));
                        }
                        break;
                    case 6:
                        if(label == null)
                        {
                            label = new JLabel();
                            //image update
                            die.label.setIcon(new ImageIcon(getClass().getResource("die6.png")));
                            add(die.label);
                        }
                        if(label != null)
                        {
                            die.label.setIcon(new ImageIcon(getClass().getResource("die6.png")));
                        }
                        break;
            }
        }
    }
    //shoes the dice being held
    void diceHeld(singularDie die, int x)
    {
        die.setIHeld(die,x);
        die(label.setVisible(true);
    }
    //before restarting make false
    void restartf(singularDie die)
    {
        die.label.setVisible(false);
    }
    //after restart make true
    void restartt(singularDie die)
    {
       die.label.setVisible(true);
    }
    //if held dice is true set die to false for restart
    void heldRestart(singularDie die)
    {
        if(die.label.isVisible() == true)
            die.label.setVisible(false);
    }
    void Restart(singularDie die)
    {
        Random rand = new Random();
        int randNum = rand.nextInt(5)+1;
        
        if(randNum == 0)
            randNum = randNum + 1;
           
        //set die values with random num
        die.setValueOnDie(randNum);
        switch(randNum)
        {
            case 1:
                die.label.setIcon(new ImageIcon(getClass().getResource("die1.png")));
                break;
            case 2:
                die.label.setIcon(new ImageIcon(getClass().getResource("die2.png")));
                break;
            case 3:
                die.label.setIcon(new ImageIcon(getClass().getResource("die3.png")));
                break;
            case 4:
                die.label.setIcon(new ImageIcon(getClass().getResource("die4.png")));
                break;
            case 5:
                die.label.setIcon(new ImageIcon(getClass().getResource("die5.png")));
                break;
         }
     }
     
     void Reroll(singularDie die)
     {
         //make sure die has not been clicked already
         if(die.isVisible() != false)
         {
             Random rand = new Random();
             int randNum = rand.nextInt(5)+1;
             
             if(randNum == 0)
                 randNum = randNum + 1;
                 
             //set value on die to new random num
             switch(randNum)
             {
                 case 1:
                    die.label.setIcon(new ImageIcon(getClass().getResource("die1.png")));
                    break;
                 case 2:
                    die.label.setIcon(new ImageIcon(getClass().getResource("die2.png")));
                    break;
                 case 3:
                    die.label.setIcon(new ImageIcon(getClass().getResource("die3.png")));
                   break;
                 case 4:
                    die.label.setIcon(new ImageIcon(getClass().getResource("die4.png")));
                   break;
                 case 5:
                    die.label.setIcon(new ImageIcon(getClass().getResource("die5.png")));
                  break;
            }
       }
   }
   public Dice()
   {
       setLayout(new FlowLayout());
       super("Yahtzee Dice);
       getContentPane().setBackground(cardCol);
       
       roll = new JButton("Roll the dice");
       doneroll = new JButton("Done rolling");
       newroll = new JButton("New roll");
       roll = setFont(new Font("Calibri, Font.PLAIN, 12));
       doneroll = setFont(new Font("Calibri, Font.PLAIN, 12));
       newroll = setFont(new Font("Calibri, Font.PLAIN, 12));
       roll.setBounds(100,100,50,60);
       doneroll.setBounds(100,100,50,60);
       newroll.setBounds(100,100,50,60);
       newroll.setVisible(false);
       add(roll);
       add(doneroll);
       add(newroll);
       
       Random dNum1 = new Random();
       Random dNum2 = new Random();
       Random dNum3 = new Random();
       Random dNum4 = new Random();
       Random dNum5 = new Random();
       
       die1 = newImageIcon(getClass().getResource("die1.png"));
       die2 = newImageIcon(getClass().getResource("die2.png"));
       die3 = newImageIcon(getClass().getResource("die3.png"));
       die4 = newImageIcon(getClass().getResource("die4.png"));
       die5 = newImageIcon(getClass().getResource("die5.png"));
       
       //get values from rolls and ensure theyre not 0
       d1num = dNum1.nextInt(5)+1;
       if(die1 == 0)
           die1 += 1;
           
       d2num = dNum2.nextInt(5)+1;
       if(die2 == 0)
           die2 += 1;
           
       d3num = dNum3.nextInt(5)+1;
       if(die3 == 0)
           die3 += 1;
           
       d4num = dNum4.nextInt(5)+1;
       if(die4 == 0)
           die4 += 1;
           
       d5num = dNum5.nextInt(5)+1;
       if(die5 == 0)
           die5 += 1;
           
       //set dice num, value on dice and icons
       dice1.setDieNumber(1);
       dice1.setValueOnDie(d1num);
       dice1.SetIcon(d1num);
       dice2.setDieNumber(2);
       dice2.setValueOnDie(d2num);
       dice2.SetIcon(d2num);
       dice3.setDieNumber(3);
       dice3.setValueOnDie(d3num);
       dice3.SetIcon(d3num);
       dice4.setDieNumber(4);
       dice4.setValueOnDie(d4num);
       dice4.SetIcon(d4num);
       dice5.setDieNumber(5);
       dice5.setValueOnDie(d5num);
       dice5.SetIcon(d5num);
       
       DiceTracker tracker = new DiceTracker();
       roll.addActionListener(tracker);
       doneroll.addActionListener(tracker);
       newroll.addActionListener(tracker);
       
       //jlabel for held dice
       keptDice = new JLabel("Dice being held:");
       keptDice.setFont(new Font("Calibri", Font.PLAIN, 12));
       add(keptDice);
       keptDice.setVisible(false);
   }
         
      
       
       
       
       
       
       
       
             
             
         
                 
            
            
                    
                
                
                    
        
            
       
      
    
    
    
        
    

                            
                            
