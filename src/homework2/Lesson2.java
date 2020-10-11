package homework2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Lesson2 {
    public static void main(String[] args) {
        createArray_1();
        createArray_2();
        createArray_3();
        createArray_4();
        createArray_5();
        createArray_7(new int[]{43, 12, 32, 45, 23}, 2);

    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void createArray_1() {
        System.out.println("Задание №1");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                array[i] = 0;
            else
                array[i] = 1;
            System.out.print(array[i]);
        }

    }

    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void createArray_2() {
        System.out.println("\nЗадание №2");
        final int SIZE = 8;
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
            System.out.print(array[i] + " ");
        }

    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void createArray_3() {
        System.out.println("\nЗадание №3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;

            System.out.print(arr[i] + " ");
        }
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и
    // с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static void createArray_4() {
        System.out.println("\nЗадание 4");
        final int LENGTH = 4;

        int[][] arr = new int[LENGTH][LENGTH];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j) || (i == arr.length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();
        }
    }

    //5. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    static void createArray_5() {
        System.out.println("Задание 5");
        int[] arr = {54, 23, 12, 90, 60, 14, 22, 76, 160};
        int min, max;
        min = max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];   // Через IF --->if (arr[i]<min) min=arr[i];
            max = (max > arr[i]) ? max : arr[i];  //               if (arr[i]>max) max=arr[i];
        }
        System.out.println("Минимальное значение= " + min + " Максимальное значение = " + max);
    }

    // 7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    static void createArray_7(int[] array, int n) {
        System.out.println("Задание №7");
        System.out.println("До: " + Arrays.toString(array));
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int t = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];

                }
                array[0] = t;

            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int t = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = t;
            }

        }
        System.out.println("После" + Arrays.toString(array));
    }

}

