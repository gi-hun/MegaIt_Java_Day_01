package day_01;

import java.util.Scanner;

class IfEx04 
{
	public static void main(String[] args)
	{
		int dbID = 1234;
		int dbPW = 1111;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("���̵� �Է��Ͻÿ�:");
		int ID = sc.nextInt();
		System.out.print("�н����带 �Է��Ͻÿ�:");
		int PW = sc.nextInt();
		
		if((ID == dbID) && (PW == dbPW))
			System.out.println("�α��� ����");
		else
			System.out.println("�α��� ����");
	}
}
