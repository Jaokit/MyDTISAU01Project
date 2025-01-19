package com.sau.workshop;

//ทำโปรแกรมคำนวณหาค่า BMI โดยรับค่า ชื่อ น้ำหนัก *กก. ส่วนสูง /ม. ทางแป้น แล้วแสดงเป็นค่า BMI
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.*;
import java.text.DecimalFormat;
//BMI = น้ำหนัก/ส่วนสูงกำลัง2

public class BMIProject {

    public static void main(String[] args) throws IOException {

        //InputStreamReader input = new InputStreamReader(System.in);
        //BufferedReader reader = new BufferedReader(input);
        String yourName;
        double yourWeight, yourHeight, yourBMI;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.0000");

        System.out.println("----------------------------------------");
        System.out.println("          BMI Program by KIT");
        System.out.println("----------------------------------------");
        System.out.print("Input your name : ");
        yourName = reader.readLine();
        System.out.print("Input your Weight(kg) : ");
        yourWeight = Double.parseDouble(reader.readLine());
        System.out.print("Input your Height(m) : ");
        yourHeight = Double.parseDouble(reader.readLine());
        System.out.println("----------------------------------------");
        //yourBMI = yourWeight/(yourHeight*yourHeight);
        yourBMI = yourWeight/Math.pow(yourHeight, 2);
        System.out.println("    Your BMI is --> " + df.format(yourBMI) );
        System.out.println("----------------------------------------");
        
    }

}
