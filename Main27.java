import java.util.*;
class Main
{
public static void main(String args[])
{
System.out.println("Enter String:");
Scanner sc=new Scanner(System.in);
String s= sc.next();
permutation(s,"");
}

public static void permutation(String input,String output) 
{
if(input.length()==0)                         
{                                               
System.out.println(output);                      
return;                                         
}                                               
else                                             
{ 
for(int i=0;i<input.length();i++)
{ 
char ch = input.charAt(i); 
String left = input.substring(0,i); 
String right = input.substring(i+1);
String input1=left+right; 
String output1 = output+ ch; 
permutation(input1,output1);
}
}
}
}
