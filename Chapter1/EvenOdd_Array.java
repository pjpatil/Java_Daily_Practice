package Chapter1;
import java.util.*;

/* Q. Write a java program to find Even and odd number in array*/
public class EvenOdd_Array {
	public static void main(String[] args) {
				int a[];
				a=new int[5];
				Scanner xyz=new Scanner(System.in);
				System.out.println("Enter the values in the array:\n");
				for(int i=0;i<a.length;i++)
				{
					a[i]=xyz.nextInt();
				}
				System.out.printf("Display the values in the array:\n");
				for(int i=0;i<a.length;i++)
				{
					System.out.printf("a[%d]--->%d\n",i,a[i]);
				}
				System.out.printf("The Even numbers are:\n");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2==0)
					{
						System.out.printf("a[%d]--->%d\n",i,a[i]);
					}
				}
				System.out.printf("The odd numbers are:\n");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2==1)
					{
						System.out.printf("a[%d]--->%d\n",i,a[i]);
					}	
				}
			}

		}