package Task_homework;
//done

import java.util.Arrays;

public class T6_ {
    /**
     * 1. Напишите метод, который принимает массив строк и возвращает его длину.
     */
    public static int getArrayLength(String[] array) {
        int lengtArr = array.length;
        return lengtArr;
    }

    /**
     * 2. Напишите метод, который принимает массив строк и выводит его элементы в консоль.
     */
    public static void printArray(String[] array) {
        // TODO: реализовать метод
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 3. Напишите метод, который принимает массив строк и возвращает первую строку.
     */
    public static String getFirstElement(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return "Массив пуст";
        }
        return array[0];
    }

    /**
     * 4. Напишите метод, который принимает массив строк и возвращает последнюю строку.
     */
    public static String getLastElement(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return "Массив пуст";
        }
        return array[array.length - 1];

    }

    /**
     * 5. Напишите метод, который принимает массив строк и возвращает массив строк в обратном порядке.
     */
    public static String[] reverseArray(String[] array) {
        // TODO: реализовать метод
        String[] newArr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[array.length - 1 - i];
        }
        return newArr;
    }

    /**
     * 6. Напишите метод, который принимает массив строк и возвращает длину самой длинной строки.
     */
    public static int getLongestStringLength(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return 0; // Возвращаем 0, если массив пустой или равен null
        }
        int max = 0;
        for (String str : array) {
            if (str.length() > max) {
                max = str.length();
            }
        }
        return max;
    }

    /**
     * 7. Напишите метод, который принимает массив строк и возвращает строку с максимальной длиной.
     */
    public static String getLongestString(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return "array is empty... ";
        }
        String strLonger = "";
        int max = 0;
        for (String str : array) {
            if (str.length() > max) {
                max = str.length();
                strLonger = str;
            }
        }
        return strLonger;
    }

    /**
     * 8. Напишите метод, который принимает массив строк и возвращает true, если массив содержит заданную строку.
     */
    public static boolean containsString(String[] array, String target) {
        // TODO: реализовать метод
        for (String str : array) {
            if (str.equals(target)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 9. Напишите метод, который принимает массив строк и возвращает количество строк, которые начинаются с заданной буквы.
     */
    public static int countStringsStartingWith(String[] array, char letter) {
        // TODO: реализовать метод
        if (array == null) {
            return 0; // Если массив null, возвращаем 0
        }
        int count = 0;
        for (String str : array) {
            if (str.charAt(0) == letter) {
                count++;
            }
        }
        return count;
    }

    /**
     * 10. Напишите метод, который принимает массив строк и возвращает массив строк в верхнем регистре.
     */
    public static String[] convertToUpperCase(String[] array) {
        // TODO: реализовать метод
        String[] newArr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i].toUpperCase();
        }
        return newArr;
    }

    public static void main(String[] args) {

        String[] array = {"apple", "banana", "cherry", "watermelon"};

        System.out.println();
        System.out.println("Task 1 : ");
        System.out.println(getArrayLength(array));

        System.out.println();
        System.out.println("Task 2 : ");
        printArray(array);

        System.out.println();
        System.out.println("Task 3 : ");
        System.out.println(getFirstElement(array));

        System.out.println();
        System.out.println("Task 4 : ");
        System.out.println(getLastElement(array));

        System.out.println();
        System.out.println("Task 5 : ");
        System.out.println(Arrays.toString(reverseArray(array)));

        System.out.println();
        System.out.println("Task 6 : ");
        System.out.println(getLongestStringLength(array));

        System.out.println();
        System.out.println("Task 7 : ");
        System.out.println(getLongestString(array));

        System.out.println();
        System.out.println("Task 8 : ");
        System.out.println(containsString(array, "banana"));

        System.out.println();
        System.out.println("Task 9 : ");
        System.out.println(containsString(array, "b"));

        System.out.println("Task 10 : ");
        System.out.println(Arrays.toString(convertToUpperCase(array)));

    }
}
