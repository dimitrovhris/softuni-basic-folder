package loops;
import java.util.Scanner;
public class Loop6 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        String text = readData.nextLine();
        int points = 0;

        for (int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            switch (letter){
                case 'a':
                    points = points + 1;
                    break;
                case 'e':
                    points = points + 2;
                    break;
                case 'i':
                    points = points + 3;
                    break;
                case 'o':
                    points = points + 4;
                    break;
                case 'u':
                    points = points + 5;
                    break;
            }
        }
        System.out.println(points);

    }
}
