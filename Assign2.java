import java.util.*;
class assign2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Hashtable<Integer,Integer> x=new Hashtable<Integer,Integer>();
x.put(101,50000);
x.put(102,45000);
x.put(103,35000);
x.put(104,40000);
x.put(105,45000);
System.out.println(x);
System.out.print("Enter Key Value: ");
int key=sc.nextInt();
if(x.containsKey(key))
{
x.put(key,x.get(key)+5000);
System.out.println(x);
}
else
System.out.print("Value Not Found");
}
}
