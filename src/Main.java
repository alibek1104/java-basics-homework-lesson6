import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1.

        int [] array = {1, 3, 4, 1, 5, 5};
        double sum = 0;
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);

        //2.

        int [] array = {1, 3, 4, 1, 5, 5};
        for (int i = 0; i < array.length; i++) { // мы пробегаемся по массиву
            for (int j = i+1; j < array.length; j++) { // здесь мы сравниваем значения
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }

        // 3. 1)

        int[] array = {1, 3, -6, 23, 14, 2};
        int x = 23;
        boolean isFound = false;

        for (int number : array) { // используем for-each
            if (number == x) {
                isFound = true;
                break;
            }
        }
        System.out.println("Найдено: " + isFound);



        // 3. 2)

        int[] array = {1, 3, -6, 23, 14, 2};
        int x = 0;
        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == x) {
                    isFound = true;
                }
            }
        }
        System.out.println("Не найдено: " + isFound);

        // 4. 1)

        // 4. 2)


        int [] array = {1, 3, -6, 23, 14, 2};
        int x = 23;
        int foundIndex = 0;
        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                foundIndex = i;
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Индекс = " + foundIndex);
        } else {
            System.out.println("Не найдено");
        }

        // 5. 1)

        int[] array = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};

        int n = 3;
        int m = 8;
        int[] result = new int[m-n + 1];
        int counter = 0;

        for (int i = n; i <= m; i++) {
            result[counter] = array[i];
            counter++;
        }

        for (int number : result) {
            System.out.print(number + " ");
        }

        // 5. 2)


        int[] array = {1, 3, -6, 23, 14, 2};
        int n = 1;
        int m = 3;
        int counter = 0;

        int result[] = new int[m-n + 1];

        for (int i = n; i <= m; i++) {
            result[counter] = array[i];
            counter++;
        }

        for (int number : result) {
            System.out.print(number + " ");
        }

        // 6.

        int[] array = {1, 3, -6, 23, 14, 2};

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);

        // 7.

        int[] array = {1, 3, -6, 23, 14, 2};
        Arrays.sort(array);
        int min = array[0];
        int secondMin = array[1];
        System.out.println("Наименьший элемент = " + min);
        System.out.println("Второй наименьший элемент = " + secondMin);

        int[] array = {1, 3, -6, 23, 14, 2};
        int min = 0;
        int secondMin = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                int num = array[j];
                if (array.length > j + 1) {
                    if (num > array[j + 1]) {
                        array[j] = array[j + 1];
                        array[j + 1] = num;
                    }
                }
            }
        }
        min = array[0];
        secondMin = array[1];
        System.out.println("Наименьший элемент = " + min);
        System.out.println("Второй наименьший элемент = " + secondMin);

        // 8.

        int[] array = {1, 2, 3, 0, 4, 6};
        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }

        // 9. 1)

        int[][] array = {{10, 20, 30},{40, 50, 60}};
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println(array[i][j] + " " + array[i + 1][j]);
                }
            }


        // 9. 2)

        int[][] array = {{4, 2, 1},{2, 7, 2}};
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j] + " " + array[i+1][j]);
            }
        }
        // 10.

        int[][] array = {{10, 20, 30}, {40, 50, 60}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма = " + sum);

        // 11. 1)

        int[][] array =
                {{10, 20, 30},
                {40, 50, 60}};
        boolean decision = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length != array[j].length)
                    decision = false;
                break;
            }
            System.out.println(decision);
        }


        // 11. 2)


        int [][] array =
                {{10, 20},
                {40, 50}};

        boolean decision = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length != array[j].length)
                    decision = false;
                break;
            }
            System.out.println(decision);
        }

        // 12.
        // 13.


    }
}