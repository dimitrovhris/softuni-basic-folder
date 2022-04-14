package conditionalStatementsEx;
import java.util.Scanner;
public class ConditionalEx7 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        double record = Double.parseDouble(readData.nextLine());
        double meters = Double.parseDouble(readData.nextLine());
        double metersInSecond = Double.parseDouble(readData.nextLine());

        double seconds = meters * metersInSecond;
        double delays = Math.floor(meters / 15);
        double secondsDelay = delays * 12.5;

        double totalTime = seconds + secondsDelay;

        if (totalTime >= record){
            double slowerSeconds = totalTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", slowerSeconds);
        }
        else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }
    }
}
