/*Java FileInputStream class obtains input bytes from a file.
 It is used for reading byte-oriented data (streams of raw bytes) 
 such as image data, audio, video etc. 
 You can also read character-stream data. 
 But, for reading streams of characters, it is recommended to use FileReader class.*/
//Java FileInputStream example 1: read single character
import java.io.FileInputStream;  
public class File_Inp_StrmClas {  
     public static void main(String args[]){    
          try{    
            FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Desktop\\testout1.txt");    
            int i=fis.read(); 
            System.out.println(i);
            System.out.print((char)i);    
  
            fis.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  
//text file named as "testout1.txt" is created. 
//Only read 1st character and print
