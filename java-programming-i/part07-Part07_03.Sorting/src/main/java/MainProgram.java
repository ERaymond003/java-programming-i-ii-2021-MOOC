
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int numberToReturn = 0;
        for (int number : array) {
            numberToReturn += number;
        }
        for (int number : array) {
            if (number < numberToReturn) {
                numberToReturn = number;
            }
        }
        return numberToReturn;
    }

    public static int indexOfSmallest(int[] array) {

        int index = 0;
        int smallest = MainProgram.smallest(array);
        for (int number : array) {
            if (number == smallest) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int length = table.length;
        int index = startIndex;
        int smallest = 9999999;

        for (int i = startIndex; i < length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
            }
        }
        for (int i = startIndex; i < length; i++) {
            if (table[i] == smallest) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void swap(int[] array, int index1, int index2) {
        int length = array.length;
        int firstNum = 0;
        int secondNum = 0;
        for (int i = 0; i < length; i++) {
            if (i == index1) {
                firstNum = array[i];
            }
            if (i == index2) {
                secondNum = array[i];
            }
        }
        array[index1] = secondNum;
        array[index2] = firstNum;

    }

    public static void sort(int[] array) {
        int index = 0;
        int smallestIndex = 0;
        for (int number : array) {
            System.out.println(Arrays.toString(array));
            smallestIndex = MainProgram.indexOfSmallestFrom(array, index);
            MainProgram.swap(array, index, smallestIndex);
            index++;
            
        }
    }

}
