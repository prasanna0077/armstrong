import java.util.*;
import java.util.Scanner;
class hello
{
	public static void main(String[] args)
	{
		// Instantiate a Date object
	       	Date date = new Date();

	       	// display time and date using toString()
	       	System.out.println(date.toString());
		
		System.out.println("***********************");
		System.out.println("Hello Dev Ops Learners");
		System.out.println("Hello Simplilearn Users");
		System.out.println("***********************");

		int num, number, temp, total = 0;
		System.out.println("Ënter 3 Digit Number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		number = num;

		for( ;number!=0;number /= 10)
		{
		    temp = number % 10;
		    total = total + temp*temp*temp;
		}

		if(total == num)
		    System.out.println(num + " is an Armstrong number");
		else
		    System.out.println(num + " is not an Armstrong number");
	}
}
