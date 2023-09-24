import java.util.Scanner;

public class Cases {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // Проверяем на чёткое значение/совпадение в switch-case
        // break нужно, чтобы выйти из условия
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 1");
                break;
            case 3:
                System.out.println("Number is 1");
                break;
            // Аналог else
            default:
                System.out.println("Default");

        }
    }
}
