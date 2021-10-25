package unit_testing;

import java.util.Scanner;

public class MonthlyPayment {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter Principal amount");
		double principal = value.nextDouble();
		System.out.println("Enter Rate if Interest");
		double rate = value.nextDouble();
		System.out.println("Enter Time period in years");
		int time = value.nextInt();
		double p = (principal * rate) / (1 - Math.pow(1 + rate, -time));
		System.out.println("payment : "+p);
  }
}
