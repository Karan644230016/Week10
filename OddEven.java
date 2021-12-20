package week10;// Start of package
import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)
public class OddEven {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner sc = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard
        System.out.println("Enter number : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int number = sc.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร number รับข้อมูลจาก Keyboard
        if (number%2==1){//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if ไป else
            System.out.println("This number is Odd Number");//แสดงผลข้อความ
        }else{
            System.out.println("This number is Even Number");//แสดงผลข้อความ
        }
        sc.close();// ปิดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class