/*Java JLabeL
The object of JLabel class is a component for placing text in a container. 
It is used to display a single line of read only text. 
The text can be changed by an application but a user cannot edit it directly. 
It inherits JComponent class.
*/
import javax.swing.*;  
class Swing_JLabel_1  
{  
	public static void main(String args[])  
	{  
		JFrame f= new JFrame("Label Example");  
		JLabel l1,l2;  
		l1=new JLabel("First Label.");  
		l1.setBounds(50,50, 100,30);  
		l2=new JLabel("Second Label.");  
		l2.setBounds(50,100, 100,30);  
		f.add(l1); 
		f.add(l2);  
		f.setSize(300,300);  
		f.setLayout(null);  
		f.setVisible(true);  
	}  
}  