package Task;

//done

import java.util.Arrays;

public class T3 {

    // 1. Напишите метод, который принимает массив целых чисел и возвращает его длину.
    public static int getArrLength(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }

    // 2. Напишите метод, который принимает массив целых чисел и выводит его элементы в консоль.
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    // 3. Напишите метод, который принимает массив целых чисел и возвращает сумму его элементов.
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 4. Напишите метод, который принимает массив целых чисел и возвращает максимальный элемент.
    public static int getMaxNum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 5. Напишите метод, который принимает массив целых чисел и возвращает минимальный элемент.
    public static int getMinNum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // 6. Напишите метод, который принимает массив целых чисел и возвращает
    // новый массив, содержащий только чётные элементы.
    public static int[] createArrEvenNum(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        if (count == 0) {
            return new int[]{-1};
        }

        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }


    // 7. Напишите метод, который принимает массив целых чисел и
    // возвращает массив в обратном порядке.
    public static int[] arrReverce(int[] arr) {
        int temp;
        int n = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i];
            arr[n - i] = temp;
        }
        return arr;
    }

    // 8. Напишите метод, который принимает массив целых чисел и возвращает true,
    // если массив отсортирован по возрастанию.
    public static boolean isSorted(int[] arr) {
        boolean result = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    result = false;
                }
            }
        }
        return result;

    }

    // 9. Напишите метод, который принимает массив целых чисел и возвращает
    // среднее арифметическое его элементов.
    public static double getAvg(int[] arr) {
        int count = arr.length;
        int sum = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (double) sum / count;
        return avg;
    }

    // 10. Напишите метод, который принимает массив целых чисел и
    // возвращает количество чётных чисел в массиве.

    public static int getSumEvenNum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8};
        System.out.println(Arrays.toString(array));

        System.out.print("1 задача: ");
        System.out.println(getArrLength(array));


        System.out.print("2 задача: ");
        printArr(array);


        System.out.println();
        System.out.print("3 задача: ");
        System.out.println("getSum(array) = " + getSum(array));


        System.out.print("4 задача: ");
        System.out.println("getMaxNum(array) = " + getMaxNum(array));


        System.out.print("5 задача: ");
        System.out.println("getMinNum(array) = " + getMinNum(array));

        System.out.print("6 задача: ");
        System.out.println(Arrays.toString(createArrEvenNum(array)));

        System.out.print("7 задача: ");
        //System.out.println(Arrays.toString(arrReverce(exampleArray)));


        System.out.print("8 задача: ");
        System.out.println(isSorted(array));


        System.out.print("9 задача: ");
        System.out.println(getAvg(array));



        System.out.print("10 задача: ");
        System.out.println(getSumEvenNum(array));

    }
}
