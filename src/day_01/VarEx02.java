package day_01;

class VarEx02 
{
	public static void main(String[] arg)
	{
		//��) ������ 1000���ִ�. 200��¥�� ���� ���� ��, �ܵ� ���
		int cash = 1000;
		int snack = 200;
		int result = cash - snack;
		
		System.out.println("�ܵ�: "  + result);		
		//����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
		int sale_month = 100;
		double sale_year = 100*12*0.9;
		System.out.println("����: " + sale_year);
		//����2) ���������� 30, 50, 4�� �� �޾Ҵ�. �����?
		int grade_a =30, grade_b = 50, grade_c =4;
		int grade_result = (grade_a+grade_b+grade_c)/3;
		System.out.println("���� ���� ���: " + grade_result);
		//����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
		int height = 3;
		int bottom = 6;
		int tri_result = 3*6/2;
		System.out.println("�ﰢ�� ����: " + tri_result);
		//����4) 100�ʸ� 1�� 40�ʷ� ���
		int time = 100;
		int min = 100/60;
		int sec = 100%60;
		System.out.println("100�ʴ� " + min + "��" + sec + "�� �̴�.");
		//����5) 800������ 500��¥�� ���� , 100��¥�� ����
		int sum = 800;
		int num1 = 500;
		int num2 = 100;
		System.out.println("800���� 500�� " + sum/num1+ "�� 100��"+ (sum-num1)/num2 + "�� �̴�");
		//����5) 500��(1��), 100��(3��)  
	}
}
