package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] lessons) {
        /*
        Создайте программу, выводящую на экран
        все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ...
         */


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
//
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
//                System.out.println("Cумма двух чисел = " + (n + n1));
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
