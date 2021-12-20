package week10;
import java.util.Scanner;
public class IfElse_Compare2Number {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner (System.in);
        System.out.print("  ป้อนตัวเลขช่องที่ 1 = ");
        int number1 = kb.nextInt();
        //java.util.Scanner kb = new Scanner (System.in);
        System.out.print("  ป้อนตัวเลขช่องที่ 2 = ");
        int number2 = kb.nextInt();
        //int number1 = 2;
        //int number2 = 5;
        String result = "";
        if (number1 > number2) {
            result = number1 + " มากกว่า " + number2;
        } else if (number1 < number2) {
            result = number1 + " น้อยกว่า " + number2;
        } else {
            result = number1 + " เท่ากับ " + number2;
        }
        System.out.println(result);
    }

}
