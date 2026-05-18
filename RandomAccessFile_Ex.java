/*Java PrintWriter class is the implementation of Writer class.
 It is used to print the formatted representation of objects to the text-output stream.
 Java PrintWriter Example: 
 simple example of writing the data on a console and in a text file testout.txt 
 using Java PrintWriter class.
 */
import java.io.File; 
import java.io.PrintWriter;  
public class PrintWriter_Ex {  
	public static void main(String[] args) throws Exception {  
		//Data to write on Console using PrintWriter  
		PrintWriter writer = new PrintWriter(System.out);    
		writer.write("PRINTWRITER EXAMPLE");        
		writer.flush();  
		writer.close();  
		//Data to write in File using PrintWriter       
		PrintWriter writer1 =null;      
		writer1 = new PrintWriter(new File("C:\\Users\\KIIT\\Desktop\\testout14.txt"));  
		writer1.write("KIIT COMPUTER ENGINEERING CSE 44");                                                   
		writer1.flush();  
		writer1.close();  
	}  
}  
