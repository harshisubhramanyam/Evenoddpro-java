import java.util.*;
public class Stringeveodd
{
  public static void main(String args[])
  {
   String str,eve="",odd="";
   Scanner sc=new Scanner(System.in);
   str=sc.next();
   for(int i=0;i<str.length();i++)
   {
    if(i%2==0)
      eve=eve+str.charAt(i);
    else
      odd=odd+str.charAt(i);
   }
   System.out.print(eve+" "+odd);
  }
}
