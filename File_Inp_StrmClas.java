/*Java FileWriter class is used to write character-oriented data to a file.
  It is character-oriented class which is used for file handling in java. 

Unlike FileOutputStream class, you don't need to convert string into byte array 
because it provides method to write string directly.
Java FileWriter Example
In this example, we are writing the data in the file testout12.txt using Java FileWriter class.
*/
import java.io.FileWriter;  
public class FileWriterClass {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("C:\\Users\\KIIT\\Desktop\\testout12.txt");    
           fw.write("Welcome to java_FileWriter Example");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  