import java.util.Arrays;

public class dublicate_remove {
	public static void main(String args[])
	{
		int a[]={2,4,6,4,5,5,7,7};
		
		int b[] = new int[10];
		Arrays.sort(a);
		for(int k:a)
		{System.out.print(k+" ");
		
	}
		
		int j =0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i] !=a[i+1])
			{
				b[j++]=a[i];
		}
		}
		b[j++] =a[a.length-1];
		System.out.println("lenthg"+b.length);
		for(int p=0;p<b.length;p++)
		{System.out.print(b[p]+" ");
		
	}
	}
}
