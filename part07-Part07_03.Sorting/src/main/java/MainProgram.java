
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        Scanner scanner = new Scanner(System.in);
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);

        //test ui
        System.out.println("Enter csv ONLY (will crash otherwise)");
        String input = scanner.nextLine();

        String stringArray[] = input.split(",");
        int testArray[] = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            testArray[i] = Integer.parseInt(stringArray[i]);
        }

        System.out.println("enter quit to quit");
        while(true) {
            String cmdInput = scanner.nextLine();
            if (cmdInput.equals("quit")) {
                break;
            }

            if (cmdInput.equals("smallest")) {
                System.out.println(smallest(testArray));
            }

            if (cmdInput.equals("index of smallest")) {
                System.out.println(indexOfSmallest(testArray));
            }

            if (cmdInput.equals("index of smallest from")) {
                System.out.println("Enter the start index");
                int inputStartIndex = Integer.parseInt(scanner.nextLine());
                System.out.println(indexOfSmallestFrom(testArray, inputStartIndex));
            }

            if (cmdInput.equals("swap")) {
                System.out.println("first index:");
                int firstI = Integer.parseInt(scanner.nextLine());
                System.out.printf("second index:");
                int secondI = Integer.parseInt(scanner.nextLine());
                swap(testArray, firstI, secondI);
            }

            if (cmdInput.equals("print array")) {
                System.out.println(returnArray(testArray));
            }

            if (cmdInput.equals("sort")) {
                sort(testArray);
            }

            if (cmdInput.equals("help")) {
                System.out.println("all commands:\n" +
                        "smallest: finds the smallest in the csv you entered\n" +
                        "index of smallest: the index of the smallest number in the array\n" +
                        "index of smallest from: prompts for a start index number and finds the smallest number after that index\n" +
                        "swap: prompts for the 2 indexes you wish to swap and swaps them\n" +
                        "sort: sorts the csv\n" +
                        "print array: prints the array");
            }
        }

    }

    public static int smallest(int[] array) {
        int smallestN = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallestN > array[i]) {
                smallestN = array[i];
            }
        }
        return smallestN;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestN = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestN) {
                smallestN = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestN = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (smallestN > table[i]) {
                smallestN = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempIndex = array[index1];
        array[index1] = array[index2];
        array[index2] = tempIndex;
    }

    public static String returnArray(int[] array) {return Arrays.toString(array);}

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfSmallestFrom(array, i), i);
            System.out.println(returnArray(array));
        }
    }
}
