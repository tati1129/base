package Task;


import java.util.Arrays;

class T2 {
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










    public static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        String reverseStr = new StringBuilder(numStr).reverse().toString();
        if (numStr.equals(reverseStr)) {
            return true;
        }
        return false;
    }

    // 18. Напишите метод, который возвращает n-ое число Фибоначчи.
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    // 19. Напишите метод, который принимает массив чисел и сортирует его по возрастанию.
    public static int[] sortArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
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
        int[] numbers = {1, 2, 5, 4, 6, 3};

//        System.out.print("11 Задача: ");
//        System.out.println(sumArray(numbers));
//
//        System.out.print("12 Задача: ");
//        System.out.println(power(5, 4));
//
//        System.out.print("13 Задача: ");
//        System.out.println(isPrime(5));
//
//        System.out.print("14 Задача: ");
//        System.out.println(gcd(10, 20));
//
//        System.out.print("15 Задача: ");
//        System.out.println(maxInArray(numbers));
//
//        System.out.print("16 Задача: ");
//        System.out.println(minInArray(numbers));
//
//        System.out.print("17 Задача: ");
//        System.out.println(isPalindrome(1222));
//
//        System.out.print("18 Задача: ");
//        System.out.println(fibonacci(8));
//
//        System.out.print("19 Задача: ");
//        System.out.println(Arrays.toString(sortArray(numbers)));
//
//        System.out.print("20 Задача: ");
//        System.out.println(lcm(10, 20));
    }
}