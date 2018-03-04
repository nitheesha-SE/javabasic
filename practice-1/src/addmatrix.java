
public class addmatrix {
	public static void main(String args[])
	{
		int a[][]={{1,34},{2,4}};
		int b[][]={{32,45},{57,38}};
		int c[][] = new int[2][2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
				System.out.print(c[i][j]+" ");
			System.out.println("\n");
		}
	}

}
