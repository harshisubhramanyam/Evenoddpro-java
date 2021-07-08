import java.util.Arrays;
import java.util.Scanner;
class rarr
{
	public static void rightRotateByOne(int[] a)
	{
		int last = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}

		a[0] = last;
	}
	public static void rightRotate(int[] a, int k)
	{
		for (int i = 0; i < k; i++) {
			rightRotateByOne(a);
		}
	}

	public static void main(String[] args)
	{
            Scanner in=new Scanner(System.in);
            
		int[] a =new int[8];  //10
                System.out.println("Enter the elements of the array:");
                for(int i=0;i<a.length;i++)
                a[i]=in.nextInt();
		int k;
                System.out.println("Enter no of rotations:");
                k=in.nextInt();
		rightRotate(a,k);

		System.out.println(Arrays.toString(a));
	}
}
