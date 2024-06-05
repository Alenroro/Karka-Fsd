import java.io.*;
import java.util.*;
import com.karka.dataclasses.Student;

public class Objtocsvcnvrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studList = getStudents(sc);
        List<String> studCSV = new ArrayList<String>();
        
        for (Student student : studList) {
            String csv = student.getCSV();
            studCSV.add(csv);
        }

        try {
            addCSVToFile(studCSV);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    public static void addCSVToFile(List<String> studList) throws IOException {
        FileWriter writer = new FileWriter("data_folder/one.csv", true);
        for (String csvRow : studList) {
            writer.append(csvRow);
            writer.append("\n");
        }
        writer.flush();
        writer.close();
    }

    public static List<Student> getStudents(Scanner sc) {
        List<Student> studList = new ArrayList<Student>();
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Do you want to add a new student record? Yes/No : ");
            String addNew = sc.nextLine();
            exit = addNew.equals("No");
            if (exit) {
                break;
            }

            Student stud = new Student();
            System.out.println("Enter student's name : ");
            String name = sc.nextLine();
            System.out.println("Enter student's age : ");
            String age = sc.nextLine();
            System.out.println("Enter student's gender : ");
            String gender = sc.nextLine();
            System.out.println("Enter student's mobile : ");
            String mobile = sc.nextLine();
            System.out.println("Enter student's location : ");
            String location = sc.nextLine();

            stud.name = name;
            stud.age = age;
            stud.gender = gender;
            stud.mobile = mobile;
            stud.location = location;

            studList.add(stud);
        }

        return studList;
    }
}
