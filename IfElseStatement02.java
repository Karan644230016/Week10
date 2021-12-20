package week10;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class IfElseStatement02 {// Start of Class

    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard
        System.out.print("กรุณาป้อนอายุของท่าน : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int age = kb.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร age รับข้อมูลจาก Keyboard
        if ((age >= 1) && (age <= 14)) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("วัยเด็ก");//แสดงผลข้อความ
        } else if ((age >= 15) && (age <= 19)) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("วัยรุ่น");//แสดงผลข้อความ
        } else if ((age >= 20) && (age <= 29)) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("วัยหนุ่มสาว");//แสดงผลข้อความ
        } else if ((age >= 30) && (age <= 39)) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("วัยทํางาน");//แสดงผลข้อความ
        } else if ((age >= 40) && (age <= 59)) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("วัยกลางคน");//แสดงผลข้อความ
        } else if (age >= 60) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("วัยชรา");//แสดงผลข้อความ
        } else {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("ไม่อยู่ในช่วงอายุที่กำหนด");//แสดงผลข้อความ
        }

        kb.close();// ปิดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class