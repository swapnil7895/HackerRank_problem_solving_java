import java.util.*;
public class DivSumPairs
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int t=0;t<n;t++)
            {
             arr[t]=sc.nextInt();
            }
        int counter=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(((arr[i]+arr[j])%k)==0)
                {counter++;}
            }   
        }
        System.out.println(counter);
        
        //6 3             n = 6, k = 3
        //1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
    }
}