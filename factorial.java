/*
You are provided with a number, "N". Find its factorial.

Input Description:
A positive integer is provided as an input.

Output Description:
Print the factorial of the integer.

Sample Input :
2
Sample Output :
2
*/

//Code
import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		BigInteger factor=new BigInteger("1");
		while(number>0)
		{
			factor=factor.multiply(BigInteger.valueOf(number));
			number--;
		}
		System.out.println(factor);
	}
}
