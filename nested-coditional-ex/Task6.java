package nestedConditionalEx;
2
​
3
import java.util.Scanner;
4
​
5
public class NestedEx7 {
6
    public static void main(String[] args) {
7
        Scanner readData = new Scanner(System.in);
8
​
9
        int number1 = Integer.parseInt(readData.nextLine());
10
        int number2 = Integer.parseInt(readData.nextLine());
11
        String symbol = readData.nextLine();
12
​
13
        double result = 0;
14
        String evenOdd = "";
15
        boolean canDivide = true;
16
​
17
        switch (symbol) {
18
            case "+":
19
                result = number1 + number2;
20
                break;
21
            case "-":
22
                result = number1 - number2;
23
                break;
24
            case "*":
25
                result = number1 * number2;
26
                break;
27
            case "/":
28
            case "%":
29
                canDivide = (number2 != 0);
30
                if (canDivide) {
31
                    switch (symbol) {
32
                        case "/":
33
                            result = 1.0 * number1 / number2;
34
​
35
                            System.out.printf("%d %s %d = %.2f", number1, symbol, number2, result);
36
