package day_01;

import java.util.Scanner;

class IfEx05 
{
	public static void main(String[] args)
	{
		int dbID = 0;
		int dbPW = 0;
		
		System.out.println("ȸ�� ������ �����ϰڽ��ϴ�.");
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է����ּ���: ");
		dbID = sc.nextInt();
		System.out.println("��й�ȣ�� �Է����ּ���: ");
		dbPW = sc.nextInt();
		
		System.out.println("");
		System.out.println("�α����� �����ϰڽ��ϴ�.");
		System.out.println("���̵� �Է����ּ���: ");
		int ID = sc.nextInt();
		System.out.println("��й�ȣ�� �Է����ּ���: ");
		int PW = sc.nextInt();
		
		if((dbID ==ID) && (dbPW ==PW))
			System.out.println("�α��� ����");
		else 
			System.out.println("�α���  ����");
	}
}
