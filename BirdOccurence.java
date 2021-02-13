/*
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type.
If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
PROBLEM STATEMENT LINK --    https://www.hackerrank.com/challenges/migratory-birds/problem
*/


import java.util.*;
import java.util.Arrays;
public class BirdOccurence
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      if(n<6 && n>2*100*100*10){System.exit(0);}
      
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>5){System.exit(0);}
        }
        int SPC[]=new int[n];
        int counter=0;
        int mx=0;
        int mx_index=0;
        int mx_no=0;
        int t=0;
        Arrays.sort(arr);
//1123
        for(int y=0;y<n-1;y++)
        {
            counter++;
            if(arr[y]==arr[y+1])
            { 
                counter++;
                if(counter>mx)
                {mx_no=arr[y];}
             }
            else
            {
                counter--;
                if(mx==counter && arr[y]<arr[t])
                {     mx_no=arr[y];    }
                if(mx<counter)
                {
                    mx=counter;
                    mx_no=arr[y];
                    t=y;
                }
                counter=0;
            }
        }
        System.out.println(mx_no);
    }
}

  //   int maxx=arr[0];
   //     int max_index=0;
        
        // for(int s=1;s<n;s++)
        // {
        //     if(maxx==SPC[s] && arr[max_index]>arr[s])
        //     {
        //             max_index=s;

        //     }
        //     if(SPC[s]>maxx)
        //     {
        //         maxx=SPC[s];
        //         max_index=s;
        //     }
        // }    



/*
import java.util.*;
public class BirdOccurence
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      if(n<6){System.exit(0);}
      
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int SPC[]=new int[n];
        int counter=0;
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(arr[j]==arr[k])
                {
                    counter++;
                }
            }   
            SPC[j]=counter;
            counter=0;
            
        }
        int maxx=arr[0];
        int max_index=0;
        
        for(int s=1;s<n;s++)
        {
            if(maxx==SPC[s] && arr[max_index]>arr[s])
            {
                    max_index=s;

            }
            if(SPC[s]>maxx)
            {
                maxx=SPC[s];
                max_index=s;
            }
        }    
        System.out.println(arr[max_index]);
    }
}
*/
