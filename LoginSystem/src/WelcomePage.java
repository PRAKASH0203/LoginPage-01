import java.awt.Color;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	
	JFrame frame =new JFrame();
	JLabel welcomepage =new JLabel();
	
	WelcomePage(String usreID){
		
		welcomepage.setBounds(175,50,200,25);
		welcomepage.setFont(new Font(null,Font.PLAIN,20));
		welcomepage.setText("WELCOME"+"JAVA");
		
		frame.add(welcomepage);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.gray);
		
		
	}
	
	
	
}
