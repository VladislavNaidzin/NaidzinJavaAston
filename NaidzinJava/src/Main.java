import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        algoritm1();
        algoritm2();
        algoritm3();

//        Что касается данной последовательности скобок «[((())()(())]]»:
//
//        Эту последовательность нельзя считать правильной, поскольку закрывающих скобок больше, чем открывающих.
//                Чтобы сделать последовательность допустимой, вам нужно удалить лишнюю закрывающую скобку в конце.
//

    }


    public static void algoritm1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }

    public static void algoritm2() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
    String name = scanner.nextLine();
        if(name.equals("Вячеслав"))

    {
        System.out.println("Привет, Вячеслав");
    } else

    {
        System.out.println("Нет такого имени");
    }
}
    public static void algoritm3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Элементы массива, кратные 3:");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }


}
