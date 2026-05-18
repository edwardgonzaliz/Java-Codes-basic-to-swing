//Example of Swing by Association inside constructor. We can also write all the codes
//of creating JFrame, JButton and method call inside the java constructor.


	import javax.swing.*;  
	public class Association_Constructor {  
	JFrame f;  
	Association_Constructor(){  
	f=new JFrame();//creating instance of JFrame  
	          
	JButton b=new JButton("click");//creating instance of JButton  
	b.setBounds(130,100,100, 40);  
	          
	f.add(b);//adding button in JFrame  
	          
	f.setSize(400,500);//400 width and 500 height  
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible  
	}  
	  
	public static void main(String[] args) {  
	new Association_Constructor();  
	}  
	}  
