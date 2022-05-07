package nestedLoopsEx;

import java.util.Scanner;

public class MoreNestedLoopEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int maxPasswords = Integer.parseInt(sc.nextLine());
        int counter = 1;
        int A = 35;
        int B = 64;

        int x = 1;
        int y = 0;
        boolean flag = false;
        while (counter <= maxPasswords && (x <= a || y <= b)){
            for(x = 1; x <= a; x++){
                for(y = 1; y <= b; y++){
            System.out.printf("%c%c%d%d%c%c|", A,B,x,y,B,A);
                    counter++;
                    if(counter > maxPasswords){
                        flag = true;
                        break;
                    }
            A++;
            B++;
            if(A > 55){
                A = 35;
            }
            if(B > 96){
                B = 64;
            }
                }
                if(flag){
                    break;
                }
            }
        }
    }
}
