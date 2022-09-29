import java.util.Scanner;
class external
{
	static int counter = 1;
	static void notleap(int year)
	{
		System.out.println(year+"_"+counter);
		counter++;
	}
}

class leapyearach
{
	static void leap(int year)
	{
		System.out.println(year+"_leap");
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int end = input.nextInt();
		int start = 1600;
		
		for (int i=start; i<end+1; i++)
		{
			System.out.println(i);
			if(i%4 == 0)
			{
				leap(i);
			}
			else
			{
				external.notleap(i);
			}
		}
	}
}
