
public class task {
    
    public static void main(String[] args) {
        age newTask=new age();
        newTask.setName(20);;
        if (newTask.getName() < 16) {
            System.out.println("You can't drive.");
        }else if(newTask.getName()>=16 && newTask.getName()<=17){
            System.out.println("You can drive but not vote.");
        }else if(newTask.getName()>=18 && newTask.getName()<=24){
            System.out.println("You can vote but not rent a car.");
        }else{
            System.out.println("You are elligible");

        }
    }
}
