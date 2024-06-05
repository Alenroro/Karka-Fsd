
import java.io.*;
import java.util.*;

public class Classcnvrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        while (true) {
            ArrayList<String> row = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter the Content: ");
                String input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("s")) {
                    break;
                }
                row.add(input);
            }
            if (row.isEmpty()) {
                break;
            }
            data.add(row);
            
            System.out.print("Do you want to save the data (Y/N)? ");
            String saveChoice = scanner.nextLine().trim();
            if (saveChoice.equalsIgnoreCase("Y")) {
                saveData(data);
            }
        }
    scanner.close();

    }

    private static void saveData(ArrayList<ArrayList<String>> data) {
        try {
            File directory = new File("data_folder");
            if (!directory.exists()) {
                directory.mkdirs(); 
            }
            FileWriter writer = new FileWriter("data_folder/data.csv", true); // Append mode
            for (ArrayList<String> row : data) {
                for (String value : row) {
                    writer.append(value);
                    writer.append(",");
                }
                writer.append("\n");
            }
            writer.flush();
            writer.close();
            System.out.println("Data has been successfully saved to data.csv file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}