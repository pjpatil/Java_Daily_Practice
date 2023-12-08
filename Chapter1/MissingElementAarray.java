package Chapter1;
import java.util.*;
public class MissingElementAarray {

	public static void main(String[] args) {
				int a[];
				a=new int[5];
				Scanner xyz=new Scanner(System.in);
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
				System.out.printf("The Missing elements are:\n");
				for(int i=0;i<a.length;i++)
				{
					for(int j=a[i];j<(a[i+1]-1);)
					{
						System.out.printf("%d\n",++j);
					}
				}
			}
		}