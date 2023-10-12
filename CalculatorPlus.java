import java.util.Scanner;

public class CalculatorPlus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.println("Введите математическое действие: ");

        // Чтобы считывало последнюю строку

        String action = scanner.nextLine();
        action = scanner.nextLine();

        int res;

        switch (action) {
            case "+":
                res = a + b;
                System.out.println("Результат сложения: " + res);
                break;
            case "-":
                res = a - b;
                System.out.println("Результат вычитания: " + res);
                break;
            case "/":
                if (b == 0)
                    System.out.println("Нельзя делить на 0");
                res = a / b;
                System.out.println("Результат деления: " + res);
                break;
            case "*":
                res = a * b;
                System.out.println("Результат умножения: " + res);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}