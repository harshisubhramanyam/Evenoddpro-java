import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int rear=-1;
        int front=0;
        for(int i=0;i<n;i++)
            {

            int k=in.nextInt();
            if(k ==1)
                {
                int num=in.nextInt();
                arr[++rear]=num;
            }
            else if (k==2)
                {
                int num=arr[front++];
            }
            else 
                {
                System.out.println(arr[front]);
            }
        }
    }
}
