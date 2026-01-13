import java.util.Scanner;

public class welcome {
    public static void main(String[] args) {
        /*
        📋 โจทย์ที่ 1: ระบบคิดส่วนลดร้านค้า

        🎯 รายละเอียดโจทย์:
        ร้านค้าแห่งหนึ่งมีระบบส่วนลดดังนี้:


        ซื้อ 500 บาทขึ้นไป: ลด 5%
        ซื้อ 1,000 บาทขึ้นไป: ลด 10%
        ซื้อ 2,000 บาทขึ้นไป: ลด 15%


        💡 ตัวอย่างผลลัพธ์:
        === ระบบคิดส่วนลด ===
        ยอดซื้อ: 1200 บาท
        ส่วนลด: 10% = 120 บาท
        ราคาหลังหักส่วนลด: 1080 บาท
        */
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