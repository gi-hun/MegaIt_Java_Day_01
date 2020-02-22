package day_01;

import java.util.Scanner;

class InputEx02 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오:");
		int num1 = sc.nextInt();
		System.out.print("두째 숫자를 입력하시오:");
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println("두 수의 합은"+result);
		
		System.out.print("숫자를 입력하시오:");
		int number = sc.nextInt();
		System.out.print("홀수이면 true: ");
		System.out.println((number%2) !=0);
		
		System.out.print("성적을 입력하시오");
		int grade = sc.nextInt();
		System.out.print("60점 이상이고 100점 이하이면 true: ");
		System.out.println(60<= grade && 100 >= grade);
	}
}
