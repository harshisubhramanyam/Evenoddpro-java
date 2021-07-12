 import java.util.*;
class Position
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String s=sc.nextLine();
System.out.println("enter inserting String");
String str=sc.next();
System.out.println("enter position to be inserted");
int pos=sc.nextInt();
StringBuilder sms=new StringBuilder(s);
sms.insert(pos,str);
System.out.print(sms.toString());
}
}
