import java.util.Scanner;
public class factorial {
public static void main(String args[])
{
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the num");
	int num = scan.nextInt();
	int result = fact(num);
	System.out.println("the result is "+result);
}
static int fact(int num)
{
	int result =1;
	for(int i =1;i<=num;i++)
	{
		result = result*i;
	}
	return result;
}
}
