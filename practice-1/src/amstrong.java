import java.util.Scanner;
import java.lang.Math;
public class amstrong {
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number");
	int num = scan.nextInt();
	boolean result = ams(num);
	if(result)
		System.out.println("yes");
	else System.out.println("no");
}
static boolean ams(int num)
{
	boolean result= true;
	int rem;
	int old_num = num,temp =0;
	while(old_num>0)
	{
		rem = old_num %10;
		temp = (int) (temp +(Math.pow(rem, 3)));
		old_num = old_num /10;
		
	}
	if(temp == num)
	return result;
	else return false;
}
}
