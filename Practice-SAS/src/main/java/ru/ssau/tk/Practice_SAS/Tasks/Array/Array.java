package ru.ssau.tk.Practice_SAS.Tasks.Array;

public class Array {
    public int[] arrayLength(int Length) {
        return new int[Length];
    }

    public int[] generateArray2(int Length) {
        int[] ones = new int[Length];
        for (int i = 0; i < Length; i++) {
            ones[i] = 1;
        }
        ones[0] = 2;
        ones[Length - 1] = 2;
        return ones;
    }

    public int[] arrayOddNumbers(int Length) {
        int[] myArray = new int[Length];
        int k = 1;
        for (int i = 0; i < Length; i++) {
            myArray[i] = k;
            k = k + 2;
        }
        return myArray;
    }

    public int[] arrayEvenNumbersBack(int Length) {
        int[] myArray = new int[Length];
        int k = 2 * Length;
        for (int i = 0; i < Length; i++) {
            myArray[i] = k;
            k = k - 2;
        }
        return myArray;
    }


    public int[] arrayFibonacci(int Length) {
        if (Length == 1) {
            return new int[]{0};
        }
        if (Length == 2) {
            return new int[]{0, 1};
        }
        int[] fibArray = new int[Length];
        fibArray[0] = 0;
        fibArray[1] = 1;
        fibArray[2] = 1;
        for (int i = 3; i < Length; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray;
    }


    public int[] arraySqrIndex(int Length) {
        int[] array = new int[Length];
        for (int i = 0; i < Length; i++) {
            array[i] = i * i;
        }
        return array;
    }


    public int[] arrayIntegers(int Length) {
        int[] numbersArray = new int[Length];
        int k = 1;
        for (int i = 0; i < Length; i++) {
            numbersArray[i] = k;
            k++;
            if (k % 3 == 0) {
                k++;
            }
        }
        return numbersArray;
    }


    static double[] arrayArithmeticProgression(int n, double a1, double d) {
        double[] array = new double[n];
        array[0] = a1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + d;
        }
        return array;
    }
}
