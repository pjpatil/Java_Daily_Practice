package Chapter1;
import java.util.Scanner;
/* Q. Write a java program to copy one array to anoder array.*/

public class CopyOneArrayToAnotherArray {

	public static void main(String[] args) {
				int a[],b[];
				a=new int [5];
				b=new int [5];
				Scanner xyz=new Scanner (System.in);
				System.out.printf("Enter the values in the array:\n");
				for(int i=0;i<a.length;i++)
				{
					a[i]=xyz.nextInt();
				}
				System.out.printf("Display the values in the array:\n");
				for(int i=0;i<a.length;i++)
				{
					System.out.printf("a[%d]--->%d\n",i,a[i]);
				}
				System.out.printf("After copy the array is:\n");
				for(int i=0;i<a.length;i++)
				{
					b[i]=a[i];  // copy array a to b
				}
				for(int i=0;i<b.length;i++)
				{
					System.out.printf("b[%d]--->%d\n",i,b[i]);
				}
			}

		}