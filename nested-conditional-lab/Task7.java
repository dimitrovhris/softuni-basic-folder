package nestedConditional;
import java.util.Scanner;

public class NestedHi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        String day = sc.nextLine();
        if ("Sunday".equals(day)) {
            System.out.println("closed");
        } else {
            if (hour >= 10 && hour <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        }

    }
}
