package day_01;

class OpEx06 
{
	public static void main(String[] args)
	{
		int score = 30;
		System.out.println(score >= 60);
		
		 //문제1) 3의 배수이면 true 출력
        //힌트1) 숫자 % 3 == 0 (3의 배수)
		int num = 34;
        System.out.println((num%3) == 0 );
        
        //문제2) 짝수이면 true 출력
        //힌트2) 숫자 % 2 == 0 (짝수)
        //힌트2) 숫자 % 2 == 1 (홀수)
        System.out.println((num%2) ==0);
        
        //문제3)아래돈중 1000원짜리 이상화폐를 제외한
        //1000원짜리가 3장 이상이면 true 출력
        
        int money = 1786000; 
        int spare_money = money%5000/1000;     //천원 보다 큰 돈 5000원, 5000원은 최소 단위 화폐(더 큰 돈 기준)라서 나눈다
        System.out.println(spare_money/3 >= 3);
                
	}
}