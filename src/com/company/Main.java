package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] lessons) {
        /*
        Ввести предложение с клавиатуры. Заменить все вхождения одного слова в предложении другим словом.
         */

        Scanner scanner = new Scanner(System.in);
        String oldWord = "test";
        String newWord = "best";

        System.out.print("Ввести предложение с клавиатуры: ");
        String str1 = scanner.nextLine();

        System.out.print(str1);



        /*
        В строке находится одно слово. Изменить порядок букв в слове на обратный
         */

//        String str1 = "строка";
//
//        for (int i = 0, j = str1.length() - 1; i < str1.length() / 2; i++, j--) {
//            str1 = str1.substring(0, i) + str1.charAt(j) + str1.substring(i + 1, j) + str1.charAt(i) + str1.substring(j + 1);
//            // "" + a + трок + с + ""   атрокс  а + к + ро + т + с
//        }
//
//        System.out.println(str1);

        /*
        тест
         */

//        String str1 = "Eugene";
//        char letter = 'e';
//        int counter = 0;
//
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.toLowerCase().charAt(i) == letter) {
//                counter++;
//            }
//        }
//
//        System.out.println(counter);

        /*
        Даны два слова, каждое в отдельной строке.
        Распечатать все буквы, которые присутствуют в одном слове и отсутствуют во втором.
         */

//        String str1 = "цифры";
//        String str2 = "букварь";
//
//        for (int i = 0; i < str1.length(); i++) {
//            boolean flag = true;
//            for (int j = 0; j < str2.length(); j++) {
//                if (str1.charAt(i) == str2.charAt(j)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                System.out.print(str1.charAt(i) + " ");
//            }
//        }

//        String str1 = "HelloWorld";
//        String str2 = new String("HelloWorld");
//        String str3 = "HelloWorld";
//
//        System.out.println(str1.equals(str2));


        /*
        Сортировка методом пузырька
Суть алгоритма такова. Если пройдёмся по любому массиву установив правильный порядок
в каждой паре соседних элементов, то после того прохода на последнем месте массива гарантированно
будет стоять нужный элемент (самый большой для сортировки по возрастанию или самый маленький
для сортировки по убыванию). Если ещё раз пройтись по массиву с такими же преобразованиями,
то и на предпоследнем месте гарантированно окажется нужный элемент. И так далее.
Пример:
2 9 1 4 3 5 2 → порядок правильный (2 9), не будет перестановки
2 9 1 4 3 5 2 → 2 1 9 4 3 5 2
2 1 9 4 3 5 2 → 2 1 4 9 3 5 2
2 1 4 9 3 5 2 → 2 1 4 3 9 5 2
2 1 4 3 9 5 2 → 2 1 4 3 5 9 2
2 1 4 3 5 9 2 → 2 1 4 3 5 2 9
         */

        //        int [] arr = new int[] {1, -3, 0, -9, 2, -13};
//        int[] arr = new int[]{1, 2, 3, 4, 6, 5};
//        int counter = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag = true;
//            for (int j = 0; j < arr.length - 1; j++) {
//                counter++;
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    flag = false;
//                }
//            }
//            if (flag == true) {
//                break;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//        System.out.println(counter++);

////        int [] arr = new int[] {1, -3, 0, -9, 2, -13};
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
//        int counter = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                counter++;
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//        System.out.println(counter++);

        /*
        Сортировка выборкой
        Рассмотрим пример сортировки по возрастанию. То есть, в результате выполнения программы,
        на начальной позиции в массиве должен стоять минимальный элемент, на следующей — больший или равный и т. д.,
         на последнем месте должен стоять наибольший элемент.
Суть алгоритма такова. Во всём массиве отыскиваем минимальный элемент, меняем его местами с начальным.
Затем в оставшейся части массива (т. е. среди всех элементов кроме начального) снова отыскиваем минимальный элемент,
меняем его местами уже со вторым элементом в массиве. И так далее. Другими словами, берем нулевой элемент и определяем
 его как временно наименьший элемент и сравниваем последовательно с остальными, пока он меньше других. Если он вдруг
 оказывается больше очередного элемента в цепи сравнений, то определяем его как временно наименьший и продолжаем
 движение по массиву. В конце этот временно наименьший элемент ставим в нулевую ячейку (так как он действительно
  наименьший в данном массиве) а на его месть переносим элемент из нулевой ячейки (меняем их местами).
  Следующую итерацию начинаем со следующей (не нулевой а уже первой ячейки). И.Т.Д.
         */

//        int [] arr = new int[] {1, -3, 0, -9, 2, -13};
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = arr[i];
//            int minIndex = i;
//
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < min) {
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = min;
//            arr[minIndex] = temp;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }


        /*
    Интересная задачка
     Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил
      начинать каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения,
      но в классе 15 человек, а примеры среди них не должны повторяться. В помощь учителю напишите программу,
      которая будет выводить на экран 15 случайных примеров из таблицы умножения (от 2*2 до 9*9, потому что задания
      по умножению на 1 и на 10 — слишком просты). При этом среди 15 примеров не должно быть повторяющихся
      (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).

      3 x 5 = 15

         */

//        Random random = new Random();
//
//        int[][] arr = new int[15][2];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i][0] = random.nextInt(8) + 2; // 7
//            arr[i][1] = random.nextInt(8) + 2; // 5
//            boolean flag = true;
//            for (int j = 0; j < i; j++) {
//                if (arr[j][0] == arr[i][0] && arr[j][1] == arr[i][1] || arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
//                    flag = false;
//                    i--;
//                    break;
//                }
//            }
//            if (flag == false) {
//                continue;
//            }
//
//            System.out.println(arr[i][0] + " x " + arr[i][1] + " = " + (arr[i][0] * arr[i][1]));
//        }

//        for (int i = 0; i < arr.length; i++) {
//            int x = random.nextInt(8) + 2; // 7
//            int y = random.nextInt(8) + 2; // 5
//            boolean flag = true;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j][0] == x && arr[j][1] == y || arr[j][0] == y && arr[j][1] == x) {
//                    flag = false;
//                    i--;
//                    break;
//                }
//            }
//            if (flag == false) {
//                continue;
//            }
//
//            arr[i][0] = x;
//            arr[i][1] = y;
//            System.out.println(x + " x " + y + " = " + (x * y));
//        }

        
        /*
        Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
        Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял
        её наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять элементы в
        рамках одной строки. Порядок остальных элементов строки не важен (т.е. можно совершить только одну
        перестановку, а можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на экран.
         */

//        Random random = new Random();
//        int[][] arr = new int[6][7];
//
//        for (int i = 0; i < arr.length; i++) {
//            int max = 0, maxIndex = 0;
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(10);
//                System.out.print(arr[i][j] + " ");
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                    maxIndex = j;
//                }
//            }
//            if (arr[i][0] < max) {
//                int temp = arr[i][0];
//                arr[i][0] = max;
//                arr[i][maxIndex] = temp;
//            }
//            System.out.println(" = " + max);
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        /*
        Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5; 5].
        Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением
        элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.
         */

//        Random random = new Random();
//        int[][] arr = new int[7][4];
//        int index = 0;
//
//        for (int i = 0, max = 0; i < arr.length; i++) {
//            int mult = 1;
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(11) - 5;
//                System.out.printf("%3d ", arr[i][j]);
//                mult = arr[i][j] * mult;
//                if (mult < 0) {
//                    mult = mult * -1;
//                }
//            }
//            if (mult > max) {
//                max = mult;
//                index = i;
//            }
//            System.out.print("Произведение элементов = " + mult + ", Индекс строки = " + i);
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println("Индекс =  " + index);



        /*
        Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99; 99].
         Вывести массив на экран. После на отдельной строке вывести на экран значение максимального
         элемента этого массива (его индекс не имеет значения).
         */

//        int[][] arr = new int[5][8];
//        Random random = new Random();
//        int max = -99;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(199) - 99;
//                System.out.printf("%3d ", arr[i][j]);
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println(max);








        /*
        Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10; 99].
        Вывести массив на экран.
         */
//
//        Random random = new Random();
//        int[][] arr = new int[8][5]; // строчки, столбцы
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(90) + 10;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        /*
        Дан массив произвольных положительных чисел.
        Так же дано число Х. Найти ближайшее число из массива к числу Х не более чем за один проход массива.
Например:
Массив 2, 6, 9, 4, 1, 23, 55
Число Х = 7
Ближайшим является число 9
         */

//        int[] arr = new int[]{2, 6, 9, 4, 1, 23, 55};
//        int x = 10;
//
//        int result = arr[0];
//
//        for (int i = 0, minDistance = 0; i < arr.length; i++) {
//            int distance = arr[i] - x;
//            if (distance < 0) {
//                distance = distance * -1;
//            }
//            if (i == 0) {
//                minDistance = distance;
//                continue; // обрывает текущую итерацию, отправляет в третий раздел
//            }
//            if (distance < minDistance) {
//                minDistance = distance;
//                result = arr[i];
//            }
//        }
//
//        System.out.println(result);

        /*
        Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
        Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        Создать массив из n случайных целых чисел из отрезка [0; n] и вывести его на экран.
        Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
         */

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int n;
//        int count = 0;
//
//        do {
//            System.out.println("Введите натуральное число большее 3 : ");
//            n = scanner.nextInt();
//        } while (n <= 3);
//
//        int[] arr1 = new int[n];
//
//        System.out.print("Исходный массив, чья длина = " + n + " : ");
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = random.nextInt(n + 1);
//            System.out.print(arr1[i] + " ");
//            if (arr1[i] % 2 == 0 && arr1[i] != 0) {
//                count++;
//            }
//        }
//
//        System.out.println();
//
//        if (count > 0) {
//            int[] arr2 = new int[count];
//
//            System.out.print("Второй массив только из чётных элементов первого массива : ");
//
//            for (int i = 0 , j = 0; i < arr1.length; i++) {
//                if (arr1[i] % 2 == 0 && arr1[i] != 0) {
//                        arr2[j] = arr1[i];
//                        System.out.print(arr2[j] + " ");
//                        j++;
//                }
//            }
//
//            System.out.println();
//
//            System.out.print("Проверка массива = ");
//
//            for (int i = 0; i < arr2.length; i++) {
//                System.out.print(arr2[i] + " ");
//
//            }
//        }

        /*
        изначальное решение
         */

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int n;
//        int count = 0;
//
//        do {
//            System.out.println("Введите натуральное число большее 3 : ");
//            n = scanner.nextInt();
//        } while (n <= 3);
//
//        int[] arr1 = new int[n];
//
//        System.out.print("Исходный массив, чья длина = n : ");
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = random.nextInt(n + 1);
//            System.out.print(arr1[i] + " ");
//        }
//
//        System.out.println();
//
//        System.out.print("Чётные элементы исходного массива = ");
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] % 2 == 0 && arr1[i] != 0) {
//                System.out.print(arr1[i] + " ");
//                count++;
//            }
//        }
//
//        System.out.println();
//
//        System.out.println("Длина второго массива, которую мы вычислили = " + count);
//
//        int[] arr2 = new int[count];
//
//        System.out.print("Второй массив только из чётных элементов первого массива : ");
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] % 2 == 0 && arr1[i] != 0) {
//                for (int j = 0; j < arr2.length; j++) {
//                    arr2[j] = arr1[i];
//                    System.out.print(arr2[j] + " ");
//                    j++;
//                    break;
//                }
//            }
//        }
//
//        System.out.println("проверка массива");
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }

        /*
Программа должна создать массив из 12 случайных целых чисел из отрезка [-10; 10] таким образом,
чтобы отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок
следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно выпадает
сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
 Вывести полученный массив на экран.
         */

//        Random random = new Random();
//        int[] arr = new int[12];
//        int positiveCounter = 0;
//        int negativeCounter = 0;
//        int counter = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(21) - 10;
//            counter++;
//            if (arr[i] == 0) {
//                i--;
//                continue;
//            }
//            if (arr[i] > 0 && positiveCounter == arr.length / 2) {
//                arr[i] = arr[i] * -1;
//            }
//            if (arr[i] < 0 && negativeCounter == arr.length / 2) {
//                arr[i] = arr[i] * -1;
//            }
//            System.out.print(arr[i] + " ");
//            if (arr[i] > 0) {
//                positiveCounter++;
//            } else {
//                negativeCounter++;
//            }
//        }
//
//        System.out.println();
//        System.out.println(counter);

        /*
        Пользователь должен указать с клавиатуры чётное положительное число,
        а программа должна создать массив указанного размера из случайных целых чисел из [-5; 5]
        и вывести его на экран в строку. После этого программа должна определить и сообщить пользователю о том,
        что сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы
        модулей равны. Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода
        до тех пор, пока не будет указано корректное значение.
         */

//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        int n;
//        int leftSum = 0;
//        int rightSum = 0;
//
//        do {
//            System.out.println("Введите четное положительное число: ");
//            n = scanner.nextInt();
//        } while (n <= 0 || n % 2 != 0);
//
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(11) - 5;
//            System.out.print(arr[i] + " ");
//            if (arr[i] < 0) {
//                arr[i] = arr[i] * -1;
//            }
//            if (i < arr.length / 2) {
//                leftSum = leftSum + arr[i];
//            } else {
//                rightSum = rightSum + arr[i];
//            }
//        }
//
//        System.out.println();
//
//        System.out.println(leftSum + " " + rightSum);
//
//        if (leftSum > rightSum) {
//            System.out.println("left");
//        } else if (rightSum > leftSum) {
//            System.out.println("right");
//        } else {
//            System.out.println("=");
//        }

        /*
        Создайте два массива из 10 целых случайных чисел из отрезка [1; 9]
        и третий массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
        массива должен равняться отношению элемента из первого массива с i-ым индексом к
        элементу из второго массива с i-ым индексом. Вывести все три массива на экран
        (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
         */

//        int[] arr1 = new int[10];
//        int[] arr2 = new int[10];
//        double[] arr3 = new double[10];
//        Random random = new Random();
//        int counter = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = random.nextInt(9) + 1;
//            System.out.print(arr1[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = random.nextInt(9) + 1;
//            System.out.print(arr2[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = (double) arr1[i] / arr2[i];
//            System.out.printf("%.1f ", arr3[i]);
//            if (arr3[i] == (int)arr3[i]) {
//                counter++;
//            }
//        }
//
//        System.out.println();
//
//        System.out.println(counter);

        /*
        Создайте массив из 11 случайных целых чисел из отрезка [-1; 1],
        выведите массив на экран в строку. Определите какой элемент встречается в
        массиве чаще всего и выведите об этом сообщение на экран. Если два каких-то
        элемента встречаются одинаковое количество раз, то не выводите ничего.
         */

//        int[] arr = new int[11];
//        Random random = new Random();
//        int count1 = 0;
//        int count0 = 0;
//        int count_1 = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(3) - 1;
//            System.out.print(arr[i] + " ");
//            if (arr[i] == 1) {
//                count1++;
//            } else if (arr[i] == 0) {
//                count0++;
//            } else {
//                count_1++;
//            }
//        }
//
//        System.out.println();
//
//        System.out.println(count1 + " " + count0 + " " + count_1);
//
//        if (count_1 != count0 && count0 != count1 && count1 != count_1) {
//            if (count_1 > count0 && count_1 > count1) {
//                System.out.println(-1);
//            } else if (count0 > count_1 && count0 > count1) {
//                System.out.println(0);
//            } else {
//                System.out.println(1);
//            }
//        }


        /*
        Создайте массив из 12 случайных целых чисел из отрезка [-15; 15].
        Определите какой элемент является в этом массиве максимальным и
        сообщите индекс его последнего вхождения в массив.
         */

//        int[] arr = new int[12];
//        Random random = new Random();
//        int max = 0;
//        int index = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(31) - 15;
//            if (i == 0) { // нулевая итерация
//                max = arr[i];
//            }
//            System.out.print(arr[i] + " ");
//            if (arr[i] >= max) {
//                max = arr[i];
//                index = i;
//            }
//        }
//
//        System.out.println();
//
//        System.out.println(max);
//        System.out.println(index);

        /*
        Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
        что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
         */

//        int[] arr = new int[20];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i < 2) {
//                arr[i] = i;
//            } else {
//                arr[i] = arr[i - 1] + arr[i - 2]; //
//            }
//            System.out.print(arr[i] + " ");
//        }

//        for (int i = 0, first = 0, second = 1, third; i < array.length; i++) {
//            array[i] = first;
//            System.out.print(array[i] + " ");
//            third = first;
//            first = second;
//            second = second + third;
//        }

        /*
        Создайте массив из 4 случайных целых чисел из отрезка [10; 99], выведите его на экран в строку.
        Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
         */

//        int[] arr = new int[3];
//        Random random = new Random();
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(90) + 10;
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        // каждый следующий элемент массива должен быть больше предыдущего
//
//        if (arr[0] < arr[1] && arr[1] < arr[2]) {
//            System.out.println("возрастающая");
//        } else {
//            System.out.println("не возрастающая");
//        }
//
////        for (int i = 0; i < arr.length - 1; i++) { // arr.length - 1   -   последняя ячейка в любом массиве
////            if (arr[i] > arr[i + 1]) {
////                System.out.println("последовательность не возрастающая!");
////                break;
////            }
////            if (i == (arr.length - 2)) { // если мы дошли до предпоследней ячейки
////                System.out.println("последовательность возрастающая!");
////            }
////        }
//
////        boolean flag = true;
////        for (int i = 0; i < arr.length - 1; i++) {
////            if (arr[i] > arr[i + 1]) {
////                flag = false;
////                System.out.println("последовательность не возрастающая!");
////                break;
////            }
////        }
////
////        if (flag) {
////            System.out.println("последовательность возрастающая!");
////        }

        /*
        Создайте 2 массива из 5 случайных целых чисел из отрезка [0; 5] каждый,
        выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое
        элементов каждого массива и сообщите,
        для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
         */

//        int[] arr = new int[5];
//        int[] arr2 = new int[5];
//        Random random = new Random();
//        double arifm1 = 0;
//        double arifm2 = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(6);
//            System.out.print(arr[i] + " ");
//            arifm1 = arifm1 + arr[i];
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = random.nextInt(6);
//            System.out.print(arr2[i] + " ");
//            arifm2 = arifm2 + arr2[i];
//        }
//
//        System.out.println();
//
//        if (arifm1 == arifm2) {
//            System.out.println(arifm1 / arr.length + " = " + arifm2 / arr.length);
//        } else if (arifm1 > arifm2) {
//            System.out.println(arifm1 / arr.length + " > " + arifm2 / arr.length);
//        } else {
//            System.out.println(arifm1 / arr.length + " < " + arifm2 / arr.length);
//        }

        /*
        Создайте массив из 8 случайных целых чисел из отрезка [1; 10]. Выведите массив на экран в строку.
        Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
         */

//        Random random = new Random();
//
//        int[] arr = new int[8];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10) + 1;
//            System.out.print(arr[i] + " ");
//            if (i % 2 != 0) {
//                arr[i] = 0;
//            }
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + " ");
//        }

        /*
        Создайте массив из 15 случайных целых чисел из отрезка [0; 9]. Выведите массив на экран.
        Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
         */

//        int[] arr = new int[15];
//        Random random = new Random();
//        int counter = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10);
//            System.out.print(arr[i] + " ");
//            if (arr[i] % 2 == 0 && arr[i] != 0) {
//                counter++;
//            }
//        }
//
//        System.out.println();
//        System.out.println("Количество в массиве чётных элементов = " + counter);


        /*
        Создайте массив из всех нечётных чисел от 1 до 99,
         выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
         но в обратном порядке.
         */

//        int[] arr; // обьявили массив, но не можем инициализировать, не знаем длину
//        int lenghtOfArr = 0; // счетчик длины массива - количества ячеек
//
//        for (int i = 1; i < 100; i++) { // подсчет длины массива - нечётных чисел от 1 до 99
//            if (i % 2 != 0) {
//                lenghtOfArr++;
//            }
//        }
//
//        System.out.println(lenghtOfArr);
//
//        arr = new int[lenghtOfArr]; // инициализация массива - длина массива 50
//
//        for (int i = 0, j = 1; i < arr.length; i++) { // заполнение массива, для заполнения нужна дополнительная
//            // переменная
//            arr[i] = j;
//            j = j + 2;
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }

        /*
        Создайте массив из всех чётных чисел от 2 до 20 и выведите
        элементы массива на экран сначала в строку, отделяя один элемент
        от другого пробелом, а затем в столбик (отделяя один элемент от другого
        началом новой строки).
2 4 6 … 18 20
2
4
6
…
20
         */

//        int[] arr;
//        int lenghtOfArr = 0;
//
//        for (int i = 2; i < 21; i++) {
//            if (i % 2 == 0) {
//                lenghtOfArr++;
//            }
//        }
//
//        arr = new int[lenghtOfArr];
//
//        for (int i = 0, j = 2; i < arr.length; i++) {
//            arr[i] = j;
//            j = j + 2;
//            System.out.print(arr[i] + " ");
//        }
//
//        for (int i = 0, j = 2; i < arr.length; i++) {
//            arr[i] = j;
//            j = j + 2;
//            System.out.println();
//            System.out.print(arr[i]);
//        }

        /*
        Создать и заполнить массив значениями от 0 до 9.
         */

//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//            System.out.print(arr[i] + " ");
//        }


        /*
        Задача 2. Дан массив действительных чисел. Вычислить сумму положительных
        и произведение четных по значению членов данного массива. Если членов с
        положительными или четными значениями нет, то выдать  соответствующее сообщение.
         */

//        int resultSum = 0;
//        int resultMult = 1;
//        int[] arr = new int[]{4, -2, 0, 3, 1, 2, -5, 5, 7, 9};
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                resultSum = resultSum + arr[i];
//            }
//            if (arr[i] % 2 == 0 && arr[i] != 0) {
//                resultMult = resultMult * arr[i];
//            }
//        }
//
//        System.out.println(resultSum);
//        System.out.println(resultMult);


        /*
        Задача 1. Дан массив чисел: а[0], a[1], a[2], ..., а[n-1]. Выяснить, имеются ли в данном
        массиве два идущих подряд  положительных элемента. Подсчитать количество таких пар.
         */

//        int counter = 0;
//        int[] a = new int[]{4, -1, 22, 35, 100, 21, -54, 5, 7, 90};
//
//        for (int i = 0; i < a.length - 1; i++) {
//            if (a[i] > 0 && a[i + 1] > 0) {
//                counter++;
//            }
//        }
//
//        System.out.println(counter);


//        /*
//        тестовый массив № 1
//         */
//
//        int[] monthDays = new int[5];
//        monthDays[0] = 31;
//        monthDays[1] = 30;
//        monthDays[2] = 29;
//        monthDays[3] = 28;
//        monthDays[4] = 27;
//        System.out.println(monthDays[4]);
//
//        int[] arr = new int[]{-13, 0, 2, 4, 7};

        /*
        тестовый массив № 2
         */

//        int monthDays[] = {
//                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
//        };
//
//        System.out.println("В декабре " + monthDays[11] + " дней");

        /*
        Загадать случайно 100 целых чисел в диапазоне от -100 до 100. Вычислить процент положительных чисел,
        процент отрицательных чисел и процент нулей. Вычислить процент чётных чисел и процент нечётных.
         */

//        int counterEven = 0;
//        int counterOdd = 0;
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//        Random random = new Random();
//        int n;
//
//        for (int i = 0; i < 10; i++) {
//            n = random.nextInt(21) - 10;
//            System.out.print(n + " ");
//
//            if (n % 2 == 0) {
//                counterEven++;
//            } else {
//                counterOdd++;
//            }
//            if (n > 0) {
//                positive++;
//            } else if (n < 0) {
//                negative++;
//            } else {
//                zero++;
//            }
//        }
//
//        System.out.printf("\nКоличество четных = " + counterEven + "\n" +
//                "Количество нечетных " + counterOdd + "\n" +
//                "Количество положительных = " + positive + "\n" +
//                "Количество отрицательных = " + negative + "\n" +
//                "Количество нулей = " + zero);

// Random random1 = new Random();
// int n;
//
// n = random1.nextInt(900) + 100;
//To get a random number between a set range with min and max:
//random.nextInt(30 + 10) - 10;
//// max = 30; min = -10;

//random.nextInt(100 + 10) - 10;
//

//        Random random = new Random();
//        int n;
//        int max = 0;
//        int min = 0;
//
//        for (int i = 0; i < 10000; i++) {
//            n = random.nextInt(110) - 10;
//            if (n >= max) {
//                max = n;
//            }
//            if (n < min) {
//                min = n;
//            }
//        }
//
//        System.out.println("Нижняя граница = " + min + "\n"
//                + "Верхняя граница = "+ max);

        /*
        Вывести на экран таблицу умножения (таблицу Пифагора).
         */

//        for (int i = 1; i < 10; i++) {
//            System.out.print(i + " ");
//            for (int j = 1; j < 10; j++) {
//                System.out.printf("%2d ", i * j);
//            }
//            System.out.println();
//        }

//        for (int i = 2; i < 10; i++) {
//            for (int j = 2; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + i * j);
//            }
//        }

        /*
Палиндром - цифры.
- найти максимальное палиндромное число из произведения всех пар возможных трехзначных (пятизначных)
чисел, а также выводить и сами множители (913 x 993 = 906609).
- оптимизировать программу так чтобы избежать повторяющихся операций (минимальное количество итераций - направление).
Палиндром – число, которое читается одинаково в обоих направлениях до середины (например 90609 или 906609).
         */

//        int maxPalindrom = 0;
//        int mult1 = 0;
//        int mult2 = 0;
//        int iterationNumber = 0; // 810000 // 77407
//
//        for (int i = 999; i >= 100; i--) {
//            boolean flag = true;
//            for (int j = 999; j >= 100; j--) {
//                iterationNumber++;
//                int mult = i * j;                     // 913 x 993 = 906609     993 x 913 = 906609
//                int n1 = mult / 100000;
//                int n2 = mult / 10000 % 10;
//                int n3 = mult / 1000 % 10;
//                int n4 = mult / 100 % 10;
//                int n5 = mult / 10 % 10;
//                int n6 = mult % 10;
//                if (n1 != 0 && n1 == n6 && n2 == n5 && n3 == n4 && mult >= maxPalindrom) {
//                    mult1 = i;
//                    mult2 = j;
//                    if (mult == maxPalindrom) {
//                        flag = false;
//                        break;
//                    }
//                    maxPalindrom = mult;
//                }
//            }
//            if (!flag) {    // !flag   == flag == false
//                break;
//            }
//        }
//
//        System.out.println(mult1 + " x " + mult2 + " = " + maxPalindrom);
//        System.out.println(iterationNumber);

//        int counter = 0;
//
//        for (int i = 999999; i > 1099; i--) {
//            int n1 = i / 100000;
//            int n2 = i / 10000 % 10;
//            int n3 = i / 1000 % 10;
//            int n4 = i / 100 % 10;
//            int n5 = i / 10 % 10;
//            int n6 = i % 10;
//            if (n1 == n6 && n2 == n5 && n3 == n4) {
//                for (int j = 1001; j < i; j--) {
//                    if (i % j == 0) {
//                        System.out.println(j + " x " + i / j + " = " + String.format("%06d", i));
//                        break;
//                    }
//                }
//            }
//        }
//
//        System.out.println("Количество палиндромов = " + counter);

//        int counter = 0;
//
//        for (int i = 999999; i > 1099; i--) {
//            int n1 = i / 100000;
//            int n2 = i / 10000 % 10;
//            int n3 = i / 1000 % 10;
//            int n4 = i / 100 % 10;
//            int n5 = i / 10 % 10;
//            int n6 = i % 10;
//            if (n1 == n6 && n2 == n5 && n3 == n4) {
//                System.out.println(i);
//                counter++;
//            }
//        }
//
//        System.out.println("Количество палиндромов = " + counter);

//        int n = 123456;
//
//        n1 = n6 = n / 100000 = n % 10
//                n2 = n5 = n / 10000 % 10 = n / 10 % 10
//                        n3 = n4 = n / 1000 % 10 = n / 100 % 10
//
//        int n1 = n / 100000;
//        System.out.println(n1);
//
//        int n2 = n / 10000 % 10;
//        System.out.println(n2);
//
//        int n3 = n / 1000 % 10;
//        System.out.println(n3);
//
//        int n4 = n / 100 % 10;
//        System.out.println(n4);
//
//        int n5 = n / 10 % 10;
//        System.out.println(n5);
//
//        int n6 = n % 10;
//        System.out.println(n6);




                /*
                Задача "Суеверные военные"
        В американской армии считается несчастливым число 13, а в японской — 4.
        Перед международными учениями штаб украинской армии решил исключить номера
        боевой техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040),
        чтобы не смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс. единиц боевой техники
        и каждая боевая машина имеет номер от 00001 до 99999, то сколько всего номеров придётся исключить?
                 */

//        int count = 0;
//
//        for (int i = 4; i < 100000; i++) {  // (int i = 4; i < 100000; i++); 13134
//            for (int j = i; j > 0; j = j / 10) {
//                if (j % 10 == 4 || i % 100 == 13) { // || i % 100 == 13
////                    System.out.printf("%05d\n", i);
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);


//        int count1 = 0;
//        int count2 = 0;
//
//        for (int i = 61324; i < 61325; i++) {  // (int i = 4; i < 100000; i++); 13134
//            for (int j = i; j > 0; j = j / 10) {
//                if (j % 10 == 4) {
////                    System.out.printf("%05d\n", i);
//                    count1++;
//                    break;
//                }
//            }
//            for (int k = i; k > 0; k = k / 10) {
//                if (k % 100 == 13) {
////                    System.out.printf("%05d\n", i);
//                    count2++;
//                    break;
//                }
//            }
//        }
//
//        System.out.println(count1 + count2);


        /*
        Задача "Симметричное время"
Электронные часы показывают время в формате от 00:00 до 23:59. Сколько раз за сутки слева от двоеточия
показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).

---- Как вы это поняли?-----
Как Вы это сделали?
         */

//        int counter = 0;
//
//        for (int i = 0; i < 24; i++) {
//
//            for (int j = 0; j < 60; j++) {
//                if (i / 10 == j % 10 && i % 10 == j / 10) {
//                    System.out.printf("%02d:%02d\n", i, j);
//                    counter++;
//                }
//            }
//        }
//
//        System.out.println("Количество = " + counter);


        /*
Задача "Счастливый билетик"
В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов
с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма
первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах
с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю
каждого счастливого билета и теперь раздумывает, как много сувениров потребуется.
С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
         */

//        int counter = 0;
//
//        for (int i = 1001; i < 1000000; i++) {
//            if (i / 100000 + i / 10000 % 10 + i / 1000 % 10 == i / 100 % 10 + i / 10 % 10 + i % 10) {
//                System.out.println(i);
//                counter++;
//            }
//        }
//
//        System.out.println("Количество счастливых билетов = " + counter);


//        int counter = 0;

//        for (int i = 000001, n1, n2, n3, n4, n5, n6, n7, n8; i < 1000000; i++) {
//
//            n1 = i / 100000;
//            n2 = i / 10000 % 10;
//            n3 = i / 1000 % 10;
//            n4 = i / 100 % 10;
//            n5 = i / 10 % 10;
//            n6 = i % 10;
//            n7 = i / 100000 + i / 10000 % 10 + i / 1000 % 10;
//            n8 = i / 100 % 10 + i / 10 % 10 + i % 10;
//
//            if (n7 == n8) {
//                System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
//                counter++;
//            }
//        }
//
//        System.out.println("Количество счастливых билетов = " + counter);


//        for (int i = 101101, n1, n2; i < 123456; i++) {
//
//            n1 = i / 100000 + i / 10000 % 10 + i / 1000 % 10;
//            n2 = i / 100 % 10 + i / 10 % 10 + i % 10;
//
//            if (n1 == n2) {
//                System.out.println(n1);
//            }
//        }

//        int n = 123456;
//
//        System.out.println(n/ 100000);
//        System.out.println(n/ 10000 % 10);
//        System.out.println(n/ 1000 % 10);
//        System.out.println(n/ 100 % 10);
//        System.out.println(n/ 10 % 10);
//        System.out.println(n % 10);

//        for (int i = 101101, n1, n2, n3, n4, n5, n6, n7, n8; i < 123456; i++) {
//
//        n1 = i / 100000;
//        n2 = i / 10000 % 10;
//        n3 = i / 1000 % 10;
//        n4 = i / 100 % 10;
//        n5 = i / 10 % 10;
//        n6 = i % 10;
//        }

//        int n = 003102;
//
//        int n1 = (n / 100000) + (n / 10000 % 10) + (n / 1000 % 10);
//        int n2 = (n / 100 % 10) + (n / 10 % 10) + (n % 10);
//
//        System.out.println(n1 + " " + n2);
//
//        if (n1 == n2) {
//            System.out.println("вау!");
//        } else {
//            System.out.println("попробуй еще раз!");
//        }

//

//        int n = 003102;
//        int nnew = 1000000 + n;
//        int n1, n2, n3, n4, n5, n6, n7, n8;
//
//        n1 = n / 100000;
//        n2 = n / 100000 % 10;
//        n3 = n / 10000 % 10;
//        n4 = n / 1000 % 10;
//        n5 = n / 100 % 10;
//        n6 = n % 10;
//
//        System.out.println(n + " " + new + " " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);


//        n1 = n / 100000;
//        n2 = n / 10000 % 10;
//        n3 = n / 1000 % 10;
//        n4 = n / 100 % 10;
//        n5 = n / 10 % 10;
//        n6 = n % 10;
//
//        n7 = (n / 100000) + (n / 10000 % 10) + (n / 1000 % 10);
//        n8 = (n / 100 % 10) + (n / 10 % 10) + (n % 10);


//        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
//        System.out.println(n7 + " " + n8);


        /*
        Задача "Алгоритм Решето Эрастофена"
Алгоритм нахождения всех простых чисел до некоторого целого числа n, который приписывают
древнегреческому математику Эратосфену Киренскому. Как и во многих случаях, здесь название
алгоритма говорит о принципе его работы, то есть решето подразумевает фильтрацию, в данном
случае фильтрацию всех чисел за исключением простых.
По мере прохождения списка нужные числа остаются, а ненужные (они называются составными) исключаются.
1 3 5 7 11 13 17 19 23 29 31
         */

//        int n = 35;
//
//        for (int i = 1; i <= n; i++) {
//            boolean flag = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//
//            if (flag) {
//                System.out.print(i + " ");
//            }
//
//        }

//        for (int i = 1; i <= n; i++) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    break;
//                }
//                if (j == i - 1) {
//                    System.out.print(i + " ");
//                }
//            }
//        }

        /*
        Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый член и
        второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
         */

//  1  1  2  3  5  8  13  21  34  55  89
// 2 = 1 + 1
// 3 = 2 + 1
// 5 = 2 + 3

//        int first = 1, second = 1, counter = 0;
//
//        System.out.print(first + " " + second + " ");
//
//        while (counter++ < 9) {
//            int third = first + second;
//            System.out.print(third + " ");
//            first = second;
//            second = third;
//        }

//        for (int i = 0, first = 0, second = 1; i < 11; i++) {
//            System.out.print(first + " ");
//            int temp = first;
//            first = second;
//            second = second + temp;
//        }

//        for (int i = 0; i < 12; i++){
//            third = first + second;
//            System.out.print(third + " ");
//            first = second;
//            second = third;
//        }

        /*
        Для введённого пользователем с клавиатуры натурального числа посчитайте сумму
        всех его цифр (заранее не известно сколько цифр будет в числе).
         */

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите натуральное число: ");
//        int n = scanner.nextInt();
//        int result = 0;
//
//        for (int i = 0; n > 0; i++) {
//            result = result + n % 10;
//            n = n / 10;
//        }

//        System.out.println(result);

//        for (;;) { // cредний раздел по-умолчанию true
//            System.out.println("Тест");
//        }
//        // что делает while

        /*
        Проверьте, является ли введённое пользователем с клавиатуры
        натуральное число — простым. Постарайтесь не выполнять лишних действий
        (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно,
        что число составное и проверку продолжать не нужно). Также учтите, что наименьший
        делитель натурального числа n, если он вообще имеется,
            обязательно располагается в отрезке [2; √n].
         */
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите целое число: ");
//        int n = scanner.nextInt();
//
//        for (int i = 2, stop = (int) Math.sqrt(n); i <= stop; i++) {
//            if (i == stop) {
//                System.out.print("Число простое!");
//                break;
//            }
//            if (n % i == 0) {
//                System.out.println("Число составное!");
//                break;
//            }
//        }


////        int i = (int) Math.sqrt(n);
//        int i = n - 1;
//
//        while (i >= 1) {
//            if (n % i == 0 && i != 1) {
//                System.out.print("Число составное!");
//                break;
//            }
//            if (i == 1) {
//                System.out.print("Число простое!");
//            }
//            i--;
//        }



        /*
        Выведите на экран все положительные делители натурального числа,
        введённого пользователем с клавиатуры.
         */
//        System.out.println(n % 2);
//        System.out.println(n % 5);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите целое число: ");
//        int n = scanner.nextInt();
//
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                System.out.print(i + " ");
//            }
//        }

//        int i = n - 1;
//
//        while (i > 1) {
//            if(n % i == 0){
//                System.out.print(i + " ");
//            }
//            i--;
//        }

//        int n = 10;
//        int i = n - 1;
//
//        while (i > 1) {
//            if(n % i == 0){
//                System.out.print(i + " ");
//            }
//            i--;
//        }

        /*
        Создайте программу, вычисляющую факториал натурального числа n,
        которое пользователь введёт с клавиатуры.
         */

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите натуральное число: ");
//        int n = scanner.nextInt(); // 6
//        int factorial = 1;
//
//        while (n > 1) {
//            factorial = factorial * n;
//            n--;
//        }
//
//        System.out.println(factorial);






        /*
        Выведите на экран все двузначные
        члены последовательности an =  2*(an-1)+200, где a1= –166.  -132 -64
         */

//        int a = -166;
//
//        while (a < 100) {
//            if (a > -100) {
//                System.out.print(a + " ");
//            }
//            a = 2 * a + 200;
//        }






        /*
        Выведите на экран все члены последовательности an = 2*(an-1)–1, где a1=2, которые меньше 10000
        a1 a2 a3 a4 ... an an + 1    2 3 5
         */

//        int a = 2;
//
//        while (a < 100000) {
//            System.out.print(a + " ");
//            a = 2 * a - 1;
//        }



        /*
        Создайте программу, выводящую на экран первые 20
        элементов последовательности 2 4 8 16 32 64 128 …
         */

//        int n = 2;
//        int counter = 0;
//
//        while (counter < 20) {
//            System.out.println(++counter + ") " + n + " ");
//            n = n * 2;
//        }


        /*
        Создайте программу,
        выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
         */

//        int n = 90;
//
//        while (n >= 0) {
//            System.out.print(n + " ");
//            n = n - 5;
//        }



        /*
        Создайте программу, выводящую на экран первые 55 элементов
        последовательности 1 3 5 7 9 11 13 15 17 ….
         */

//        int n = 1;
//        int counter = 0;
//
//        do {
//            System.out.println(counter + 1 + ") " + n + " ");
//            n = n + 2;
//            counter++;
//        } while(counter < 55);

//        while (counter < 55) {
//            System.out.println(counter + 1 + ") " + n + " ");
//            n = n + 2;
//            counter++;
//        }


//        /*
//        Создайте программу, выводящую на экран все четырёхзначные числа последовательности
//        1000 1003 1006 1009 1012 1015 ….
//         */

//        for (инициализация; условие; итерация) {
//            тело
//        }

//        for (int n = 1000; n < 1016; n = n + 3){
//            System.out.print(n + " ");
//        }
//        int n = 1016;
//
//        do {
//            System.out.print(n + " ");
//            n += 3;
//        } while (n < 1016);

//        int n = 1016;
//
//        while(n < 1016){
//            System.out.print(n + " ");
//            n += 3;
//        }
//

//        int n = 0;
//
//        while (n < 16) {
//            System.out.print(n++ + " ");
////            n++;
//        }

//        int x = 1;
//
////        x++; // x = x + 1;   x += 1;
//
//        int y = 2 + 3 + x++;
//        System.out.println(y);
//        System.out.println(x);

//        /*
//        Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел,
//        введённых пользователем.
//        Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
//        1. Предлагаем пользователю ввести первое число
//        2. Пользователь вводит первое число
//        3. Проверяем целое ли первое число
//        3.1. Иначе выводим ошибку
//        4. Считываем первое число
//        5. Предлагаем пользователю ввести второе число
//        6. Пользователь вводит второе число
//        7. Проверяем целое ли второе число
//        7.1. Иначе выводим ошибку
//        8. Считываем второе число
//        9. Вычисляем и выводит на экран сумму двух чисел
//         */
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите первое число: ");
//        if (scanner.hasNextInt()) {
//            int n = scanner.nextInt();
//            System.out.println("Введите второе число: ");
//            if (scanner.hasNextInt()) {
//                int n1 = scanner.nextInt();
//                System.out.println("Сумма двух чисел = " + (n + n1));
//            } else {
//                System.out.println("Error! Второе число введено некорректно!");
//            }
//        } else {
//            System.out.println("Error! Первое число введено некорректно!");
//        }

//        /*
//        Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
//        чётным или нечётным. Если пользователь введёт не целое число, то сообщать ему об ошибке.
//         */
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите целое число: ");
//        if (scanner.hasNextInt()) {
//            int n = scanner.nextInt();
//
//            System.out.println(n);
//            if (n % 2 == 0) {
//                System.out.print("число " + n + " четное");
//            } else {
//                System.out.print("число " + n + " нечетное");
//            }
//        } else {
//            System.out.println("Ошибка! Не целое число!");
//        }


//        int month = 7;
//
//        switch (month) {
//            case 1:
//                System.out.println("January");
////                break;
//            case 2:
//                System.out.println("February");
////                break;
//            case 3:
//                System.out.println("March");
////                break;
//            case 4:
//                System.out.println("April");
////                break;
//            case 5:
//                System.out.println("May");
////                break;
//            case 6:
//                System.out.println("June");
////                break;
//            case 7:
//                System.out.println("July");
////                break;
//            case 8:
//                System.out.println("August");
////                break;
//            case 9:
//                System.out.println("September");
////                break;
//            case 10:
//                System.out.println("October");
////                break;
//            case 11:
//                System.out.println("November");
////                break;
//            case 12:
//                System.out.println("December");
////                break;
////            default:
////                System.out.println("Вы ввели некорректное число - " + month);
//        }

        /*
        Дан исходный код программы:
    double a = -3.0;
    a = 2 + a; // a = 2 - 3.0 = -1.0
    if (3 > 2 || 3 > 2 && false) { true
      System.out.println("4"+a); // 4-1.0
    } else {
      System.out.println(-a+"4"); // 1.04
    }
Какой тип данных из набора boolean, int, double нужно подставить вместо прочерка,
чтобы программа компилировалась корректно?
Что выведется на экран в результате работы представленной выше программы?
         */
//        double a = -3.0;
//        a = 2 + a; // a = 2 - 3.0 = -1.0
//        if (2 > 3 || 3 > 2 && false) { // true
//            System.out.println("4"+a); // 4-1.0
//        } else {
//            System.out.println(-a+"4"); // 1.04
//        }

        /*
        Дан исходный код программы:
    double b = 5.0;
    b = b*2;
    if (b > 10 || b < -10) { // false
      System.out.println("12"+0+4); // 124
    } else {
      System.out.println(0+4+"12"); // 412
    }
Какой тип данных из набора boolean, int, double нужно подставить вместо прочерка,
чтобы программа компилировалась корректно?
Что выведется на экран в результате работы представленной выше программы?
         */
//        double b = 6.0;
//        b = b*2;
//        if (b > 10 || b < -10) { // false
//            System.out.println("12"+0+4); // 1204
//        } else {
//            System.out.println(0+4+"12"); // 412
//        }


        /*
        Дан исходный код программы:
    boolean a = 5 > 3;
    if (a || (5+3)*2 < 16 ) { // true || false
      System.out.println(4+"12"+2); // 414
    } else {
      System.out.println(2+12*2); // 26
    }
Какой тип данных из набора boolean, int, double нужно подставить вместо прочерка,
 чтобы программа компилировалась корректно?
Что выведется на экран в результате работы представленной выше программы?
         */

//        boolean a = 5 == 3;
//        if (a || (5+3)*2 < 16 ) { // true || false
//            System.out.println(4+"12"+2); // 4122
//        } else {
//            System.out.println(2+12*2); // 26
//        }

        /*
        Дан исходный код программы:
    _____ a = 0 == 8%2;
    if (a || (a && false)) {
      System.out.println((1+1.5)+"2"); // 2.5 + 2 = 2.52
    } else {
    System.out.println(3+"a"+"2"+a); // 3a2a
    }
Какой тип данных из набора boolean, int, double нужно подставить вместо прочерка,
чтобы программа компилировалась корректно?
Что выведется на экран в результате работы представленной выше программы?
         */

//        boolean a = 0 == 9%2;
//        if (a || (a && false)) {
//            System.out.println((1+1.5)+"2"); // 2.5 + 2 = 2.52
//        } else {
//            System.out.println(3+"a"+"2"+a); // 3a2false
//        }

        /*
        В три переменные a, b и c явно записаны программистом три целых попарно неравных между
        собой числа.
        Создать программу, которая переставит числа в переменных таким образом,
        чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей

        c > a && c > b && b > a = a b c
        b > a && b > c && c > a = a c b
        c > a && c > b && a > b = b a c
        b > a && b > c && a > c = c a b
        a > b && a > c && c > b = b c a
        a > b && a > c && b > c = c b a

        a > b && a > c && c > b = b c a
        a > b && a > c && b > c = c b a

        b > a && b > c && c > a = a c b
        b > a && b > c && a > c = c a b

        c > a && c > b && a > b = b a c
        c > a && c > b && b > a = a b c

         */

//        int a = 9, b = 8, c = 7;
//
//        if (a > b && a > c) {
//            if (c > b) {
//                System.out.println(b + "" + c + "" + a);
//            } else {
//                System.out.println(c + "" + b + "" + a);
//            }
//        } else if (b > a && b > c) {
//            if (c > a) {
//                System.out.println(a + "" + c + "" + b);
//            } else {
//                System.out.println(c + "" + a + "" + b);
//            }
//        } else {
//            if (a > b) {
//                System.out.println(b + "" + a + "" + c);
//            } else {
//                System.out.println(a + "" + b + "" + c);
//            }
//        }
//        if (c > a && c > b && b > a) {
//            System.out.println(a + "" + b + "" + c);
//        } else if (b > a && b > c && c > a) {
//            System.out.println(a + "" + c + "" + b);
//        } else if (c > a && c > b && a > b) {
//            System.out.println(b + "" + a + "" + c);
//        } else if (b > a && b > c && a > c) {
//            System.out.println(c + "" + a + "" + b);
//        } else if (a > b && a > c && c > b) {
//            System.out.println(b + "" + c + "" + a);
//        } else if (a > b && a > c && b > c) {
//            System.out.println(c + "" + b + "" + a);
//        } else {
//            System.out.println("Error!");
//        }


//        /*
//        Создать программу, выводящую на экран случайно сгенерированное
//        трёхзначное натуральное число и его наибольшую цифру.
//         */
//        Random random1 = new Random();
//        int n;
//
//        n = random1.nextInt(900) + 100;
//        System.out.println(n);
//
//        int n1 = n / 100;
//        System.out.println(n1);
//        int n2 = n / 10 % 10;
//        System.out.println(n2);
//        int n3 = n % 10; // 935 / 10 = 93 93*10 = 930
//        System.out.println(n3);
//        if(n1 > n2 && n1 > n3) {
//            System.out.println("Наибольшая цифра = " + n1);
//        } else if(n2 > n1 && n2 > n3) {
//            System.out.println("Наибольшая цифра = " + n2);
//        } else {
//            System.out.println("Наибольная цифра = "+ n3);
//        }


//        System.out.println(n / 10 + n % 10);


        /*
        Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
        целое число в интервал (25;100) и сообщать результат на экран.
         */
//        Random random1 = new Random();
//        int n;
//
//        n = random1.nextInt(151) + 5;
//        System.out.println(n);
//
//        if(n > 25 && n < 100) {
//            System.out.println("Входит!");
//        } else {
//            System.out.println("Не входит!");
//        }



        /*
        В три переменные a, b и c записаны три вещественных числа. Создать программу,
        которая будет находить и выводить
         на экран вещественные корни квадратного уравнения ax^2 + bx + c=0,
         либо сообщать, что корней нет.
         */

//        double a = 1;  ax^2 − 8x + 12 = 0 дискриминант положительный, два решения
//        double b = 8;  ax^2 − 8x + 12 = 0
//        double c = 12;  ax^2 − 8x + 12 = 0
//        double d = b * b - 4 * a * c

//        double a = 1; // x^2 − 6x + 9 = 0 дискриминант равен 0
//        double b = -6; // x^2 − 6x + 9 = 0
//        double c = 9; // x^2 − 6x + 9 = 0
//        double d = b * b - 4 * a * c

//        double a = 5; // 5x^2 + 3x + 7 = 0 дискриминант отрицательный
//        double b = 3; // 5x^2 + 3x + 7 = 0
//        double c = 7; // 5x^2 + 3x + 7 = 0
//        double d = // b * b - 4 * a * c

//        double a = 1, b = 8, c = 12,  d;
//
//        d = b * b - 4 * a * c; // дискриминант отрицательный
//
//        System.out.println("Решение квадратного уравнения, Дискриминант = " + d);
//
//        if(d > 0) {
//            System.out.println("Дискриминант положительный, уравнение имеет два корня:");
//            System.out.println("Первый корень = " + ((-b + Math.sqrt(d)) / (2 * a)));
//            System.out.println("Второй корень = " + ((-b - Math.sqrt(d)) / (2 * a)));
//        } else if(d == 0) {
//            System.out.println("Дискриминант равен 0, уравнение имеет один корень " + -b / (2 * a));
//        } else {
//            System.out.println("Нет корней.");
//        }

//        if(d > 0) {
//            double x1 = (-b + Math.sqrt(d)) / (2 * a);
//            double x2 = (-b - Math.sqrt(d)) / (2 * a);
//            System.out.println("Дискриминант положительный, уравнение имеет два корня.");
//            System.out.println("Первый корень = " + x1);
//            System.out.println("Второй корень = " + x2);
//        } else if(d == 0) {
//            double x1 = -b / 2 * a;
//            System.out.println("Дискриминант равен 0, уравнение имеет один корень.");
//            System.out.println("Единственный корень = " + x1);
//        } else if(d < 0){
//            System.out.println("Нет корней.");
//        }


        /*
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
         */

//        int m = 11;
//        int n = 9;
//
//        int mDistance = 10 - m;
//        int nDistance = 10 - n;
//
//        if(mDistance < 0) {
//           // mDistance = -mDistance;
//            mDistance = mDistance * -1;
//        }
//
//        if(nDistance < 0) {
//            nDistance = nDistance * -1;
//        }
//
//        if(mDistance > nDistance) {
//            System.out.println(n);
//        } else if(mDistance == nDistance) {
//            System.out.println("m = n");
//        } else {
//            System.out.println(m);
//        }


// 10 - - 1 = 11
// 10 - 9 = 1
// 10 - 30 = -20



        /*
        Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n,
        чётным либо нечётным.
         */

//        int n = -22;
//
//        if(n % 2 == 0){
//            System.out.println("число n четное");
//        } else {
//            System.out.println("число n нечетное");
//        }



        /*
        Что выведется на экран в результате работы следующего фрагмента программы?
        double y = 3;
        System.out.println((int)y+6+"y"+6); // 9y6
         */

//        double y = 3;
//        System.out.println((int)y+6+"y"+6); // 9y6

        /*
        Что выведется на экран в результате работы следующего фрагмента программы?
    int w = 10;
    double z = 4;
    System.out.println(1+w/z); // 1 + 2.5 = 3.5
         */

//        int w = 10;
//        double z = 2;
//        System.out.println(1+w/z);  // 1 + 5 = 6.0



        /*
        Дан фрагмент программы:
_______ s = 990;
    System.out.println(s*2);
    Какой тип данных нужно подставить вместо прочерка,
    чтобы программа работала корректно, переменная s занимала наименьший объём памяти,
     а в результате исполнения на экран вывелось натуральное число?
         */
//        short s = 990;
//        System.out.println(s*2);


        /*
        Что выведется на экран в результате работы следующего фрагмента программы?
        double y = 3.5;
        System.out.println("7"+y*3);  // 710.5
         */

//        double y = 3.5;
//        System.out.println("7"+y*3);  // 710.5


        /*
        Что выведется на экран в результате работы следующего фрагмента программы?
        short w = 9;
        double z = w * 1.5; // 13.5
        System.out.println(w-(int)z); // 9 - 13 = -4
         */

//        short w = 9;
//        double z = w * 1.5; // 13.5
//        System.out.println(w-(int)z); // 9 - 13 = -4


        /*
        Что выведется на экран в результате работы следующего фрагмента программы?
        double w = 1.75;
        int z = (int)(2*w);  // (int) 3.5 = 3
        System.out.println(w*2+z);  // 1.75x2+3 = 6.5
         */
//        double w = 1.75;
//        int z = (int)(2*w);  // (int) 3.5 = 3
//        System.out.println(w*2+z);  // 1.75x2+3 = 6.5

        /*

    Дан фрагмент программы:
    _______ s = 3;
    System.out.println(7.5/s);
    Какой тип данных нужно подставить вместо прочерка,
    чтобы программа работала корректно, переменная s занимала наименьший объём памяти,
    а в результате исполнения на экран вывелось вещественное число?
         */

//        byte s = 3;
//        System.out.println(7.5/s);


        /*
        Что выведется на экран в результате работы следующего фрагмента программы?
        float y = 2F;
        System.out.println((int)y+"2"+y*1.5); // 223
         */

//        float y = 2F;
//        System.out.println((int)y+"2"+y*1.5);



        /*
    Что выведется на экран в результате работы следующего фрагмента программы?
    float w = 2.5F;
    int z = 10 / (int) w; // 10 / 2 = 5
    System.out.println(z+w); // 5 + 2.5 = 7.5
         */

//        float w = 2.5F;
//        int z = 10 / (int) w;
//        System.out.println(z+w);


        /*
        Что выведется на экран в результате работы следующего фрагмента программы?
        byte y = 14;
        System.out.println(2+y+"2"+y);  // 16214
         */

//        byte y = 14;
//        System.out.println(2+y+"2"+y);


        /*
        Дан фрагмент программы:
    _______ s = 120;
    System.out.println(s-20);
    Какой тип данных нужно подставить вместо прочерка,
    чтобы программа работала корректно, переменная s занимала наименьший объём памяти,
    а в результате исполнения на экран вывелось натуральное число?
     */

//        byte s = 120;
//        System.out.println(s-20);


        /*
        В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу,
        округляющую число n до ближайшего целого и выводящую результат на экран.
         */

//        double n = 5.3;
//
//        System.out.println((int) (n + 0.5));







        /*
        В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую
        на экран сумму цифр числа n...
         */

//        int n = 15;
//
//        System.out.println(n / 10 + n % 10);


        
        /*
        В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат
        деления q на w с остатком.
Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
21 / 8 = 2 и 5 в остатке
         */

//        int q = 9;
//        int w = 2;
//
//        System.out.println(q + " / " + w + " = " + q / w + " и " + q % w + " в остатке");



        /*
        Поменять местами значения переменных a и b, сначала с использованием дополнительной третьей переменной,
        а затем – без.
         */

//        int a = 2;
//        int b = 3;
//
//        a = a + b;
//        b = a - b;
//        a = a - b;


//        int c;

//        c = a;
//        a = b;
//        b = c;

//        System.out.println(a);
//        System.out.println(b);


//        boolean myBool = true; // 1 byte
//
//        byte myByte = 3; // 1 byte - 128 to 127      00000011
//        short myShort = 32000; // 2 bytes -32768 to 32767     00000000 00000000        11111010 0000000
//        int myInt = 500000000; // 4 bytes -2147483648 to 2147483647     00000000000000000000000000000000
//        long myLong = 5000000000000000000L; // 8 bytes -9223372036854775807 to 9223372036854775806 0000000000000000000000000000000000000000000000000000000000000000
//
//        float myFloat = 5.3f; // 4 bytes
//        double myDouble = 5.3; // 8 bytes
//
//        myByte = (byte) myDouble;
//
//        System.out.println(myByte);

//
//        char myChar = ' '; // 1 symbol 2 bytes

        /*
        = оператор присвоения

           Математические операторы:
           +
           -
           /
           *
           % Оператор вычисления остатка от деления  9 % 2

           Операторы сравнения:
           >
           >=
           <
           <=
           ==
           !=

           Логические операторы:
           && оператор И(AND)           true && true && true
           || оператор ИЛИ(OR)           true || true || true
           ! оператор НЕ(NOT)           true OR true OR true
         */


// todo строчный комментарий
        /*



         */

        /*
         *
         *
         *
         */
//        int z, a = 3, b, c = 6;
//        int x = 3;
//        int y = 5;
//        z = x + y - a / 2;
//
//        System.out.println(z);
    }
}
