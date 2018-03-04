import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class large3_num {
	public static void main(String args[])
	{
		Integer a[] = {2,4,6,8,7,9};
		int index = largest(a);
		System.out.println("index is "+index);
	}
	public static int largest(Integer a[])
	{
		int index =0;
		List<Integer> l = Arrays.asList(a);
		Collections.sort(l);
		int len = l.size();
		index = l.get(len-3);
		return index;
		
	}

}
