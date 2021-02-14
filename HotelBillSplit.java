/*
https://www.hackerrank.com/challenges/bon-appetit/problem

*/

import java.util.*;
public class HotelBillSplit
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2 && n>100*100*10){System.exit(0);}
        int k=sc.nextInt();
        if(k<0 && k>n){System.exit(0);}
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0 && arr[i]>100*100)
            {System.exit(0);}
        }
        int b=sc.nextInt();
        
        
        int not_anna=arr[k];
        int sum=0;
        for(int j=0;j<n;j++)
        {
            sum+=arr[j];
        }

        
        if(b<0 && b>sum){System.exit(0);}
        sum=sum-(arr[k]);
        int final_anna=(sum/2);

       // if(b<final_anna){System.exit(0);}
        if(b>final_anna)
        {
            int r=b-final_anna;
            System.out.println(r);
        }else
        {
            System.out.println("Bon Appetit");
        }

    }

}




/*
import java.util.*;
public class HotelBillSplit
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2 && n>100*100*10){System.exit(0);}
        int k=sc.nextInt();
        if(k<0 && k>n){System.exit(0);}
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0 && arr[i]>100*100)
            {System.exit(0);}
        }
        int b=sc.nextInt();
        
        
        int not_anna=arr[k];
        int sum=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j]==not_anna)
            {continue;}
            sum+=arr[j];
        }

      if(b<0 ){System.exit(0);}
        int final_anna=sum/2;

        if(b>final_anna)
        {
            int r=b-final_anna;
            System.out.println(r);
        }else
        {
            System.out.println("Bon Appetit");
        }

    }

}

*/
