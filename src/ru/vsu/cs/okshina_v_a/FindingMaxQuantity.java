package ru.vsu.cs.okshina_v_a;

public class FindingMaxQuantity {
    public static int countMaxNumberOfNonzeroElements(int[] array) {
        int numberOfNonzeroElements = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                numberOfNonzeroElements++;
            }
            if (array[i] == 0) {
                if (max < numberOfNonzeroElements) {
                    max = numberOfNonzeroElements;
                }
                numberOfNonzeroElements = 0;
            }
        }
        return max;
    }
}