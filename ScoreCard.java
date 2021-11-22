import java.awt.event*;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing*;
import java.awt.Dimension;

public class ScoreCard extends JFrame
{
    ScoreCardJPanel scjp;
    static int num;
    public static void main(String args[])
    {
        JFrame jframe = new JFrame("ScoreCard");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //set default background color
        jframe.getContentPanel().setBackground(Color.WHITE);
        
        JLabel playername = new JLabel(yahtzee.Player.name + "	");
	name.setFont(new Font("Calibri", Font.PLAIN, 24));
        jframe.add(playername);
	JLabel playerchar = new JLable(Yahtzee.Player.charpicked);
	playercharacter.setSize(24,24);
	jframe.add(playercharacter);
		  
	//set flow layout	
        frame.setLayout(new FlowLayout()); 
		
        ScoreCardJPanel scjp = new ScoreCardJPanel();
	//put scorecard in frame
        frame.add(scjp); 
	frame.setVisible(true);
    }
    
    ScoreCard()
    {
    }
}

class ScoreCardJPanel extends JPanel
{
    private LowercardJpanel l;
    private UppercardJPanel u;
    //figure out pathway below
    ImageIcon win = new ImageIcon(src/hw)
    //store lower points
    private int lower[] = new int[7];
    //store upper points
    private int upper[] = new int[6];
    //turn tracker
    static int turnTracker = 0;
    int sum = 0;
    //point tally
    private int points = 0;
    //upper points
    private int upoints = 0;
    //lower points 
    private int lpoints = 0;
    private JLabel finalTotal;
    private JLable fTotal;
    //total number of points
    private int totalPoints;
    //setting colors 
    private Color cardC = new Color(255,0,0); //red
    private color bC = new Color(255,245,108); //yellow
    
    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(450,550);
    }
    
    class UppercardJPanel extends JPanel
    {
        private JLabel heading;
        //category buttons
	private JButton b1, b2, b3, b4 , b5, b6;
	//point display
	private JLabel p1, p2, p3, p4, p5, p6, totalUP, totalUP2;
	
	public  UppercardJPanel()
	{
	    setBackground(cardC);
	    setLayout(new GridLayout(8,2,10,10);
	    //labels and buttons
	    heading = new JLabel("Upper Card");
	    heading.setFont(new Font("Calibri", Font.PLAIN, 12));
	    
	    b1 = new JButton("Aces");
	    b1.setPrefferedSize(new Dimension(10,10));
	    b1.setFont(new Font("Calbri", Font.PLAIN, 12));
	    b1.addActionListener(new ActionUpper1());
	    
	    p1 = new JLabel(String.valueOf(upper[0]));
	    p1.setFont(new Font("Calibri", Font.PLAIN, 12));
	    
	    b2 = new JButton("Twos");
	    b2.setFont(new Font("Calbri", Font.PLAIN, 12));
	    b2.addActionListener(new ActionUpper2());
	    
	    p2 = new JLabel(String.valueOf(upper[1]));
	    p2.setFont(new Font("Calibri", Font.PLAIN, 12));
	    
	    b3 = new JButton("Threes");
	    b3.setFont(new Font("Calbri", Font.PLAIN, 12));
	    b3.addActionListener(new ActionUpper3());
	    
	    p3 = new JLabel(String.valueOf(upper[2]));
	    p3.setFont(new Font("Calibri", Font.PLAIN, 12));
	    
	    b4 = new JButton("Fours");
	    b4.setFont(new Font("Calbri", Font.PLAIN, 12));
	    b4.addActionListener(new ActionUpper4());
	    
	    p4 = new JLabel(String.valueOf(upper[3]));
	    p4.setFont(new Font("Calibri", Font.PLAIN, 12));
	    
	    b5 = new JButton("Fives");
	    b5.setFont(new Font("Calbri", Font.PLAIN, 12));
	    b5.addActionListener(new ActionUpper5());
	    
	    p5 = new JLabel(String.valueOf(upper[4]));
	    p5.setFont(new Font("Calibri", Font.PLAIN, 12));
	    
	    b6 = new JButton("Sixes");
	    b6.setFont(new Font("Calbri", Font.PLAIN, 12));
	    b6.addActionListener(new ActionUpper6());
	    
	    p6 = new JLabel(String.valueOf(upper[5]));
	    p6.setFont(new Font("Calibri", Font.PLAIN, 12));
	    
	    totalUP = new JLabel("Upper Score");
	    totalUP.setFont(new Font("Calibri", Font.PLAIN);
	    
	    upoints = pointsTally(upper);
	    totalUP2 = new JLabel(String.valueOf(upoints));
	    totalUP2.setFont(new Font("Calibri", Font.PLAIN, 12));
	    
	    //add all labels and headers
	    add(heading);
	    add(new JLabel(""));
	    add(b1);
	    add(p1);
	    add(b2);
	    add(p2);
	    add(b3);
	    add(p3);
	    add(b4);
	    add(p4);
	    add(b5);
	    add(p5);
	    add(b6);
	    add(p6);
	    add(totalUP);
	    add(totalUP2);
	    }
	    //aces button
	    class ActionUpper1 implements ActionListener
	    {
	        public void actionPerformed(ActionEvent event)
		    //calculate the num of dice points
		    sum = dicePoints(1);
		    upper[0] = sum;
		    //update num of points on card
		    p1.setText(String.valueof(upper[0]);
		    sum = 0;
		    //total update on card
		    upoints = pointsTally(upper);
		    totalUP.setText(string.valueOf(upoints));
		    Jbutton source = (JButton) event.getSource();
		    //so you cant click twice
		    source.setEnabled(false);
		    
		    totalPoints = pointsTally(upper) + pointsTally(lower);
		    fTotal.setText(string.valueOf(totalPoints);
		    turnTracker++;
		}
            }
	    //action lister for twos  
	    class ActionUpper2 implements ActionListener
	    {
	        public void actionPerformed(ActionEvent event)
		{
		    //calculate num on dice
		    sum = dicePoints(2);
		    upper[1] = sum,;
		    p2.setText(String.valueOf(upper[1]));
		    sum = 0;
		    //upper total on card updated
		    upoints = pointsTally(upper);
		    totalUP.setText(string.valueOf(upoints));
		    JButton source (JButton) event.getSource();
		    //stops from double clicking
		    source.setEnabled(false);
		    totalPoints = pointsTally(upper) + pointsTally(lower);
		    fTotal.setText(String.valueOf(totalPoints));
		    //add number to turn tracker
		    turnTracker++;
		 }
	     }
	     //action listerns for next buttons are similar to previous two
	     class ActionUpper3 implements ActionListener
	    {
	        public void actionPerformed(ActionEvent event)
		{
		    //calculate num on dice
		    sum = dicePoints(3);
		    upper[2] = sum,;
		    p2.setText(String.valueOf(upper[2]));
		    sum = 0;
		    //upper total on card updated
		    upoints = pointsTally(upper);
		    totalUP.setText(string.valueOf(upoints));
		    JButton source (JButton) event.getSource();
		    //stops from double clicking
		    source.setEnabled(false);
		    totalPoints = pointsTally(upper) + pointsTally(lower);
		    fTotal.setText(String.valueOf(totalPoints));
		    //add number to turn tracker
		    turnTracker++;
		 }
	     }
	     class ActionUpper4 implements ActionListener
	     {
	        public void actionPerformed(ActionEvent event)
		{
		    //calculate num on dice
		    sum = dicePoints(4);
		    upper[3] = sum,;
		    p2.setText(String.valueOf(upper[3]));
		    sum = 0;
		    //upper total on card updated
		    upoints = pointsTally(upper);
		    totalUP.setText(string.valueOf(upoints));
		    JButton source (JButton) event.getSource();
		    //stops from double clicking
		    source.setEnabled(false);
		    totalPoints = pointsTally(upper) + pointsTally(lower);
		    fTotal.setText(String.valueOf(totalPoints));
		    //add number to turn tracker
		    turnTracker++;
		 }
	     }
	     class ActionUpper5 implements ActionListener
	     {
	        public void actionPerformed(ActionEvent event)
		{
		    //calculate num on dice
		    sum = dicePoints(5);
		    upper[4] = sum,;
		    p2.setText(String.valueOf(upper[4]));
		    sum = 0;
		    //upper total on card updated
		    upoints = pointsTally(upper);
		    totalUP.setText(string.valueOf(upoints));
		    JButton source (JButton) event.getSource();
		    //stops from double clicking
		    source.setEnabled(false);
		    totalPoints = pointsTally(upper) + pointsTally(lower);
		    fTotal.setText(String.valueOf(totalPoints));
		    //add number to turn tracker
		    turnTracker++;
		 }
	     }
	     class ActionUpper6 implements ActionListener
	     {
	        public void actionPerformed(ActionEvent event)
		{
		    //calculate num on dice
		    sum = dicePoints(6);
		    upper[5] = sum,;
		    p2.setText(String.valueOf(upper[5]));
		    sum = 0;
		    //upper total on card updated
		    upoints = pointsTally(upper);
		    totalUP.setText(string.valueOf(upoints));
		    JButton source (JButton) event.getSource();
		    //stops from double clicking
		    source.setEnabled(false);
		    totalPoints = pointsTally(upper) + pointsTally(lower);
		    fTotal.setText(String.valueOf(totalPoints));
		    //add number to turn tracker
		    turnTracker++;
		 }
	     }
	 }
	 //special combinations scorecard
	 class LowercardJPanel extends JPanel
	 {
	     private JLabel heading2;
	     //buttons for dif special combos
	     private JButton Yah;
	     private JButton largeSt;
	     private JButton smallSt;
	     private JButton threeofK;
	     private JButton fourofK;
	     private JButton fullHouse;
	     private JButton chance;
	     //points in each special combo 
	     private JLabel pYah;
	     private JLabel plargeSt;
	     private JLabel psmallSt;
	     private JLabel pthreeofK;
	     private JLabel pfourofK;
	     private JLabel pfullHouse;
	     private JLabel pchance;
	     private JLable totalLOW, totalLOW2;
	     
	     public LowercardJPanel()
	     {
	         setBackground(cardC);
	         setLayout(new GridLayout(9,2,10,10);
	         //labels and buttons
	         heading2 = new JLabel("Lower Card");
	         heading2.setFont(new Font("Calibri", Font.PLAIN, 12));
		 
		 Yah = new JButton("Yahtzee!");
		 Yah.setPrefferedSize(new Dimension(10,10));
		 Yah.setFont(new Font("Calibri", Font.PLAIN, 12));
		 Yah.addActionListener(new ActionLowerYah());
		 pYah = new JLabel(String.valueOf(lower[0]));
		 pYah.setFont(new Font("Calibri", Font.PLAIN, 12));
		 
		 largeSt = new JButton("Large Straight");
		 largeSt.setPrefferedSize(new Dimension(10,10));
		 largeSt.setFont(new Font("Calibri", Font.PLAIN, 12));
		 largeSt.addActionListener(new ActionLowerlargeSt());
		 plargeSt = new JLabel(String.valueOf(lower[1]));
		 plargeSt.setFont(new Font("Calibri", Font.PLAIN, 12));
		 
		 smallSt = new JButton("Small Straight");
		 smallSt.setPrefferedSize(new Dimension(10,10));
		 smallSt.setFont(new Font("Calibri", Font.PLAIN, 12));
		 smallSt.addActionListener(new ActionLowersmallSt());
		 psmallSt = new JLabel(String.valueOf(lower[2]));
		 psmallSt.setFont(new Font("Calibri", Font.PLAIN, 12));
		 
		 threeofK = new JButton("Three of a Kind");
		 threeofK.setPrefferedSize(new Dimension(10,10));
		 threeofK.setFont(new Font("Calibri", Font.PLAIN, 12));
		 threeofK.addActionListener(new ActionLowerthreeofK());
		 pthreeofK = new JLabel(String.valueOf(lower[3]));
		 pthreeofK.setFont(new Font("Calibri", Font.PLAIN, 12));
		 
		 fourofK = new JButton("Four of a Kind");
		 fourofK.setPrefferedSize(new Dimension(10,10));
		 fourofK.setFont(new Font("Calibri", Font.PLAIN, 12));
		 fourofK.addActionListener(new ActionLowerfourofK());
		 pfourofK = new JLabel(String.valueOf(lower[4]));
		 pfourofK.setFont(new Font("Calibri", Font.PLAIN, 12));
		 
		 fullHouse = new JButton("Full House");
		 fullHouse.setPrefferedSize(new Dimension(10,10));
		 fullHouse.setFont(new Font("Calibri", Font.PLAIN, 12));
		 fullHouse.addActionListener(new ActionLowerfullHouse());
		 pfullHouse = new JLabel(String.valueOf(lower[5]));
		 pfullHouse.setFont(new Font("Calibri", Font.PLAIN, 12));
		 
		 chance = new JButton("Chance");
		 chance.setPrefferedSize(new Dimension(10,10));
		 chance.setFont(new Font("Calibri", Font.PLAIN, 12));
		 chance.addActionListener(new ActionLowerchance());
		 pchance = new JLabel(String.valueOf(lower[6]));
		 pchance.setFont(new Font("Calibri", Font.PLAIN, 12));
	
	         totalLOW = new JLabel("Lower Score");
		 totaLOW.setFont)new Font("Calibri, Font.PLAIN, 12));
		 
		 lpoints = pointsTally(lower);
		 totalLOW2 = new JLabel9string.valueOf(lpoints);
		 totalLOW2.setFont(new Font("Calibri, Font.PLAIN, 12));
		 
		 add(heading2);
		 add(new JLabel(""));
		 add(Yah);
		 add(pYah);
		 add(largeSt);
		 add(plargeSt);
		 add(smallSt);
		 add(psmallSt);
		 add(threeofK);
		 add(pthreeofK);
		 add(fourofK);
		 add(pfourofK);
		 add(fullHouse);
		 add(pfullHouse);
		 add(chance);
		 add(pchance);
		 add(totalLOW);
		 add(totalLOW2);
	     }
	     class ActionLowerYah implements ActionLiustener
	     {
	 
		    
	    
	    
       

   
