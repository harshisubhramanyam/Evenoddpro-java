import java.util.*;
public class Solong3
{
public static void main(String args[])
{
HashMap<Integer,Integer>x=new HashMap<Integer,Integer>();
int arr[]={2,3,4,5,4,6,4,7,4,5,6,6};
for(int i=0;i<arr.length;i++)
{
if(x.containsKey(arr[i]))
x.put((arr[i]),x.get(arr[i])+1);
else
x.put(arr[i],1);
}

for(Map.Entry<Integer,Integer> entry : x.entrySet())
if(entry.getValue() > 1)
System.out.println(entry.getKey()+ " --> "+entry.getValue());
}
}
