/*Java DataOutputStream class allows an application to write primitive Java data type
 to the output stream in a machine-independent way.
Java application generally uses the data output stream to write data 
that can later be read by a data input stream.
 * Example of DataOutputStream class
In this example, we are writing the data to a text file testout6.txt using DataOutputStream class.
*/
import java.io.*;  
public class Data_OP_Strm  {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("C:\\Users\\KIIT\\Desktop\\testout6.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65); 
        data.writeInt(66);
        data.writeInt(97);
        data.writeInt(122);
        data.writeInt(124);
        data.writeInt(129);
        data.writeInt(139);
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  
	