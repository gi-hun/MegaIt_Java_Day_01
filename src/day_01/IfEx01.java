package day_01;
class IfEx01 
{
	public static void main(String[] args)
	{
		
		if(true)
			System.out.println("���� o");
		else
			System.out.println("���� x");
		
		int num = 8;
		System.out.println(num%2 ==0);
		System.out.println(num%2 !=0);
		
		if(num%2 == 0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		
		num = -10;
		
		if(num >0)
			System.out.println("���");
		else if(num == 0)
			System.out.println("0");
		else
			System.out.println("����");
		
		num = 12;
		
		if(num %4 == 0)
			System.out.println("4�� ����̴�");
		else
			System.out.println("4�� ����� �ƴϴ�");
		
		int score = 87;
		
		if(score >=80)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
		
	}
}
