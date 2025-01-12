package com.dit.opperator;

public class km1OPT {

    //Operator ตัวดำเนินการ 
    public static void main(String[] args) {
        //Arithematic Otp + - * / %
        System.out.println(10 + 7);
        System.out.println(10 - 7);
        System.out.println(10 * 7);
        System.out.println(10 / 7);
        System.out.println(10.0 / 7);
        System.out.println(10 / 7.0);
        System.out.println(10 % 7); //หารเอาเศษ

        //Comparation == != < <= > >=
        //เปรียบเทียบได้แต่ num หรือ char
        System.out.println(10 > 7);
        System.out.println(10 < 7);
        System.out.println(10 == 7);
        System.out.println(10 != 7);

        //System.out.println("Mod" > "Mee"); ตรงนี้ Error
        System.out.println('A' > 'c');

        //Logical !(not) &&(and) ||(or)
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
    }
}
