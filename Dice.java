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
                    icon = new ImageIcon(getClass().getResource("die1.png"))
                    label = new JLabel(icon);
        
            
       
      
    
    
    
