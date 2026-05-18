/*Java DataInputStream class allows an application to read primitive data from the
 input stream in a machine-independent way.
Java application generally uses the data output stream to write data that can later 
be read by a data input stream.
Example of DataInputStream class
In this example, we are reading the data from the file testout.txt file.
*/

import java.io.*;    
public class Data_IP_Stream {  
  public static void main(String[] args) throws IOException {  
    InputStream input = new FileInputStream("C:\\\\Users\\\\KIIT\\\\Desktop\\\\testout5.txt");  
    DataInputStream inst = new DataInputStream(input);  
    int count = input.available();  
    byte[] ary = new byte[count];  
    inst.read(ary);  
    for (byte i : ary) {  
      char k = (char) i;       
      System.out.print(k); 
      //System.out.print(k+"-"); 
    }  
  }  
}  
/*
Opens testout5.txt for reading as a byte stream.
Allows reading primitive data types and file content in bytes.(DataInputStream inst = new DataInputStream(input);  )
available() returns the number of remaining bytes in the file.
Reads all bytes from the file into the ary array.[byte[] ary = new byte[count];     inst.read(ary);  ]
Iterates through ary, converts each byte to a char, and prints it followed by a hyphen (-). (Line 17-20 for Loop)
*/