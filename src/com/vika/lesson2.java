package com.vika;

public class lesson2 {

    public static void main(String[] args) {

//        Объявить переменные типа int a, b, c в 3 строки

        int a;
        int b;
        int c;

//        Объявить переменные типа char a, b, c в одну строку

            char a1, b1, c1;


//        Создать и инициализировать переменные a, b, c со значениями "a"; 25.5; false

        char a2 = 'a';
        double b2 = 25.5;
        boolean c2 = false;

//        Создать и инициализировать переменные d, e, f со значениями 1; 2; 3. Присвоить значение a для b, b для с и вывести результат в консоль

        int d = 1;
        int e = 2;
        int f = 3;

        d = e;
        e = f;
        System.out.println(d);

//        Исправить код ниже, чтобы в консоль выводилось "d = 5":

        int name1 = 10;
        int name2 = 20;
        int name3= 30;
        int d2 = (name2 + name3) / name1;
        System.out.println("d = " + d2);

/*       Исправить код ниже, чтобы в консоль выводилось "c = 100":
        System.out.println("c = " + c);
        int a = 10;
        int b = 50;
        int c = 100; */

        int a3 = 10;
        int b3 = 50;
        int c3 = 100;
        System.out.println("c3 = " + c3);

  /*      Исправить код ниже, чтобы в консоль выводилось "x = 3":
        int x;
        x = 6;
        {
            int y = 3;
        }
        x = y;
        System.out.println("x = " + 3);*/

        int x;
        x = 6;
        int y = 3;
        x = y;
        System.out.println("x = " + x);

//        Реализовать предложение “I have $100! But it’s not true” в виде переменных, используя оптимальные типы данных и вывести полное предложение в консоль.

        String sentence = "I have";
        char dollar = '$';
        int sum = 100;
        char numeric = '!';
        String sentence1 = "But it is not true";

        System.out.println(sentence + " " + dollar+ " " + sum + " " + numeric + " " + sentence1 );

//        Закомментировать одну строчку, чтобы предложение выводимое в консоль имело смысл для суеверного человека :)
//        Дима я не совсем понимаю условие- что закомментировать,если в консоль будет выводиться переменная "с"

        int a4 = 1;
        int b4 = 2;
        int c4 = 3;
        a = a4 * b4 + c4;
        b = b4 * c4 + a4;
        c = a4 * c4 - b4;
        System.out.println("Я не люблю это число " + c);

//My homework from lesson1
        System.out.println("\"Я люблю\" ох как же я люблю эти \"! \"");

        /*10. Имеются переменные:
        int a = 5;
        int b = 10;
        Поменять местами значения переменных, при этом, не используя новой переменной и не присваивая значения напрямую.*/

        int a5 = 132;
        int b5 = 256;

        b5 = a5+b5; //5+10=15
        a5 = b5 - a5; // 15-5=10
        b5 = b5 - a5 ;// 15-10=5

        System.out.println(a5 + " " + b5);


    }

}
