/*Java BufferedInputStream class is used to read information from stream.
 * It internally uses buffer mechanism to make the performance fast.*/
import java.io.*;  
public class Buffered_IP_Strm {    
 public static void main(String args[]){    
  try{    
    FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Desktop\\testout3.txt");    
    BufferedInputStream bis=new BufferedInputStream(fis);    
    int i;    
    while((i=bis.read())!=-1){    
     System.out.print((char)i);    
    }    
    bis.close();    
    fis.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}
/*
FileInputStream is used to read the file byte by byte.
BufferedInputStream wraps FileInputStream to improve efficiency 
by reading data in chunks instead of one byte at a time.
Reads the file byte by byte using bis.read().
-1 indicates the end of the file (EOF).
Each byte (i) is converted to a character and printed.
bis.close(): Closes the BufferedInputStream.
fis.close(): Closes the FileInputStream.
*/