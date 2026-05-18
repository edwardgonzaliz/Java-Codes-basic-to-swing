//Java JButton Example with ActionListener
import java.awt.event.*;
import javax.swing.*;    
public class Swing_Btn_3_withhActionListner 
{  
	public static void main(String[] args) 
	{  
		JFrame f=new JFrame("Button Example");  
		final JTextField tf=new JTextField();  
		tf.setBounds(50,50, 150,20);  
		JButton b=new JButton("Click Here");  
		b.setBounds(50,100,95,30);  
		b.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{  
				tf.setText("HELLO ...");  
			}  
		});  
		f.add(b);
		f.add(tf);  
		f.setSize(400,400);  
		f.setLayout(null);  
		f.setVisible(true);   
	}  
}  
/*
The addActionListener() method is used to detect clicks on the button.
actionPerformed(ActionEvent e) is triggered when the button is clicked.
tf.setText("HELLO ..."); updates the text field to display "HELLO ...".
new ActionListener() is an anonymous inner class 
implementing ActionListener to handle the button click event.*/