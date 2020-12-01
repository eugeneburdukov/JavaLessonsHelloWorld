package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] lessons) {
        /*
        Загадать случайно 100 целых чисел в диапазоне от -100 до 100. Вычислить процент положительных чисел,
        процент отрицательных чисел и процент нулей. Вычислить процент чётных чисел и процент нечётных.
         */

        // Random random1 = new Random();
        // int n;
        //
        // n = random1.nextInt(900) + 100;
        //To get a random number between a set range with min and max:
        //random.nextInt(30 + 10) - 10;
        //// max = 30; min = -10;

        //random.nextInt(100 + 10) - 10;
        //

        Random random = new Random();
        int n = 0;

        for (int i = 0; i < 100000; i++) {
            n = random.nextInt(100 + 100) - 100;
            System.out.println(n + " ");
        }

//        int counterEven = 0;
//        int counterOdd = 0;
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//        Random random = new Random();
//        int n;
//
//        for (int i = 0; i < 100; i++) {
//            n = random.nextInt(100 + 100) - 100;
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
//        System.out.printf("Количество четных = " + counterEven + "\n" +
//                "Количество нечетных " + counterOdd + "\n" +
//                "Количество положительных = " + positive + "\n" +
//                "Количество отрицательных = " + negative + "\n" +
//                "Количество нулей = " + zero);

        /*
        Вывести на экран таблицу умножения (таблицу Пифагора).
         */

//        for (int i = 1; i < 10; i++) {
//            System.out.print(i + " ");
//            for (int j = 1; j < 10; j++) {
//                System.out.print(i * j + " ");
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
