package day6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int number = scanner.nextInt();
		int number1=0, number2 =0;
		
		while(number>0)
		{
			number1 = number % 10;
			number2 = number2*10 + number1;
			number = number / 10;
		}
		System.out.println("The reversed number is: "+number2);

	}

}
