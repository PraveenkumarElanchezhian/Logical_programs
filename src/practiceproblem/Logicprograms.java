package practiceproblem;
import java.util.Scanner;
public class Logicprograms {
	public static void main(String[] args) {
	Logicprograms rv1 = new Logicprograms();
	rv1.fibonacci();
	}
 void fibonacci() {
	 int number_one;
	 int number_two;
	 int number_three;
	 int num = 5;
	 Scanner rv = new Scanner(System.in);
	 System.out.println("Enter the value of number_one and number_two");
	 number_one = rv.nextInt();
	 number_two = rv.nextInt();
	 for (int i=0;i<=num;i++) {
		 number_three = number_one + number_two;
		 number_one = number_two;
		 number_two	= number_three;
		 System.out.println(number_three);
   }
	 
 }
}
