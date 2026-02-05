// 1. นำเข้า random และสร้าง og ของ random
import java.util.Random;

// 2. น้ำเข้า Scanner และสร้าง og ของ Scanner
import java.util.Scanner;

public class rock_paper_scissors_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] e = {"🪨","✂️", "📃"};

        // 3. สร้างตัวแปร randomBot สำหรับสุ่ม
        int randomBot = random.nextInt(3);

        // 4. สร้างตัวแปร userInput สำหรับรับค่า
        System.out.print("ป้อน 0 คือค้อน, 1 คือกรรไกร, 2 คือกระดาษ : ");
        int userInput = scanner.nextInt();
        try {
            System.out.printf("ผู้ใช้เลือก       -> %s",e[userInput]);
            System.out.printf("\nคอมพิวเตอร์เลือก -> %s\n",e[randomBot]);
        } catch (ArrayIndexOutOfBoundsException err) {
            // TODO: handle exception
            System.out.println("ตัวเลือกไม่ถูกต้อง โปรดลองอีกครั้ง");
        } finally {
            // 5. ตรวจสอบเงิ่อนไข
            if (userInput >= 3 || userInput <= -1) {
                
            } else {
                if ((userInput == 0 && randomBot == 2) || (userInput == 1 && randomBot == 0) || (userInput == 2 && randomBot == 1)) {
                    System.out.println("คอมพิวเตอร์ชนะ");
                }
                else if ((userInput == 0 && randomBot == 0) || (userInput == 1 && randomBot == 1) || (userInput == 2 && randomBot == 2)) {
                    System.out.println("เสมอกัน");
                }
                else {
                    System.out.println("คุณชนะ");
                }
            }

        }
        
        


        
        // 6. แสดงผลลัพธ์ชนะหรือแพ้
    }
}
