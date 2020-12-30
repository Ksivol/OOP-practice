package ru.ssau.tk.Practice_SAS.Tasks.Array;

public class Array {
    public int[] arrayLength(int Length){
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

}
