package day_01;
class IfEx01 
{
	public static void main(String[] args)
	{
		
		if(true)
			System.out.println("실행 o");
		else
			System.out.println("실행 x");
		
		int num = 8;
		System.out.println(num%2 ==0);
		System.out.println(num%2 !=0);
		
		if(num%2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		num = -10;
		
		if(num >0)
			System.out.println("양수");
		else if(num == 0)
			System.out.println("0");
		else
			System.out.println("음수");
		
		num = 12;
		
		if(num %4 == 0)
			System.out.println("4의 배수이다");
		else
			System.out.println("4의 배수가 아니다");
		
		int score = 87;
		
		if(score >=80)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
	}
}
