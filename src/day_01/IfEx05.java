package day_01;

import java.util.Scanner;

class IfEx05 
{
	public static void main(String[] args)
	{
		int dbID = 0;
		int dbPW = 0;
		
		System.out.println("회원 가입을 진행하겠습니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요: ");
		dbID = sc.nextInt();
		System.out.println("비밀번호를 입력해주세요: ");
		dbPW = sc.nextInt();
		
		System.out.println("");
		System.out.println("로그인을 진행하겠습니다.");
		System.out.println("아이디를 입력해주세요: ");
		int ID = sc.nextInt();
		System.out.println("비밀번호를 입력해주세요: ");
		int PW = sc.nextInt();
		
		if((dbID ==ID) && (dbPW ==PW))
			System.out.println("로그인 성공");
		else 
			System.out.println("로그인  실패");
	}
}
