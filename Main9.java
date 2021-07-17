import java.util.*;
class assign1july16
{
 public static void main(String arg[])
 {
	Scanner sc=new Scanner(System.in);
ArrayList<Integer> arr=new ArrayList<Integer>();
	System.out.print("Enter n value : ");
	int n=sc.nextInt();

	System.out.print("Enter array values : ");
	for(int i=0;i<n;i++)
	   arr.add(sc.nextInt());
	
	System.out.print("Enter values to search, replace : ");
	
	int key=sc.nextInt();
        int x=sc.nextInt();
	boolean b=arr.contains(key);
	
	if(b ==false)
	System.out.println("output: "+b);
	else
	{
	arr.set(arr.indexOf(key),x);
	System.out.println("output: "+arr);
	}
	
 }
}
