import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        /*
         * Пусть дан произвольный список целых чисел, удалить из него чётные числа
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
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println(numbers);
    }
}
