package day_01;

import java.util.Scanner;

class InputEx01 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		System.out.println("입력하신 숫자는 " + num + "입니다.");

		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.println("입력하신 숫자는 " + age + "입니다.");
	}
}
