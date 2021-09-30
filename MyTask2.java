import java.util.Scanner;

public class MyTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ რიცხვი ");
        int number = scanner.nextInt();
        if(number%2 == 0){
            System.out.print("ლუწი");
        }
        if(number%2 != 0){
            System.out.print("კენტი");
        }
    }
}
