package nestedLoopsEx;

import java.util.Scanner;

public class MoreNestedLoopEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        int passwords = 0;
        int newPassword = 0;
        for(int a = 1; a <= 9; a++){
            for(int b = 1; b <= 9; b++){
                for(int c = 1; c <= 9; c++){
                    for(int d = 1; d <= 9; d++){
                        if(a < b && c > d && m == (a * b + c * d)){
                            System.out.printf("%d%d%d%d ", a,b,c,d);
                            passwords++;
                            if(passwords == 4){
                                newPassword = 1000 * a + 100 * b + 10 * c + d;
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if(passwords >= 4){

            System.out.printf("Password: %d", newPassword);
        }
        else{
            System.out.println("No!");
        }
    }
}
