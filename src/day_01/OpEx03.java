package day_01;

class OpEx03 
{
	public static void main(String[] args)
	{
		System.out.println("가진돈:"+1000);
		System.out.println("과자 가격:"+200);
		System.out.println("잔돈:"+(1000-200));
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		System.out.println("연봉: " + 100*12*0.9);
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		System.out.println("시험 점수 평균: " + (30+50+4)/3);
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println("삼각형 넓이:" + 3*6/2);
		//문제4) 100초를 1분 40초로 출력
		System.out.println("100초는 "+100/60+"분"+100%60+"초");
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수 출력
		System.out.println("800원은 500원짜리"+800/500+"개 100원짜리"+(800-500)/100+"개");
		//정답5) 500원(1개), 100원(3개) 
	}
}
                                                         