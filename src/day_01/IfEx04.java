package day_01;

import java.util.Scanner;

class IfEx04 
{
	public static void main(String[] args)
	{
		int dbID = 1234;
		int dbPW = 1111;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("아이디를 입력하시오:");
		int ID = sc.nextInt();
		System.out.print("패스워드를 입력하시오:");
		int PW = sc.nextInt();
		
		if((ID == dbID) && (PW == dbPW))
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
	}
}
