import java.util.Scanner;

public class rs_value_in_array {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            System.out.println("Position of the students in the list" + input_name + "is: " + i);
            isExist = true;
            break;
        }
        if(!isExist){
            System.out.println("Not found" + input_name + "in the list.");
        }
    }
}
