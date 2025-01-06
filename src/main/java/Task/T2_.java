package Task;
//done

import java.util.Arrays;

class T2_ {
    // 11. Напишите метод, который принимает массив чисел и возвращает их сумму.
    public static int getSumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 12. Напишите метод, который принимает два числа и возводит первое в степень второго.
    public static int getIntSquare(int a, int b) {
        return (int) Math.pow(a, b);
    }

    // 13. Напишите метод, который проверяет, является ли число простым.
public static boolean numIsSimple(int a){
        if (a % a == 0 && a % 1 == 0){
            return true;
        }else {
            return  false;
        }
    }

    // 14. Напишите метод, который принимает два числа и возвращает их наибольший общий делитель (НОД).
    public static int biggerDived(int a, int b){
        int temp = 1;
        for (int i = a; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0 ){
                temp = 1;
            }
        }
        return temp;
    }

    // 15. Напишите метод, который принимает массив чисел и возвращает его максимальный элемент.
    public static int getMaxNumArr(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }

    // 16. Напишите метод, который принимает массив чисел и возвращает его минимальный элемент.

    public static int getMinNumArr(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return  min;
    }

    // 17. Напишите метод, который проверяет, является ли число палиндромом
    // (одинаково читается слева направо и справа налево).
public static boolean isPalindrom(int number){
        String strNumber = Integer.toString(number);
        String strReverce = new StringBuilder(strNumber).reverse().toString();
        return strNumber.equals(strReverce) ;
}

    // 18. Напишите метод, который возвращает n-ое число Фибоначчи.

    public static int febonachiNum(int n){
        // F(0), F(1);
        // F(n-1) + F(n-2);
        if (n == 0){
            return 0;
        }
        if (n == 1 ){
            return 1;
        }
        int n1 = 0;
        int n2 = 1;
        int currentNum = 0;
        for (int i = 2; i <= n; i++) {
            currentNum = n1 + n2;
            n1 = n2;
            n2 = currentNum;
        }
        return currentNum;
    }


    // 19. Напишите метод, который принимает массив чисел и сортирует его по возрастанию.
    public static int[] sortArr(int[] arr){

        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // 20. Напишите метод, который принимает два числа и возвращает их наименьшее общее кратное (НОК).
    public static int lcm(int a, int b) {
        int max = Math.max(a, b);
        for (int i = max; ; i += max) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 4, 6, 3};

        System.out.print("11 Задача: ");
        System.out.println(getSumArr(array));

        System.out.print("12 Задача: ");
        System.out.println(getIntSquare(5, 4));

        System.out.print("13 Задача: ");
        System.out.println(numIsSimple(5));

        System.out.print("14 Задача: ");
        System.out.println(biggerDived(10, 20));

        System.out.print("15 Задача: ");
        System.out.println(getMaxNumArr(array));

        System.out.print("16 Задача: ");
        System.out.println(getMinNumArr(array));

        System.out.print("17 Задача: ");
        System.out.println(isPalindrom(1222));

        System.out.print("18 Задача: ");
        System.out.println(febonachiNum(8));

        System.out.print("19 Задача: ");
        System.out.println(Arrays.toString(sortArr(array)));

        System.out.print("20 Задача: ");
        System.out.println(lcm(10, 20));
    }
}