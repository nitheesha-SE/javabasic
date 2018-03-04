
public class multipymatrix {
public static void main(String args[])
{
	int a[][]={{1,2,3},{4,5,3}};
	int  b[][]={{3,4,5},{4,7,6}};
	int c[][]=new int[3][3];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			c[i][j] =0;
			for(int k=0;k<3;k++)
			{
			c[i][j] += a[i][k]*b[k][j];
		}
		}
	}
	
}
}
