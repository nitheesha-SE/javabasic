
public class fibonocci {
	static int a =0, b= 1,c = 0;
	public static int fib(int n)
	{
	c = a+b;
	a = b;
	b = c;
	return c;
	
	}
	public static void main(String []args)
	{
	System.out.println("given num \n");
	System.out.println(a +" "+b);
	int n = 6;
	int num = 0;
	for(int i =3; i<=n;i++)
	{
		num = fib(n);
		System.out.println(num);
	}
	}
}
