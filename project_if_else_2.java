// 1. นำเข้าสแกนเพื่อรับข้อมูล
import java.util.Scanner;
public class project_if_else_2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        // 2. รับคะแนนสอบรวมและปลายภาค
        String resultScore = "";
        System.out.print("Enter final exam scores. : ");
        int getScoreFinal = inputScanner.nextInt();

        System.out.print("Enter total score. : ");
        int getScoreTotal = inputScanner.nextInt();
        
        // 3. ตรวจสอบเงื่อนไข
        if (getScoreFinal >= 50 && getScoreTotal >= 40) {
            resultScore = "Pass";
        } else if (getScoreFinal >= 50 && getScoreTotal < 40) {
            resultScore = "Failed (because my final exam score was below 40).";
        } else {
            resultScore = "Failed (because the total score is below 50)";
        }

        // 4. แสดงผลการสอบ
        //     === ผลการเรียน ===
        // คะแนนรวม: 65 คะแนน
        // คะแนนสอบปลายภาค: 35 คะแนน
        // ผลการประเมิน: ไม่ผ่าน (สอบปลายภาคต่ำกว่า 40)
        System.out.println("======== Academic Performance ========");
        System.out.printf("Total Score        : %d Point", getScoreTotal);
        System.out.printf("\nFinal Exam Scores  : %d Point", getScoreFinal);
        System.out.printf("\nEvaluation Results : %s Point", resultScore);
    }
}
