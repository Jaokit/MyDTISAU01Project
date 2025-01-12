package com.thailand.dti;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WowWow {

    public static void main(String[] args) throws IOException {

        //สร้างตัวแปร variable => ชนิดข้อมูล ชื่อตัวแปร; *สร้างก่อนทำงาน ตรงไหนก็ได้
        String yourName;
        //เลขจำนวนเต็ม มี byt short int long
        int yourAge;
        //เลขจำนวนจริง float duble
        double yourSalary;

        //input โดยใช้ InputStreamReader & BufferedReader 
        //จะสร้างตัวแทนของคลาส InputStreamReader & BufferedReader ขึ้นมา
        //เรียกว่า Object หรือ Instance of Class
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.print("Enter your name : ");
        yourName = reader.readLine();
        System.out.print("Enter your age : ");
        yourAge = Integer.parseInt(reader.readLine());
        System.out.print("Enter your salary : ");
        yourSalary = Double.parseDouble(reader.readLine());
        System.out.println("---------------------------------------------");
        System.out.println("Hi " + yourName);
        System.out.println("Your are " + yourAge + " pee");
        System.out.println("Your salary is " + yourSalary + " bath");
    }

}
