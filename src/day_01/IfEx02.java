package day_01;

import java.util.Scanner;

class IfEx02 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int com = 8;
		System.out.print("숫자를 입력하시오:");
		int me = sc.nextInt();
		
		if(me < com)
			System.out.println("Up!");
		else if(me == com)
			System.out.println("Bingo");
		else
			System.out.println("Down");
			
	}
}
