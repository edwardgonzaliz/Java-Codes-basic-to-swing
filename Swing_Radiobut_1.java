//Java JLabel Example with ActionListener 

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class Swing_JLabel_With_ActionListner extends Frame implements ActionListener{  
	JTextField tf; JLabel l; JButton b;  
	Swing_JLabel_With_ActionListner(){  
		tf=new JTextField();  
		tf.setBounds(50,50, 150,20);  
		l=new JLabel();  
		l.setBounds(50,100, 250,20);      
		b=new JButton("Find IP");  
		b.setBounds(50,150,95,30);  
		b.addActionListener(this);    
		add(b);add(tf);add(l);    
		setSize(400,400);  
		setLayout(null);  
		setVisible(true);  
	}  
	public void actionPerformed(ActionEvent e) {  
		try{  
			String host=tf.getText();  
			String ip=java.net.InetAddress.getByName(host).getHostAddress();  //The IP address 127.0.0.1 is known as the loopback address or localhost.
			l.setText("IP of "+host+" is: "+ip);  
		}catch(Exception ex){System.out.println(ex);}  
	}  
	public static void main(String[] args) {  
		new Swing_JLabel_With_ActionListner();  
	} }  

