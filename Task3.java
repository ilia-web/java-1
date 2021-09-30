import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ რიცხვი ");
        int number = scanner.nextInt();


        if (number%4 ==0 ){
            System.out.println("წელი ნაკიანია");
        }

        if (number%4 !=0 ){
            System.out.println("წელი არ არის ნაკიანია");
        }
    }
}
