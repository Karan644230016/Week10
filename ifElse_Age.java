package week10;

import java.util.Scanner;

public class ifElse_Age {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนอายุของท่าน : ");
        int age = kb.nextInt();
        if (age > 0 && age <= 14) {
            System.out.println("วัยเด็ก");
        } else if (age >= 15 && age <= 19) {
            System.out.println("วัยรุ่น");
        } else if (age >= 20 && age <= 29) {
            System.out.println("วัยหนุ่มสาว");
        } else if (age >= 30 && age <= 39) {
            System.out.println("วัยทำงาน");
        } else if (age >= 40 && age <= 59) {
            System.out.println("วัยกลางคน");
        } else {
            System.out.println("วัยชรา");
        }

        System.out.println("End of Program");
        kb.close();
    }
}