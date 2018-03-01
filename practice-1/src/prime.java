import java.util.*;
public class prime {
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	prime p = new prime();
	System.out.println("enter a number");
	int num = scan.nextInt();
	boolean result = true;
	result = p.primenum(num);
	if(result){
	System.out.println("the number" + num+"is prime");
	}
	else System.out.println("The number is not prime");
	
	}
	public  boolean primenum(int num)
	{
		int count =0;
		for(int i = 2;i<num;i++)
		{
			if(num%i ==0){
				count = count+1;
			}
		}
		if (count>0)
			return false;
		else return true;
	}
	
	

}
