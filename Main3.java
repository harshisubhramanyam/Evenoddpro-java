import java.util.Scanner;  
public class Pattern  
{  
public static void main(String[] args)  
{  
int i, j, rows;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number of rows: ");  
rows = sc.nextInt();          
for( i=1;i<=rows;i++)
 {
   for( j=1;j<=rows-i;j++)
    {
       System.out.print(" ");
         }
     for( j=1;j<=i*2-1;j++)
     {
       System.out.print("*");
         }
     System.out.println();
      } 
     for( i=rows-1;i>0;i--)
     {
      for( j=1;j<=rows-i;j++)
        {
      System.out.print(" ");
       }
       for( j=1;j<=i*2-1;j++)
        {
      System.out.print("*");
      }
       System.out.println();
     }
   }
}
