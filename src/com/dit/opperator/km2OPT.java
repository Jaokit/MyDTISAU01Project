package com.dit.opperator;

import java.util.Scanner;

public class km2OPT {
    public static void main(String[] args) {
        //Ternary Opt. __?__:__
        //เงื่อนไขที่ต้องพิสูจน์ ? ทำเมื่อเป็นจริง : ทำเมื่อเป็นเท็จ
        
        int score;
        Scanner sc = new Scanner(System.in);
        String result;
        
        System.out.println("--------------------------------");
        System.out.println("Program Chect Result Score");
        System.out.println("--------------------------------");
        System.out.println("Input your score : ");
        score = sc.nextInt();
        System.out.println("--------------------------------");
        result = score >= 50 ? "Pass..." : "Not Pass...";
        System.out.println("Result is " + result);
    }
}
