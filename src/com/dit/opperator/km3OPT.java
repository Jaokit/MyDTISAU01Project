package com.dit.opperator;

public class km3OPT {

    public static void main(String[] args) {
        //Increment/Decrement Opt. => ++ เพิ่มทีละ 1 -- ลดทีละ 1
        int x = 10;
        int y;

        System.out.println(x);
        x++; //x = x+1;
        System.out.println(x);
        ++x;
        System.out.println(x);
        x--; //x = x-1
        System.out.println(x);
        --x;
        System.out.println("---------------------------------");
        y = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println("---------------------------------");
        y = x++;
        System.out.println(x);
        System.out.println(y);

        //Assignment Opt. => = += -= *= /= %=
        int num = 20;
        //num = num + 50;
        num += 50;
        num *= 2;
        num = num + 5 / 9 * x - y;
        num += 5 / 9 * x - y;
        System.out.println(num);
    }
}
