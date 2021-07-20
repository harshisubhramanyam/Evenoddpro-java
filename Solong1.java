import java.util.*;
public class Solong1
{
public static void main(String args[])
{
HashMap<Integer,String>x=new HashMap<Integer,String>();
Scanner sc=new Scanner(System.in);
int n,key;
String value;
System.out.println("enter the n value");
n=sc.nextInt();
for(int i=0;i<n;i++)
{
key=sc.nextInt();
value=sc.next();
x.put(key,value);
}
TreeMap<Integer,String>t=new TreeMap<Integer,String>(x);
System.out.println(t);
}
}
