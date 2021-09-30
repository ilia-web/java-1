import java.util.Scanner;

public class MyTask1 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.print("enter number ");
    int firstNum = scanner.nextInt();

        if (firstNum > 0){
            System.out.println("დადებითი");
        }
        if (firstNum < 0){
            System.out.println("უარყოფითი");
        }
        if (firstNum == 0){
            System.out.println("0 ტოლია");
        }

    }


}

