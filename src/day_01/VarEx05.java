package day_01;

class VarEx05 
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 20;
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
