import java.awt.event*;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing*;

public class ScoreCard extends JFrame
{
    ScoreCardJPanel scjp;
    static int num;
    public static void main(String args[])
    {
        JFrame jframe = new JFrame("ScoreCard");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //set default background color
        jframe.getContentPane().setBackground(Color.WHITE);
        
        JLabel playername = new JLabel(yahtzee.Player.name + "	");
		    name.setFont(new Font("Calibri", Font.PLAIN, 24));
		    frame.add(playername);
		  
		
		    frame.setLayout(new FlowLayout()); //set flow layout
		
		    ScoreCardJPanel scjp = new ScoreCardJPanel();
	    	//put scorecard in frame
        frame.add(scjp); 
        
	    	frame.setVisible(true);
    }
    
    ScoreCard()
    {
    }
}
        
