import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;



 public class LoginPage implements ActionListener {
	
	
	private static final Component Login = null;
	JFrame frame =new JFrame();
	
	
	JButton loginButton =new JButton("Login");
	JButton resetButton =new JButton("Reset");
	JTextField userIDField=new JTextField();
	JPasswordField userpasswordField =new JPasswordField();
	JLabel  LOGIN =new JLabel("LOGIN:");
	JLabel NAMELabel =new JLabel("NAME:");
	JLabel userPASSWORDLabel =new JLabel("PASSWORD:");
	JLabel messageLabel= new JLabel("");
	
	
	HashMap<String,String> logininfo=new HashMap<String,String>();
    LoginPage(HashMap<String,String> loginInfoOriginal){
	logininfo =loginInfoOriginal;
	logininfo.put("login","1234");
	
	 LOGIN.setBounds(175,50,75,25);
	
	NAMELabel.setBounds(85,100,100,25);
	userPASSWORDLabel.setBounds(50,150,75,25);
	
	messageLabel.setBounds(85,250,400,25);
	messageLabel.setFont(new Font(null,Font.ITALIC,25));
	
	userIDField.setBounds(125,100,200,25);
	userpasswordField.setBounds(125,150,200,25);
	
	loginButton.setBounds(125,200,100,25);
	loginButton.setFocusable(false);
	loginButton.addActionListener(this);
	
	resetButton.setBounds(200,200,125,25);
	resetButton.setFocusable(false);
	resetButton.addActionListener(this);
	
  
	frame.add(LOGIN);
	frame.add(NAMELabel);
	frame.add(userPASSWORDLabel);
	frame.add(messageLabel);
	frame.add(userIDField);
	frame.add(userpasswordField );
	frame.add(loginButton);
	frame.add(resetButton);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame. setSize(420,420);
	frame.getContentPane().setBackground(Color.yellow);
	frame.setLayout(null);
	frame.setVisible(true);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==resetButton) {
		userIDField.setText("");
		userpasswordField.setText("");
		

	}
	if(e.getSource()==loginButton) {
		String userID = userIDField.getText();
		String password =String.valueOf(userpasswordField.getPassword());

		if(logininfo.containsKey(userID)) {
			if(logininfo.get(userID).equals(password)) {
				messageLabel.setForeground(Color.black);
				messageLabel.setText("login sucessful");
				frame.dispose();
				WelcomePage welcomepage= new WelcomePage(userID);
				
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("WRONG PASSWORD");
			}
		}
		else {
			messageLabel.setForeground(Color.black);
			messageLabel.setText(" WRONG USER NAME");
		}
		
	}
	
}
}
