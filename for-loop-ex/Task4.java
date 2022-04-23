package loopsEx;
import java.util.Scanner;
public class MoreLoops8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int age = Integer.parseInt(sc.nextLine());
        double washingPrice = Double.parseDouble(sc.nextLine());
        double toyPrice = Double.parseDouble(sc.nextLine());
        int toys = 0;
        double plusMoney = 0;
        double totalMoneySum = 0;
        for(int i = 1; i <= age; i++){
            if(i % 2 == 1){
                toys++;
            }
            else{
                plusMoney += 10;
                totalMoneySum += plusMoney - 1;
            }
        }
        double totalToysSum = toys * toyPrice;
        double totalPrice = totalMoneySum + totalToysSum;
        double moreLess = Math.abs(totalPrice - washingPrice);
        if(totalPrice >= washingPrice){
            System.out.printf("Yes! %.2f", moreLess);
        }
        else{
            System.out.printf("No! %.2f", moreLess);
        }
    }
}
