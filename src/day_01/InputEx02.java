package day_01;

import java.util.Scanner;

class InputEx02 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�:");
		int num1 = sc.nextInt();
		System.out.print("��° ���ڸ� �Է��Ͻÿ�:");
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println("�� ���� ����"+result);
		
		System.out.print("���ڸ� �Է��Ͻÿ�:");
		int number = sc.nextInt();
		System.out.print("Ȧ���̸� true: ");
		System.out.println((number%2) !=0);
		
		System.out.print("������ �Է��Ͻÿ�");
		int grade = sc.nextInt();
		System.out.print("60�� �̻��̰� 100�� �����̸� true: ");
		System.out.println(60<= grade && 100 >= grade);
	}
}
