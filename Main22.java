import java.util.*;
class Main
{
public static void main(String args[])
{
System.out.println("Enter Value:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n+1];
a[1]=3;
for(int i=2;i<=n;i++)
{
a[i]=(a[1]*i)+a[i-1];
}
System.out.println("enter query");
int Q=s.nextInt();
while(Q>0)
{
int n1=s.nextInt();
System.out.println("Sum Of Multiples:" +a[n1]);
Q--;
}
}
} 
