import java.util.*; 
class print
{
 public static void main(String args[])
 {
  HashMap<String,Integer> x=new HashMap<String,Integer>(); 
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter n value");
  int n=sc.nextInt();
String[] s=new String[n];
System.out.println("Enter Names: ");
for(int k=0;k<n;k++)
s[k]=sc.nextLine();

 for(int i=0;i<n;i++)
	{
	String key;
	key=s[i];
	if(x.containsKey(key))
	x.put(key,x.get(key)+1);
	else 
	x.put(key,1);
	}

 for(Map.Entry<String,Integer>i:x.entrySet())
	{
	if(i.getValue()>2)
	System.out.print(i.getKey()+"-->"+i.getValue()+"\n");
	}
 } 
}
