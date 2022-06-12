package org.example;

public class Main {
    public static void main(String[] args) {

        //byte
        byte a = 1;
        byte b = 127;
     //   byte c = -129; // переполнение
     //   byte d = 128; // переполнение
        System.out.println(b);

        //short
        short e = 32767;
     //   short f = 32768; // переполнение

        //char
     //   char h = -1; //выход за границы
        char ch = 0;
        char j = 'm';
        char k = '\u00a9';
        System.out.println(k);

        //int
       //int maxValue = Integer.MAX_VALUE;
        //System.out.println(maxValue);
        int l = 2147483647;
       // int m = 2147483648; // переполнение

        //long
        long n = 214748364800000000L;
        System.out.println(l + n);

        //float
        float fl = 1F;
        System.out.println(fl);

        float five = 5F;
        float three = 3F;
        System.out.println("floats 5/3 = " + five / three);

        double fiveDouble = 5;
        double threeDouble = 3;
        System.out.println("doubles 5/3 = " + fiveDouble / threeDouble);

        //boolean
        boolean boolT = true;
        boolean boolF = false;
        boolean ff = 5==5;
        System.out.println(ff);

        int intA = 7;
        double doubleA = 0.1;
        System.out.println("result int*double = " + intA * doubleA);

        int x = 7;
        int v = 2;
        int cxv = x + v;
        int cx = x - v;
        System.out.println(cxv);
        System.out.println(cx);
        System.out.println(x > v);
        System.out.println(x < v);
        System.out.println(x == v);
        System.out.println(x != v);
        System.out.println((x > v) && (1 > 0));

    }
}