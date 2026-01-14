import java.util.Scanner;

public class project_if_else_1 {
    public static void main(String[] args) {
        // 📋 โจทย์ที่ 1: ระบบคิดส่วนลดร้านค้า

       Scanner input = new Scanner(System.in);

       System.out.print("Enter purchase amount : ");
       double getPurchaseAmount = input.nextDouble();
       double discountAmount = 0;
       double result = 0;
       double discount = 0;

       if (getPurchaseAmount >= 2_000) {
            discount = 15;
            discountAmount = getPurchaseAmount * (discount/100);
            result = getPurchaseAmount - discountAmount;

        } else if (getPurchaseAmount >= 1_000) {
            discount = 10;
            discountAmount = getPurchaseAmount * (discount/100);
            result = getPurchaseAmount - discountAmount;

        } else if (getPurchaseAmount >= 500) {
            discount = 5;
            discountAmount = getPurchaseAmount * (discount/100);
            result = getPurchaseAmount - discountAmount;
           
        } else {
            discount = 0;
            result = getPurchaseAmount;
       }

       System.out.printf("\nPurchase amount      : %.0f baht", getPurchaseAmount);
       System.out.printf("\ndiscount             : %.0f%% = %.0f baht", discount, discountAmount);
       System.out.printf("\nPrice after discount : %.0f baht", result);

       input.close();

    }
}