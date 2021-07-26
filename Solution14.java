class Solution {
public int countPrimes(int n) {
int satyharshi[] = new int[n];
for (int i=2; i <n; i++)
{
for(int j=i+i;j<n;j=j+i)
{
satyharshi[j]=1;
}

    }
    int result=0;
    for(int i=2;i<satyharshi.length;i++)
    {
        if(satyharshi[i]==0)
        {
            result++;
        }
    }
      return result;
}
}
