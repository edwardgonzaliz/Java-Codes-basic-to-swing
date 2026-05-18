
/*Java BufferedOutputStream class is used for buffering an output stream. 
 It internally uses buffer to store data. It adds more efficiency than to write data directly into 
 a stream. So, it makes the performance fast.
For adding the buffer in an OutputStream, use the BufferedOutputStream class. 
syntax for adding the buffer in an OutputStream:
OutputStream os= new BufferedOutputStream(new FileOutputStream("C:\\Users\\KIIT\\Desktop\\testout4.txt
In this example,
 we are writing the textual information in the BufferedOutputStream object which is 
 connected to the FileOutputStream object. 
 The flush() flushes the data of one stream and send it into another. 
 It is required if you have connected the one stream with another.
*/
 
import java.io.*;  
public class Buffered_OP_Strm_Clas{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("C:\\Users\\KIIT\\Desktop\\testout4.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to JAVA";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  
