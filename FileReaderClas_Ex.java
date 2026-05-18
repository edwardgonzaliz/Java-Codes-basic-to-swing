//Java FileOutputStream Example 1: write byte
//The content of a text file testout.txt is set with the data A.
//Java FileOutputStream is an output stream used for writing data to a file.
//Create a file testout9.txt and write
import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\Users\\KIIT\\Desktop\\testout9.txt");    
             fout.write(66);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  