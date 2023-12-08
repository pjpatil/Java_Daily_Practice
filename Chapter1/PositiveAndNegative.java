package Chapter1;
import java.util.*;
/* Q. Write a java program to find Positive and Negative number in array*/

public class PositiveAndNegative {

	public static void main(String[] args) {
			int a[];
			a=new int[5];
			Scanner xyz=new Scanner(System.in);
			System.out.println("Enter the values in the array:\n");
			for(int i=0;i<a.length;i++)
			{
				a[i]=xyz.nextInt();
			}
			System.out.println("Display the values in the array:\n");
			for(int i=0;i<a.length;i++)
			{
				System.out.printf("a[%d]--->%d\n",i,a[i]);
			}
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>0)
				{
					System.out.printf("a[%d]=%d is positive \n",i,a[i]);
				}
				else
				{
					System.out.printf("a[%d]=%d is Negative \n",i,a[i]);
				}
			}
		}
	}