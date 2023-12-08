package Chapter1;
import java.util.*;
/*Q. Write a java program to take input from array of size 5 and display it */
public class ArrayAndDisplay {
	public static void main(String[] args)
	{
		int a[];
		a=new int[5];
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter values in Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Display array value");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("a[%d]-->%d\n",i,a[i]);
		}	
	}
}
