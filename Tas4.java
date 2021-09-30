import java.util.Scanner;

public class Tas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანე პირველი რიცხვი ");
        int x = scanner.nextInt();
        System.out.print("შეიყვანე მეორე რიცხვი ");
        int y = scanner.nextInt();
        System.out.print("შეიყვანე მესამე რიცხვი ");
        int z = scanner.nextInt();


        if(x<y && x<z){
            System.out.println(z);
            System.out.println(y);
            System.out.println(x);;
        }

        int jami = ((x+y+z)/3);
        System.out.println("საშუალო " + jami);
    }
}

