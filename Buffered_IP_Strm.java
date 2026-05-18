/*
import java.io.FileReader;

public class A1_FILNOTFOUNDEXCP 
{
	public static void main(String[] args) {
		FileReader fr = new FileReader("example.txt"); // Compilation Error: Unhandled exception
		System.out.println("File opened successfully.");
	}
}   
Unhandled exception type FileNotFoundException
Since FileReader may throw a FileNotFoundException, 
Java requires explicit handling using try-catch or throws.
*/
//SOLUTION
import java.io.FileReader;
import java.io.FileNotFoundException;

public class A1_FILNOTFOUNDEXCP {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}