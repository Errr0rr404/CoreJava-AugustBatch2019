package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] unsortedArray = {22, 1, 33, 42, 4, 7, 2, 9};

        int[] sortedArray = insertionSort.convertUnsortedArrayToSorted(unsortedArray);

        System.out.println();
        System.out.println("**** Sorted Array ****");
        for (int value : sortedArray) {
            System.out.print(value + " ");
        }
    }

    public int[] convertUnsortedArrayToSorted(int[] arrayOfNumbers) {

        for (int i = 1; i < arrayOfNumbers.length; i++) {
            int j = i - 1;
            int point = arrayOfNumbers[i];
            while (j >= 0 && arrayOfNumbers[j] > point) {
                arrayOfNumbers[j + 1] = arrayOfNumbers[j];
                j = j - 1;
            }
            arrayOfNumbers[j + 1] = point;

            for (int arrayOfNumber : arrayOfNumbers) {
                System.out.print(arrayOfNumber + ", ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Final Value = ");
        for (int arrayOfNumber : arrayOfNumbers) {
            System.out.print(arrayOfNumber + ", ");
        }

        return arrayOfNumbers;
    }
}
