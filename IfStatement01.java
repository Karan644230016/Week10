package week10;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)


public class IfStatement01 {// Start of Class
    public static void main(String[] args) {// Start of method
        // Good morning 6 - 11
        // Good Afternoon 12 - 16
        // Good Evening 17 - 20
        // Godd Night 21 - 24

        // รับช่วงเวลาเข้ามา
        Scanner sc = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard

        System.out.print("Enter Time : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int time = sc.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร time รับข้อมูลจาก Keyboard

        String result = "";// ประกาศชนิดข้อมูล String ผลลัพธ์
        if (time <= 11) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            result = "Good Morning";//แสดงผลข้อความ
        } else if (time <= 16) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            result = "Good Afternoon";//แสดงผลข้อความ
        } else if (time <= 20) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            result = "Good Evening";//แสดงผลข้อความ
        } else {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            result = "Good Night";//แสดงผลข้อความ
        }
        System.out.println(result);//แสดงผลลัพธ์

        // การเขียนโปรแกรมแบบพื้นฐาน โดยใช้ println
        // if (time <= 11) {
        // System.out.println("Good Morning");
        // } else if (time <= 16) {
        // System.out.println("Good Afternoon");
        // } else if (time <= 20) {
        // System.out.println("Good Evening");
        // } else {
        // System.out.println("Good Night");
        // }
        sc.close();// ปิดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class