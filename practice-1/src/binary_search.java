import java.util.Scanner;
public class binary_search {
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	//bubble_sort sorting = new bubble_sort();
	int a[]={2,4,5,7,3,9,45};
	bubble_sort.bubble(a);
	System.out.println("enter the key to search");
	int num = scan.nextInt();
	int index =search(a,0,a.length-1,num);
	if(index>= 0)
		System.out.println("number found in index"+index);
	else
		System.out.println("num not found");
	
}
public static int search(int a[], int first, int last, int num)
{
	int mid = first+(last-first)/2;
	if(last>=first)
	{
		if(a[mid]==num)
			return mid;
		if(a[mid]>num)
			return search(a,first,mid,num);
		if(a[mid]<num)
			return search(a,mid+1,last,num);
			
	}
	return -1;
	
}
}
