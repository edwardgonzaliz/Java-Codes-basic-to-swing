
import java.io.IOException; 
import java.io.RandomAccessFile;  

public class RandomAccessFile_Ex{  
	static final String FILEPATH ="C:\\Users\\KIIT\\Desktop\\MyFile1.txt";  
	public static void main(String[] args) {  
		try {  
			System.out.println(new String(readFromFile(FILEPATH, 0, 18)));  //UPTO 18 CHARACTER
			writeToFile(FILEPATH, "I love my country and my people", 50); //START AFTER 50 CHAR 
		} catch (IOException e) {  
			e.printStackTrace();  
		}  
	}  
	private static byte[] readFromFile(String filePath, int position, int size)  
			throws IOException {  
		RandomAccessFile file = new RandomAccessFile(filePath, "r");  
		file.seek(position);  
		byte[] bytes = new byte[size];  
		file.read(bytes);  
		file.close();  
		return bytes;  
	}  
	private static void writeToFile(String filePath, String data, int position)  
			throws IOException {  
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
		file.seek(position);  
		file.write(data.getBytes());  
		file.close();  
	}  
}  

