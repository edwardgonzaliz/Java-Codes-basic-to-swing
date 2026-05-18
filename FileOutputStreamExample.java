//Java FileOutputStream example 2: write string
//Java FileOutputStream is an output stream used for writing data to a file.
//Create a file testout10.txt and write
import java.io.FileOutputStream;  
public class FileOtPtStrm_String {  
	public static void main(String args[]){    
		try{    
FileOutputStream fout=new FileOutputStream("C:\\Users\\KIIT\\Desktop\\testout10.txt");    
			String s="KIIT CSE 10-47 JAVA";    
			byte b[]=s.getBytes();//converting string into byte array    
			fout.write(b);    
			fout.close();    
			System.out.println("success...");    
		}catch(Exception e){System.out.println(e);}    
	}    
}  

