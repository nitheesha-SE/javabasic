
public class selection_sort {
	public static void main(String args[])
	{
		int a[]= {3,2,1};
		select(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
	}
	public static void select(int a[])
	{
		int l = a.length;
		for(int i = 0;i<l;i++)
		{
			int index = i;
			for(int j =i;j<l;j++)
			{
				if(a[j]<a[i])
					index = j;
			}
			int temp = a[index];
			a[index]= a[i];
			a[i] = temp;
		}
	}

}
