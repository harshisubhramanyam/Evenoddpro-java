import java.util.*;
class mulof3and5
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int c=0;
int k=0;
System.out.println("Enter n value");
int n=sc.nextInt();
HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
Integer a[]=new Integer[n];
System.out.println("Enter no");
for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();
}

for(int i=0;i<a.length;i++){

if(h1.containsKey(a[i]))
h1.put(a[i],h1.get(a[i])+1);
else
h1.put(a[i],1);
}
for (Map.Entry<Integer, Integer> i : h1.entrySet())
{
if(i.getKey()%5==0)
c=c+1;
else if(i.getKey()%3==0)
k=k+1;

}
System.out.println("5"+"="+c);
System.out.println("3"+"="+k);
}
