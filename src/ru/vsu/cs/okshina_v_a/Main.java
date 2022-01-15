package ru.vsu.cs.okshina_v_a;

class Main {
    public static void main(String[] args) {
        int[] array = ArrayUtils.readIntArrayFromConsole("'A'");
        int result = FindingMaxQuantity.countMaxNumberOfNonzeroElements(array);

        printAnswer(result);
    }

    private static void printAnswer(int result) {
        System.out.print("Максимальное количество ненулевых элементов, расположенных между нулями, в массиве 'A' = " + result);
    }
}