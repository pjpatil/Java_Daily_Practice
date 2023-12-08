package Chapter1;
import java.util.*;
public class Max_MinArray {

	public static void main(String[] args) {		
				int a[], max, min;
				a=new int[5];
				Scanner xyz=new Scanner (System.in);
				System.out.println("Enter the values in the array:\n");
				for(int i=0;i<a.length;i++)
				{
					a[i]=xyz.nextInt();
				}
				System.out.println("Display the values from the array:\n");
				max=a[0];
				min=a[0];
				for(int i=0;i<a.length;i++)
				{
					System.out.printf("a[%d]--->%d\n",i,a[i]);
					if(max<a[i])
					{
						max=a[i];
					}
					if(min>a[i])
					{
						min=a[i];
					}
				}
				System.out.printf("The Maximum value in the array is:%d\n",max);
				System.out.printf("The min values in the array is:%d\n",min);
			}

		}