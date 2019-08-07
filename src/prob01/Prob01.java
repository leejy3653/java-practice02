package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print( "금액: " );
		int money = scanner.nextInt();
		int[] coinUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		System.out.println("금액 : " + money);
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원 : "+ money / coinUnit[i]+"개");
			money%= coinUnit[i];
			scanner.close();
 	}
}
}