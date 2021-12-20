package week10;

import java.util.Scanner;

public class IfElseStatement03 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนอายุของท่าน : ");
        int age = kb.nextInt();
        if (age >= 60) {
            System.out.println("วัยชรา");
        } else if (age >= 40)  {
            System.out.println("วัยกลางคน");
        } else if (age >= 30)  {
            System.out.println("วัยทํางาน");
        } else if (age >= 20) {
            System.out.println("วัยหนุ่มสาว");
        } else if (age >= 15)  {
            System.out.println("วัยรุ่น");
        } else if (age >= 1) {
            System.out.println("วัยเด็ก");
        } else {
            System.out.println("ไม่อยู่ในช่วงอายุที่กำหนด");
        }

        kb.close();
    }
}