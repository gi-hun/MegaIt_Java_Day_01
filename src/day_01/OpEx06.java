package day_01;

class OpEx06 
{
	public static void main(String[] args)
	{
		int score = 30;
		System.out.println(score >= 60);
		
		 //����1) 3�� ����̸� true ���
        //��Ʈ1) ���� % 3 == 0 (3�� ���)
		int num = 34;
        System.out.println((num%3) == 0 );
        
        //����2) ¦���̸� true ���
        //��Ʈ2) ���� % 2 == 0 (¦��)
        //��Ʈ2) ���� % 2 == 1 (Ȧ��)
        System.out.println((num%2) ==0);
        
        //����3)�Ʒ����� 1000��¥�� �̻�ȭ�� ������
        //1000��¥���� 3�� �̻��̸� true ���
        
        int money = 1786000; 
        int spare_money = money%5000/1000;     //õ�� ���� ū �� 5000��, 5000���� �ּ� ���� ȭ��(�� ū �� ����)�� ������
        System.out.println(spare_money/3 >= 3);
                
	}
}