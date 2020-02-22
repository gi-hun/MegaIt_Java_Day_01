package day_01;

class VarEx02 
{
	public static void main(String[] arg)
	{
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력
		int cash = 1000;
		int snack = 200;
		int result = cash - snack;
		
		System.out.println("잔돈: "  + result);		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int sale_month = 100;
		double sale_year = 100*12*0.9;
		System.out.println("연봉: " + sale_year);
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int grade_a =30, grade_b = 50, grade_c =4;
		int grade_result = (grade_a+grade_b+grade_c)/3;
		System.out.println("시험 점수 평균: " + grade_result);
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int height = 3;
		int bottom = 6;
		int tri_result = 3*6/2;
		System.out.println("삼각형 넓이: " + tri_result);
		//문제4) 100초를 1분 40초로 출력
		int time = 100;
		int min = 100/60;
		int sec = 100%60;
		System.out.println("100초는 " + min + "분" + sec + "초 이다.");
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		int sum = 800;
		int num1 = 500;
		int num2 = 100;
		System.out.println("800원은 500원 " + sum/num1+ "개 100원"+ (sum-num1)/num2 + "개 이다");
		//정답5) 500원(1개), 100원(3개)  
	}
}
