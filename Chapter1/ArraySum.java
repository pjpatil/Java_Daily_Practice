package Chapter1;
import java.util.*;
/*Q. Write a java program to calculate sum of  array of size 5 */
public class ArraySum {
	public static void main(String[] args) 
	{
		int n,i,sum=0;
		Scanner xyz=new Scanner(System.in);
		System.out.printf("Enter the size of Array");
		n=xyz.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter values in Array");
		for(i=0;i<array.length;i++)
		{
			array[i]=xyz.nextInt();
		}
		System.out.println("Find the sum of array");
		for(i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		System.out.printf("Sum =%d",sum);
	}
}
