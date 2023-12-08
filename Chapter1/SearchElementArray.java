package Chapter1;
import java.util.*;
/* Q. Write a java program to Search element in array.its element found or not.*/
public class SearchElementArray {

	public static void main(String[] args) {
		
		int a[],flag=0;
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
			System.out.println(+i+"--->"+a[i]);
		}
		System.out.printf("Enter the value for the search:\n");
	    int svalue=xyz.nextInt();
	    for(int i=0;i<a.length;i++)
	    {
	    	if(svalue==a[i])
	    	{
	    		flag=1;
	    		break;
	    	}
	    }
	    if(flag==1)
	    {
	    	System.out.printf("Element Found \n");
	    }
	    else
	    {
	    	System.out.printf("Element Not Found\n");
	    }

	}

}
