package nestedConditionalEx;
import java.util.Scanner;
public class NestedEx3 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        int degrees = Integer.parseInt(readData.nextLine());
        String time = readData.nextLine();

        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18){
            switch (time) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }
        else if (degrees > 18 && degrees <= 24){
            switch (time){
                case "Morning":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
            }

        }else if( degrees >= 25){
            switch (time){
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Afternoon" :
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;

                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

    }
}
