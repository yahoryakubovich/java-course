import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        float number_1 = scan.nextFloat();

        System.out.print("Введите 2 число: ");
        float number_2 = scan.nextFloat();

        float res_1 = number_1 + number_2;
        float res_2 = number_1 - number_2;
        float res_3 = number_1 * number_2;
        float res_4 = number_1 / number_2;

        System.out.println("Результат сложения: " + res_1 + "\n" + "Результат вычитания: " + res_2 + "\n" + "Результат умножения: " + res_3 + "\n" + "Результат деления: " + res_4);


    }

}
