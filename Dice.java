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
        private int numOnDie;
      
    
    
    
