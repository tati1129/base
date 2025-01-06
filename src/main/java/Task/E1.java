package Task;

//done


public class E1 {

    //1. Напишите метод, который принимает два целых числа и возвращает их сумму.

    public static int getSumm(int a, int b) {
        return a + b;
    }

    //2. Напишите метод, который принимает два числа и возвращает их разность.
    public static int getSubstraction(int a, int b) {
        return (a - b);
    }

    // 3. Напишите метод, который принимает два числа и возвращает их произведение.
    public static int getMultiply(int a, int b) {
        return a * b;
    }

    // 4. Напишите метод, который принимает два числа и возвращает их частное.
    public static double getDivide(int a, int b) {
        return (double) a / b;
    }

    // 5. Напишите метод, который принимает число и возвращает его квадрат.
    public static int getSquare(int a) {
        return a * a;
    }

    // 6. Напишите метод, который принимает три числа и возвращает их среднее арифметическое.
    public static double getAvg(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    // 7. Напишите метод, который принимает два числа и возвращает остаток от их деления.
    public static int getRemainderOfDevision(int a, int b) {
        return a % b;
    }

    // 8. Напишите метод, который принимает два числа и возвращает большее из них.
    public static int getBigInt(int a, int b) {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    // 9. Напишите метод, который принимает два числа и возвращает меньшее из них.
    public static int getMinInt(int a, int b) {
        if (a > b) {
            return b;
        } else if (b > a) {
            return a;
        } else {
            return a;
        }
    }


    // 10. Напишите метод, который принимает число и проверяет, является ли оно четным.
    // Возвращает true, если число четное, и false, если нечетное.

    public static boolean checkEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Task 1 : ");
        System.out.println("getSumm(3,4) = " + getSumm(3, 4));
        System.out.println( );

        System.out.println("Task 2 : ");
        System.out.println("getSubstraction(6, 7) = " + getSubstraction(6, 7));
        System.out.println( );

        System.out.println("Task 3 : ");
        System.out.println("getMultiply(3,8) = " + getMultiply(3, 8));
        System.out.println( );

        System.out.println("Task 4 : ");
        System.out.println("getDivide(5, 2) = " + getDivide(5, 2));
        System.out.println( );

        System.out.println("Task 5 : ");
        System.out.println("getSquare(6) = " + getSquare(6));
        System.out.println( );

        System.out.println("Task 6 : ");
        System.out.println("getAvg(5,8,1) = " + getAvg(5, 8, 1));
        System.out.println( );

        System.out.println("Task 7 : ");
        System.out.println("getRemainderOfDevision(4,3) = " + getRemainderOfDevision(4, 3));
        System.out.println( );

        System.out.println("Task 8 ");
        System.out.println("getBigInt(6,90) = " + getBigInt(6, 90));
        System.out.println( );

        System.out.println("Task 9 : ");
        System.out.println("getMinInt(6,90) = " + getMinInt(6, 90));
        System.out.println( );

        System.out.println("Task 10 : ");
        System.out.println("checkEven(5) = " + checkEven(5));
        System.out.println( );

    }
}
