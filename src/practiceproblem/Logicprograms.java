package practiceproblem;
import java.util.Scanner;
public class Logicprograms {
	public static void main(String[] args) {
	Logicprograms rv1 = new Logicprograms();
	//rv1.fibonacci();
	//rv1.perfectnumber();
	//rv1.primenumber();	
	rv1.reverse();
	}
 void fibonacci() {
	 int number_one,number_two,number_three,num = 5;
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
 void perfectnumber() {
	 int i,number,sum=0;
	 Scanner rv = new Scanner(System.in);
	 System.out.println("Enter the value of number");
	 number = rv.nextInt();
	 for(i=1;i<number;i++) {
		 if (number%i == 0) {
			 sum=sum+i;
 }
}
	 if (sum == number) {
		System.out.println("perfect number"); 
	 }
	 else {
		 System.out.println("It's not a perfect number"); 
	 }
	 
 }
 void primenumber() {
	 int is_flag = 0;
	 int value = 0;
	 Scanner rv = new Scanner(System.in);
	 System.out.println("Enter the value of number");
	 int number = rv.nextInt();
	 for (int i=2; i<=number/2; i++) {
	 value=(number%i);
		   if (value == 0) {
			   is_flag = 1;
		   System.out.println("It is not a prime number");
		   break;
		   }   
    }
	 if (is_flag == 0) {
	System.out.println("It is a prime number");
	 }
 }
 void reverse() {
	 {  
		 int number = 97531, reverse = 0;  
		 while(number != 0)   
		 {  
		 int remainder = number % 10;  
		 reverse = reverse * 10 + remainder;  
		 number = number/10;  
		 }  
		 System.out.println("The reverse of the given number is: " + reverse);
   }
  }
}
