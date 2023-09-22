public class Variables {

    public static void main(String[] args) {
        System.out.println("Переменные и типы данных");

        // Создание переменной
        int age;

        // Присваивание значения
        age = 10;

        // Перезаписывание
        age = 20;

        // Создание переменной и присваивание

        int number = 1;

        // Вывод и объединение данных
        System.out.println("Возраст: " + age);
        System.out.println("Число: " + number);

        // Типы данных

        // byte - от -128 до 127, занимает 1 байт операционной памяти
        // short - от -32768 до 32767, занимает 2 байта операционной памяти
        // int - от -2147483648 до 2147483647, занимает 4 байта операционной памяти
        // long - от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807, занимает 8 байтов

        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483647;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);

        // float - от -3.4E+38 до 3.4E+38, занимает 4 байта операционной памяти
        // double - от -1.7E+308 до 1.7E+308, занимает 8 байтов операционной памяти

        float e = 0.9f;
        double f = 0.9;

        System.out.println("E: " + e);
        System.out.println("F: " + f);

        char g = '$';
        String h = "Text";

        System.out.println("G: " + g);
        System.out.println("H: " + h);

        boolean isHappy = false;
        System.out.println("I: " + isHappy);
    }
}
