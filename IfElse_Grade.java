package week10;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class IfElse_Grade {// Start of Class
    public static void main(String[] arg) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard
        System.out.print("Enter your score : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int score = kb.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร score รับข้อมูลจาก Keyboard
        String result = "";// ประกาศชนิดข้อมูล String ผลลัพธ์
        if ((score < 0) || (score > 100)) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            result = "Error!!";//แสดงผลข้อความ
        } else if (score >= 80) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            result = "A";//แสดงผลข้อความ
        } else if (score >= 70) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            result = "B";//แสดงผลข้อความ
        } else if (score >= 60) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            result = "C";//แสดงผลข้อความ
        } else if (score >= 50) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            result = "D";//แสดงผลข้อความ
        } else {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            result = "E";//แสดงผลข้อความ
        }
        if (result == "Error!!") {//ถ้าผลลัพธ์ที่ได้ตรงกับ Error!! จะแสดงผลด้านล่าง 
            System.out.println(result + " please enter new score");//แสดงผลข้อความ
        } else {//ถ้าไม่ตรงกับเงื่อนไขด้านบนมาลงมายัง else
            System.out.println("You got : " + result);//แสดงผลข้อความ
            kb.close();// ปิดรับเข้าข้อมูลจาก Keyboard
        }
        
    } // End of main
} // End of class