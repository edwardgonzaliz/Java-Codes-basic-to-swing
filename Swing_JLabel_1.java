/*The JButton class is used to create a labeled button that has platform independent
implementation. 
The application result in some action when the button is pushed. 
It inherits AbstractButton class.*/

import javax.swing.*;    
public class Swing_Button_2 
{  
	public static void main(String[] args) 
	{  
		JFrame f=new JFrame("Button Example");  
		JButton b=new JButton("Click Here");  
		b.setBounds(50,100,95,30);  
		f.add(b);  
		f.setSize(400,400);  
		f.setLayout(null);  
		f.setVisible(true);   
	}  
} 
