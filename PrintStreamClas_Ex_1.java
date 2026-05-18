/*The PrintStream class provides methods to write data to another stream.
The PrintStream class automatically flushes the data so there is no need to call flush() method. 
Moreover, its methods don't throw IOException.
Example of java PrintStream class
In this example, we are simply printing integer and string value.
 */
import java.io.FileOutputStream;  
import java.io.PrintStream;  
public class PrintStreamClas_Ex {    
 public static void main(String args[])throws Exception{    
   FileOutputStream fout=new FileOutputStream("C:\\Users\\KIIT\\Desktop\\testout13.txt ");    
   PrintStream pout=new PrintStream(fout);    
   pout.println(44_2025);   
   pout.println(44-2025);
   pout.println(2025-44);
   pout.println(1+2);
   pout.println(1-2);
   pout.println(44.55);
   pout.println("WELCOME");    
   pout.println("TO JAVA");  
   pout.println('A');
   pout.close();    
   fout.close();    
  System.out.println("Success?");    
 }    
}    
   
