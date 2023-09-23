import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String username = a.nextLine();
        System.out.println("Привет, " + username);

        // Для каждого типа данных есть свой метод

        Scanner b = new Scanner(System.in);
        System.out.print("Введите целочисленное число: ");
        int number = b.nextInt();
        System.out.println("Ваше целочисленное число: " + number);

        // Математические действия

        int number_1 = 10, number_2 = 10;
        int result = number_1 + number_2;
        System.out.println("Результат: " + result);

        // Чтобы получить значение после точки надо указывать float

        float number_3 = 10, number_4 = 3;
        float result_1 = number_3 / number_4;
        System.out.println("Результат 1: " + result_1);

        // Сокращенные операции

        result_1 += 10;
        result_1++;

        System.out.println("Результат 1.1: " + result_1);


    }
}
