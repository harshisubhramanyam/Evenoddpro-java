import java.util.*;
class ArrayListk
{
public static void main(String args[])
 {
	HashMap<Integer,Integer> x=new HashMap<Integer,Integer>(); 
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter n value: ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.print("Enter values into arraylist: ");
	for(int i=0;i<n;i++)
	{
	  arr[i]=sc.nextInt();
	}
	
	System.out.print("Enter k value: ");
	int k=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	  if(arr[i]>k)
	  System.out.print(arr[i]+" ");
	}
 }
}
