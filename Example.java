import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите роль: ");
        String role = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        if (role.equals("Admin") && password.equals("12345678")) {
            System.out.println("Все пользователи");
        } else {
            System.out.println("Привет, как Вас зовут?");
            String name = scanner.nextLine();
            System.out.println("Приветствую, " + name);
        }

    }
}
