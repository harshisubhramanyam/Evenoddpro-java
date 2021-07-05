 class MoveZerostolastposition
{
	 static void printZeroElementToEnd(int arr[])
	 {  
		 int size = arr.length;  
	     int count = 0;  
	     
	     for (int i = 0; i < size; i++)
	     {  
	    	 if (arr[i] != 0)
	    	 {  
	             arr[count++] = arr[i];  
	         }  
	     }  
	  
	     while (count < size)  
	     arr[count++] = 0;  
	 }  
	  
	 public static void main(String[] args) 
	 { 
	     int arr []= {0,4,18,0,1,0,7,13,0,4,8,0,9,0,0,};  
	     printZeroElementToEnd(arr);
	     
	     System.out.print("Array after printing zeros to end : ");  
	  
	     for (int i = 0, size = arr.length; i < size; i++)  
	     System.out.print(arr[i] + " ");  
	 }  
}
