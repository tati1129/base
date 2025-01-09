package Task;
//done

import java.util.Arrays;

public class T4 {

    // 1. Напишите метод, который принимает массив целых чисел и удваивает каждый его элемент.
    public static int[] doubleElemArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           arr[i] = arr[i] * 2;
        }
        return arr;
    }

    // 2. Напишите метод, который принимает массив целых чисел и
    // возвращает массив только с положительными числами.
   public static int[] getPositiveElem(int[] arr){
        int count = 0;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] > 0){
               count++;
           }
       }
       int[] newArr = new int[count];
       int j = 0;

       for (int i = 0; i <arr.length ; i++) {
           if (arr[i] > 0){
               newArr[j] = arr[i];
               j++;
           }
       }
       return  newArr;
   }

    // 3. Напишите метод, который принимает два массива
    public static int[] combineTwoArras(int[] arr1, int[] arr2){
        int[] newArr = new  int[arr1.length +arr2.length];
        int a = arr1.length;
        int b = arr2.length;

        for (int i = 0; i < a ; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < b; i++) {
            newArr[a + i] = arr2[i];
        }
        //System.out.println(Arrays.toString(newArr));
        return  newArr;
    }

//    public static int[] mergeArrays(int[] array1, int[] array2) {
//        int [] totalArr = new int[array1.length + array2.length];
//        System.arraycopy(array1, 0, totalArr, 0, array1.length);
//        System.arraycopy(array2, 0, totalArr, array1.length, array2.length);
//        return totalArr;
//    }

    // 4. Напишите метод, который принимает массив целых чисел и возвращает количество уникальных элементов.
    public static int countUniqElem(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            boolean isUniq = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]){//исключаем сравнение элемента с самим собой
                    isUniq = false;
                    break;
                }
            }
            if (isUniq){
                count++;
            }
        }

        return count;
    }


    // 5. Напишите метод, который принимает массив целых чисел и возвращает новый массив, содержащий квадраты элементов исходного массива.
    public  static int[] squareElem(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * arr[i];
            ;
        }
        return newArr;
    }


    // 6. Напишите метод, который принимает массив целых чисел и возвращает второй по величине элемент.
        public static int getSecondMax(int[] arr){
        if (arr.length < 2){
            throw  new IllegalArgumentException("Массив содержит меньше 2х элементов");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i] > max1){
                    max2 = max1;
                    max1 = arr[i];
                }else  if (max2 < arr[i] && arr[i] != max1){
                    max2 = arr[i];
                }
            }

            if (max2 == Integer.MIN_VALUE){
                throw new IllegalArgumentException("В массиве нет второго по величине элемента");
            }

        return max2;
        }

    // 7. Напишите метод, который принимает массив целых чисел и возвращает true, если массив содержит заданное число.
   public  static boolean checkTargetNumb(int[] arr, int num){

       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == num){
               return true;
           }
       }
        return false;
   }

    // 8. Напишите метод, который принимает массив целых чисел и заменяет все отрицательные числа на 0.
    public static int[] replaceMinusNum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }

    // 9. Напишите метод, который принимает массив целых чисел и возвращает индекс первого вхождения заданного числа.
    public static int getIndexCurrentNum(int[] arr, int num){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                index = i;
                break;
            }
        }
        return index;
    }

    // 10. Напишите метод, который принимает массив целых чисел и возвращает true, если в массиве нет повторяющихся элементов.

   public static boolean findUniqElement(int[] arr){
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
               if (i != j && arr[i] == arr[j]){
                   return false;
               }
           }

       }
       return true;
   }


    public static void main(String[] args){
            int[] array = {1, 2, 8, 1, 3};
            int[] array2 = {1, -2, 3, 4, -5};


        System.out.println();
        System.out.println("Task 1 : ");
        System.out.println(Arrays.toString(doubleElemArr(array2)));


        System.out.println();
        System.out.println("Task 2 : ");
        System.out.println(Arrays.toString(getPositiveElem(array)));

        System.out.println();
        System.out.println("Task 3 : ");
        System.out.println(Arrays.toString( combineTwoArras(array, array2)));

        System.out.println();
        System.out.println("Task 4 : ");
        System.out.println(countUniqElem(array));

        System.out.println();
        System.out.println("Task 5 : ");
        System.out.println(Arrays.toString(squareElem(array)));


        System.out.println();
        System.out.println("Task 6 : ");
        System.out.println(getSecondMax(array));

        System.out.println();
        System.out.println("Task 7 : ");
        System.out.println(checkTargetNumb(array2, 8));

        System.out.println();
        System.out.println("Task 8 : ");
        System.out.println(Arrays.toString(replaceMinusNum(array2)));

        System.out.println();
        System.out.println("Task 9 : ");
        System.out.println(getIndexCurrentNum(array, 1));


        System.out.println();
        System.out.println("Task 10 : ");
        System.out.println(findUniqElement(array2));
        System.out.println(findUniqElement(array));
//        System.out.println(Arrays.toString(array));
//

//        System.out.println("1 : " + Arrays.toString(doubleElemArr(array)));
//
//        int[] exampleArray1 = {1, -2, 3, 4, -5};
//
//        System.out.println("2 : " + Arrays.toString(getPositiveElem(array)));
//
//        int[] exampleArray2 = {6, 7, 8, 9, 10};
//
//        System.out.println("3. Напишите метод, который принимает два массива: " + Arrays.toString(mergeArrays(exampleArray1, exampleArray2)));
//
//        System.out.println("4. Напишите метод, который принимает массив целых чисел и возвращает количество уникальных элементов: " + countUniqueElements(exampleArray1));
//
//        System.out.println("5. Напишите метод, который принимает массив целых чисел и возвращает новый массив, содержащий квадраты элементов исходного массива: " + Arrays.toString(squareArrayElements(exampleArray1)));
//
//        int[] exampleArray3 = {1, -2, 3, 4, -5};
//
//        System.out.println("6. Напишите метод, который принимает массив целых чисел и возвращает второй по величине элемент: " + findSecondLargest(exampleArray3));
//
//        System.out.println("7. Напишите метод, который принимает массив целых чисел и возвращает true, если массив содержит заданное число (5): " + containsNumber(exampleArray3, 5));
//
//
//        System.out.println("8. Напишите метод, который принимает массив целых чисел и заменяет все отрицательные числа на 0: " + Arrays.toString(replaceNegativesWithZero(exampleArray3)));
//
//        int[] exampleArray4 = {1, -2, 3, 4, -5};
//
//        System.out.println("9. Напишите метод, который принимает массив целых чисел и возвращает индекс первого вхождения заданного числа: " + findFirstIndex(exampleArray4, 4));
//
//        System.out.println("10. Напишите метод, который принимает массив целых чисел и возвращает true, если в массиве нет повторяющихся элементов: " + hasNoDuplicates(exampleArray4));
        }
}
