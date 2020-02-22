package day_01;

import java.util.Scanner;

class IfEx03 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int com = 1;
		
		System.out.println("숫자를 입력하시오: ");
		int me = sc.nextInt();
		
		if(me<0 || me>2)
		{
			System.out.println("다시 입력하시오");
			return;
		}
		
		
		if(com == me)
			System.out.println("same");
		else if(com > me)
			System.out.println("com is win");
		else
			System.out.println("me is win");
	}
}
