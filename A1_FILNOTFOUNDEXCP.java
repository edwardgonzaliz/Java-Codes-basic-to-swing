
import java.io.FileWriter;
import java.io.IOException;

public class A1_FIENOTCLOSE_OBJ {
    public static void main(String[] args) throws IOException {
        FileWriter fc = new FileWriter("C:\\Users\\KIIT\\Desktop\\HW.txt");
        fc.write("Hello, World!"); // Data might not be written if file is not closed.
        //fc.close();
    }
}
