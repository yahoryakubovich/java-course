import java.util.Scanner;

public class Сonditionals {
    // условные конструкции if-else
    public static void main(String[] args) {
        int a = 15, b = 25;

        if (a > b) {
            System.out.println("A больше B");
        } else {
            System.out.println("A меньше B");
        }

        boolean IsHasCar = false;
        if (IsHasCar) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
        int c = scan.nextInt();

        // else if

        if (c > 10) {
            System.out.println("C > 10");
        } else if (c == 10) {
            System.out.println("C = 10");
        } else {
            System.out.println("C < 10");
        }
    }
}
