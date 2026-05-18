/*Java FileReader class is used to read data from the file.
 It returns data in byte format like FileInputStream class.
 It is character-oriented class which is used for file handling in java.*/
//Java FileReader Example
//In this example, we are reading the data from the text file testout11.txt using Java FileReader class.

import java.io.FileReader;  
public class FileReaderClas_Ex{  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("C:\\Users\\KIIT\\Desktop\\testout11.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    

