import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Дан массив чисел. Напишите программу для вычисления среднего значения элементов одномерного массива.
        //Дано:
        //[1, 3, 4, 1, 5, 5]
        //
        //Вывод:
        //Среднее значение = 3.16666667

//        int [] array = {1, 3, 4, 1, 5, 5};
//        double sum = 0;
//        double average = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        System.out.println(sum / array.length);

        // 2. Дан массив целых значений. Напишите программу для поиска дубликатов значений.
        //
        //Дано:
        //[1, 3, 4, 1, 5, 5]
        //
        //Вывод:
        //Дубликаты = 1, 5

//        int [] array = {1, 3, 4, 1, 5, 5};
//        for (int i = 0; i < array.length; i++) { // мы пробегаемся по массиву
//            for (int j = i+1; j < array.length; j++) { // здесь мы сравниваем значения
//                if (array[i] == array[j]) {
//                    System.out.println(array[i]);
//                }
//            }
//        }

        // 3. Дан массив целых значений. Напишите программу для проверки, содержит ли массив определенное значение.
        //1)
        //Дано:
        //[1, 3, -6, 23, 14, 2]
        //int x = 23
        //
        //Вывод:
        //True
//        int[] array = {1, 3, -6, 23, 14, 2};
//        int x = 23;
//        boolean isFound = false;
//
////        for (int number : array) { // используем for-each
////            if (number == x) {
////                isFound = true;
////                break;
////            }
////        }
////        System.out.println("Найдено: " + isFound);
//


        //2)
        //Дано:
        //[1, 3, -6, 23, 14, 2]
        //int x = 0
        //
        //Вывод:
        //False

//        int[] array = {1, 3, -6, 23, 14, 2};
//        int x = 0;
//        boolean isFound = false;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i] == x) {
//                    isFound = true;
//                }
//            }
//        }
//        System.out.println("Не найдено: " + isFound);

        // 4. Дан массив целых значений. Напишите программу для нахождения индекса элемента массива.
        //1)
        //Дано:
        //[1, 3, -6, 23, 14, 2]
        //int x = 23
        //
        //Вывод:
        //Индекс = 3
        //
        //2)
        //Дано:
        //[1, 3, -6, 23, 14, 2]
        //int x = 5
        //
        //Вывод:
        //Не найдено


//        int [] array = {1, 3, -6, 23, 14, 2};
//        int x = 23;
//        int foundIndex = 0;
//        boolean isFound = false;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x) {
//                foundIndex = i;
//                isFound = true;
//                break;
//            }
//        }
//        if (isFound) {
//            System.out.println("Индекс = " + foundIndex);
//        } else {
//            System.out.println("Не найдено");
//        }

        // 5. Даны массив целых значений и целые числа n, m. Напишите программу для нахождения подмассива
        // между индексами n и m.
        //1)
        //Дано:
        //[34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7]
        //int n = 3
        //int m = 8
        //
        //Вывод:
        //[30, 25, 40, 32, 31, 35]
        //

//        int[] array = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
//
//        int n = 3;
//        int m = 8;
//        int[] result = new int[m-n + 1];
//        int counter = 0;
//
//        for (int i = n; i <= m; i++) {
//            result[counter] = array[i];
//            counter++;
//        }
//
//        for (int number : result) {
//            System.out.print(number + " ");
//        }

        //2)
        //Дано:
        //[1, 3, -6, 23, 14, 2]
        //int n = 1
        //int m = 3
        //
        //Вывод:
        //[3, -6, 23]

//        int[] array = {1, 3, -6, 23, 14, 2};
//        int n = 1;
//        int m = 3;
//        int counter = 0;
//
//        int result[] = new int[m-n + 1];
//
//        for (int i = n; i <= m; i++) {
//            result[counter] = array[i];
//            counter++;
//        }
//
//        for (int number : result) {
//            System.out.print(number + " ");
//        }

        // 6. Дан массив целых значений. Напишите программу для нахождения наибольшего и наименьшего
        // элементов массива.
        //
        //Дано:
        //[1, 3, -6, 23, 14, 2]
        //
        //Вывод:
        //Минимальный элемент = -6
        //Максимальный элемент = 23

//        int[] array = {1, 3, -6, 23, 14, 2};
//
//        int min = array[0];
//        int max = array[0];
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("Минимальный элемент = " + min);
//        System.out.println("Максимальный элемент = " + max);

        // 7. Дан массив целых значений. Напишите программу для нахождения наименьшего и
        // второго наименьшего элементов заданного массива.
        //
        //Дано:
        //[1, 3, -6, 23, 14, 2]
        //
        //Вывод:
        //Наименьший элемент = -6
        //Второй наименьший элемент = 1

//        int[] array = {1, 3, -6, 23, 14, 2};
//        Arrays.sort(array);
//        int min = array[0];
//        int secondMin = array[1];
//        System.out.println("Наименьший элемент = " + min);
//        System.out.println("Второй наименьший элемент = " + secondMin);

//        int[] array = {1, 3, -6, 23, 14, 2};
//        int min = 0;
//        int secondMin = 0;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length; j++) {
//                int num = array[j];
//                if (array.length > j + 1) {
//                    if (num > array[j + 1]) {
//                        array[j] = array[j + 1];
//                        array[j + 1] = num;
//                    }
//                }
//            }
//        }
//        min = array[0];
//        secondMin = array[1];
//        System.out.println("Наименьший элемент = " + min);
//        System.out.println("Второй наименьший элемент = " + secondMin);

        // 8. Дан массив целых значений. Напишите программу для формирования наибольшего числа из заданного массива целых неотрицательных чисел.
        //
        //Дано:
        //[1, 2, 3, 0, 4, 6]
        //
        //Вывод:
        //643210

        int[] array = {1, 2, 3, 0, 4, 6};




    }
}