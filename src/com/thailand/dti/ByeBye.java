package com.thailand.dti;

import java.util.Scanner;

public class ByeBye {

    public static void main(String[] args) {

        //สร้างตัวแปร variable => ชนิดข้อมูล ชื่อตัวแปร; *สร้างก่อนทำงาน ตรงไหนก็ได้
        String yourName;
        //เลขจำนวนเต็ม มี byt short int long
        int yourAge;
        //เลขจำนวนจริง float duble
        double yourSalary;

        //input โดยใช้ Scanner จะสร้างตัวแทนของคลาส Scanner ขึ้นมา
        //เรียกว่า Object หรือ Instance of Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        yourName = sc.next();
        System.out.print("Enter your age : ");
        yourAge = sc.nextInt();
        System.out.print("Enter your salary : ");
        yourSalary = sc.nextDouble();
        System.out.println("---------------------------------------------");
        System.out.println("Hi " + yourName);
        System.out.println("Your are " + yourAge + " pee");
        System.out.println("Your salary is " + yourSalary + " bath");
    }

}
