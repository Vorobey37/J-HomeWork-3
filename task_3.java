
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        /*
         * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
         */

        List <Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        System.out.println("Введите количество элементов списка:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        for (int i = 0; i < n; i++) {
            numbers.add(rand.nextInt(-10, 11));
        }
        System.out.println(numbers);
        int maxNumber = numbers.get(0);
        int minNumber = numbers.get(0);
        double middleSum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > maxNumber) {
                maxNumber = numbers.get(i);
            }
            if (numbers.get(i) < minNumber) {
                minNumber = numbers.get(i);
            }
            middleSum += numbers.get(i);
        }
        middleSum /= numbers.size();

        System.out.println(maxNumber);
        System.out.println(minNumber);
        System.out.println(middleSum);
    }
}
