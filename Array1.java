public class DuplicateElementInArray
 {
 
    public static void main(String args[]) 
     {

        int arr[] = {1,3,5,7,8,5,6,1};
 
        for(int i = 0; i < arr.length; i++)
         {
            for(int j = i+1; j < arr.length; j++) 
              {
              if(arr[i] == arr[j])
               {
                 System.out.println(arr[i]);
              }
          }
       }
    }
 }
