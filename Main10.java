import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
LinkedList<Integer> x=new LinkedList<Integer>();
int n,ch;
do
{
System.out.println("1.BeginInsert\n2.EndInsert\n3.positionInsert\n4.BeginDelete\n5.EndDelete\n6.positionDelete\n7.display\n8.Exit\n Enter your choice:");
ch=sc.nextInt();
switch(ch)
{
case 1: System.out.println("Enter n value");
        n=sc.nextInt();
        x.addFirst(n);
        break;
case 2: System.out.println("Enter n value");
        n=sc.nextInt();
        x.addLast(n);
        break;
case 3: System.out.println("Enter n value");
        n=sc.nextInt();
        System.out.println("Enter position ");
        int pos1=sc.nextInt();
        x.add(pos1-1,n);
        break;
case 4: x.removeFirst();
        break;            
case 5: x.removeLast();
        break;
case 6: System.out.println("enter the position");
        int pos=sc.nextInt();
        int in=x.get(pos-1);
        int y=x.indexOf(in);
        x.remove(y);
        break;

case 7: System.out.println(x);
        break;
case 8: break;
}
}while(ch<8);
}
}
