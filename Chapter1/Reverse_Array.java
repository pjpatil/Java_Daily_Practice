package Chapter1;
import java.util.*;
public class Reverse_Array {

	public static void main(String[] args) {
		
		int a[],mid, end, temp;
		a=new int[5];
		Scanner xyz=new Scanner(System.in);
		System.out.printf("Enter the values in the array:\n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.printf("Display the values in the array Before reverse:\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("a[%d]--->%d\n",i,a[i]);
		}
		mid=(a.length/2);
		end=(a.length-1);
		for(int i=0;i<mid;i++)
		{
			temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			--end;
		}
		System.out.printf("After Reverse the array is:\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("a[%d]--->%d\n",i,a[i]);
		}

	}

}





		
	