package week10;// Start of package

public class PositiveNumber {// Start of Class
    public static void main(String[] args) {// Start of method
        int number = 5;// ประกาศชนิดข้อมูล int ตัวแปร number มีคา่เท่ากับ 5
        String result = "";// ประกาศชนิดข้อมูล Strig ผลลัพธ์

        if (number > 0) {// ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if
            // ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ แต่ถ้ามีต่อจะต้องมี if
            // ต่อท้าย else
            result = number + " เป็นจำนวนเต็มบวก";// ค่าของ result
        } else if (number < 0) {// ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if
            // ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ แต่ถ้ามีต่อจะต้องมี if
            // ต่อท้าย else
            result = number + " เป็นจำนวนเต็มลบ";// ค่าของ result
        } else {// ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if
                // ไป else if เรื่อยๆ ถ้าถึง else สุดท้ายจะไม่มี if ต่อ แต่ถ้ามีต่อจะต้องมี if
                // ต่อท้าย else
            result = number + " เป็นจำนวนเต็มศูนย์";// ค่าของ resultม
        }
        System.out.println(result);// แสดงผลลัพธ์

        // if (number > 0) {
        // System.out.println("เป็นจำนวนเต็มบวก");
        // }
        // กรณีตรวจสอบจำนวนเต็มลบ
        // if (number < 0) {
        // System.out.println("เป็นจำนวนเต็มลบ");
        // }
        //// กรณีตรวจสอบจำนวนเต็มศูนย์
        // if (number == 0) {
        // System.out.println("เป็นจำนวนเต็มศูนย์");
        // }
    } // End of main
} // End of class
