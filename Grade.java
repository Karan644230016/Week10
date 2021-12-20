package week10;// Start of package
import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)
public class Grade {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard

        System.out.print("Enter Your Score : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        byte score = kb.nextByte();// ประกาศชนิดข้อมูล byte ตัวแปร score รับข้อมูลจากKeyboard
        if (score > 100 || score < 0) {  //ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("Out of range");//แสดงผลข้อความ
        } else if (score >= 80) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("Yore Grade is A");//แสดงผลข้อความ
        } else if (score >= 70) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("Yore Grade is B");//แสดงผลข้อความ
        } else if (score >= 60) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("Yore Grade is C");//แสดงผลข้อความ
        } else if (score >= 50) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("Yore Grade is D");//แสดงผลข้อความ
        } else {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if 
            //ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ  แต่ถ้ามีต่อจะต้องมี if ต่อท้าย else
            System.out.println("Yore Grade is E");//แสดงผลข้อความ
        }
        kb.close();// ปิดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class