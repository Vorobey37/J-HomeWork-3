import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        /*
         * Реализовать алгоритм сортировки слиянием
         */
        System.out.println("Введите количество элементов массива:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int []array = new int[n];
        Random randomElement = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomElement.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(array));
        SeparateArrayAndMerge(array);
        System.out.println(Arrays.toString(SeparateArrayAndMerge(array)));
    }

    public static int []SeparateArrayAndMerge (int []array) {
        if (array.length < 2) {
            return array;
        }
        int []firstHalf = new int [array.length/2];
        int []secondHalf = new int [array.length - array.length/2];
        for (int i = 0; i < array.length/2; i++) {
            firstHalf[i] = array[i];
        }
        for (int i = array.length/2; i < array.length; i++) {
            secondHalf[i - array.length/2] = array[i];
        }
        firstHalf = SeparateArrayAndMerge(firstHalf);
        secondHalf = SeparateArrayAndMerge(secondHalf);
        return SortArrayAndMerge(firstHalf, secondHalf);
    }

    public static int []SortArrayAndMerge (int []firstHalf, int[]secondHalf) {
        int []finalArray = new int [firstHalf.length + secondHalf.length];
        int positionFirstHalf = 0;
        int positionSecondHalf = 0;
        for (int i = 0; i < finalArray.length; i++) {
            if (positionFirstHalf < firstHalf.length && positionSecondHalf < secondHalf.length) {
                if (firstHalf[positionFirstHalf] < secondHalf[positionSecondHalf]) {
                    finalArray[i] = firstHalf[positionFirstHalf];
                    positionFirstHalf++;
                } else {
                    finalArray[i] = secondHalf[positionSecondHalf];
                    positionSecondHalf++;
                }
            } else if (positionFirstHalf == firstHalf.length && positionSecondHalf < secondHalf.length) {
                finalArray[i] = secondHalf[positionSecondHalf];
                positionSecondHalf++;
            } else if (positionFirstHalf < firstHalf.length && positionSecondHalf == secondHalf.length){
                finalArray[i] = firstHalf[positionFirstHalf];
                positionFirstHalf++;
            }
        }   
        return finalArray;
    }

}