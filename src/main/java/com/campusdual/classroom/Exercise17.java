package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.util.Arrays;

public class Exercise17 {



	public static int[] createEmptyIntArray(int positions){
        return new int[positions];

    }

	public static String[] createInitializedStringArray() {
        return new String[] {"1", "2", "3"};

    }

	public static void populateArray(int[] array, int index, int value) {
        array[index] = value;
    }

	public static int arrayLength(int[] array) {
		System.out.println("La longitud del array es :" + array.length);
        return array.length;
    }

	public static void showValue(int[] array, int index) {
		System.out.println("Valor del índice " + index + ": " + array[index]);
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
