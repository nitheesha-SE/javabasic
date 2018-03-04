
public class bubble_sort {
	static void bubble(int a[])
	{
		int l = a.length;
		int temp,x,y;
		for(int i =0;i<l;i++)
		{
			for(int j = 1;j<l-i;j++)
			{
				if(a[j-1]>a[j])
				{
					temp = a[j-1];
					a[j-1]=a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		int a[] = {1,3,56,4,43,36,7};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		bubble(a);
		System.out.println("\n after sorting \n");
				for(int i =0;i<a.length;i++)
				{
					System.out.print(a[i]+" ");
				}
		
		
	}

}
