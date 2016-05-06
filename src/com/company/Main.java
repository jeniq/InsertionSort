package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void insertionSort(int[] array){
        int key;
        int i;
        for (int j = 1; j < array.length; j++){
            key = array[j];
            i = j - 1;
            while ((i >= 0) && array[i] > key){
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
