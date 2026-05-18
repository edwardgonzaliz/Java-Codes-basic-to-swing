
//Example of displaying image on the button
import javax.swing.*;      
public class Swing_Disp_Img_onButton{    
	Swing_Disp_Img_onButton(){    
		JFrame f=new JFrame("Button Example");            
		JButton b=new JButton(new ImageIcon("C:\\Users\\KIIT\\Desktop...path only"));    
		b.setBounds(100,100,100, 40);    
		f.add(b);    
		f.setSize(300,400);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	}         
	public static void main(String[] args) {    
		new Swing_Disp_Img_onButton();    
	}    
}    
