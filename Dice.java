import javax.swing*;
import javax.JLabel;
import javax.JTextField;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import java.util.Vector;
import java.awt.event.*;
import javax.swing.*;

public class Dice extends JFrame
{
    private Color cardCol = new Color(255,102,0);
    private int diceNumber;
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
            else if(x == 6)
            {
                dieNum = 6;
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
       
             
             
         
                 
            
            
                    
                
                
                    
        
            
       
      
    
    
    
        
    

                            
                            
