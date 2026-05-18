//Java FileInputStream example 2: read all characters
  
import java.io.FileInputStream;  
public class File_Inp_StrmClas_2 {  
     public static void main(String args[]){    
          try{    
            FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Desktop\\testout2.txt");    
            int i=0;    
            while((i=fis.read())!=-1){    
             System.out.print((char)i);    
            }    
            fis.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  

