import java.util.Scanner;
public class linear_search {
public static void main(String args[])
{
	int a[] ={1,4,5,7,8,9};
	System.out.println("enter the number to search");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int get_index = -1;
	for(int i =0;i<a.length;i++)
	{
		if(num == a[i])
		{
			get_index = i;
			break;
		}
		
	}
	if(get_index>=0)
		System.out.println("the number found in index"+get_index);
	else{
		System.out.println("Number not found");
	}
	
}
}
