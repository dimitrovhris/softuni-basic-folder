package simpleCalculations;

import java.util.Scanner;

public class Simple3 {

	public static void main(String[] args) {
		
		Scanner readSide = new Scanner (System.in);
		int a = Integer.parseInt(readSide.nextLine());
		int b = Integer.parseInt(readSide.nextLine());
		int area = a * b;
		
		System.out.println(area);

	}

}
