import java.io.File;
import java.io.IOException;

public class ioexception {
    public static void main(String[] args) {
        File myFile = new File("myRecords.pdf");
        Boolean isCreated;
        try {
            isCreated = myFile.createNewFile();

            if(isCreated){
                System.out.println("File Created " + myFile.getName());
            }
            else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Unable to create file " + e.getMessage());
            e.printStackTrace();
        }
    }
}
