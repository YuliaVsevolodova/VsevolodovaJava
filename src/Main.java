import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число 'a': ");
    int a = scanner.nextInt();
    System.out.print("Введите число 'b': ");
    int b = scanner.nextInt();
    compareNumbers(a, b);
    mathOperations(a, b);
    scanner.nextLine();
    System.out.print("Введите первую строку: ");
    String c = scanner.nextLine();
    System.out.print("Введите вторую строку: ");
    String d = scanner.nextLine();
    stringComparison(c, d);
    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    oddNumbers(numbers);
}

public static void compareNumbers(int a, int b) {
    if (a > b) {
        System.out.println("a > b");
    } else if (a < b) {
        System.out.println("a < b");
    } else {
        System.out.println("a = b");
    }

}

public static void mathOperations(int a, int b) {
    System.out.println("Сложение: " + (a + b));
    System.out.println("Вычитание: " + (a - b));
    System.out.println("Умножение: " + a * b);
    System.out.println("Деление: " + a / b);
}

public static void stringComparison(String c, String d) {
    if (c.equals(d)) {
        System.out.println("Строки идентичны");
    } else {
        System.out.println("Строки неидентичны");
    }

}

public static void oddNumbers(int[] numbers) {
    System.out.println("Четные числа в массиве: ");
    int[] var1 = numbers;
    int var2 = numbers.length;

    for(int var3 = 0; var3 < var2; ++var3) {
        int number = var1[var3];
        if (number % 2 == 0) {
            System.out.println(number);
        }
    }
}
}