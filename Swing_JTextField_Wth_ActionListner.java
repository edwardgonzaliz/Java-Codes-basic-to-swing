//Simple example of Swing by inheritance. We can also inherit the JFrame class,
//so there is no need to create the instance of JFrame class explicitly.

import javax.swing.*;  
public class Swing_Inherit extends JFrame{//inheriting JFrame  
	JFrame f;  
	Swing_Inherit()
	{  
		JButton b=new JButton("click");//create button  
		b.setBounds(130,100,100, 40);  

		add(b);//adding button on frame  
		setSize(400,500);  
		setLayout(null);  
		setVisible(true);  
	}  
	public static void main(String[] args) {  
		new Swing_Inherit();  
	}
	}  

