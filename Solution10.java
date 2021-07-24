import java.util.*;
public class Solution
{
public static void main(String ar[])
	{ 
	Stack<Integer> st=new Stack<Integer>();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no.of elements: ");
	int n=sc.nextInt();
	System.out.print("Enter Elements: ");
	
	for(int i=0;i<n;i++)
		st.push(sc.nextInt());

	System.out.println(st);
	System.out.println("max value : "+Collections.max(st));
	System.out.println("min value : "+Collections.min(st));
	
	}
}
