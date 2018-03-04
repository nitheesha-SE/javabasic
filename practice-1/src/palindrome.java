import java.util.Scanner;
public class palindrome {
public static void main(String args[])
{
	System.out.println("enter the number o check \n");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	boolean result = pal(num);
	if (result) System.out.println("it is palindrme");
	else System.out.println("not a palindrome");
}
public static boolean pal(int num)
{
	int reminder = 0;
	int new_num = 0;
	int old_num = num;
	while(old_num>0)
	{
	reminder = old_num%10;
	old_num = old_num/10;
	new_num = new_num*10 +reminder;
	}
	if(num == new_num)
		return true;
	else return false;
	
}
}
