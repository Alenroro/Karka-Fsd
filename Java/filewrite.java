import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) throws IOException {
        FileWriter a = new FileWriter("text.txt");
        a.write("asdfghjkl;");
        a.close();
        
    }
}
