//https://www.hackerrank.com/challenges/day-of-the-programmer/problem
import java.util.*;
public class ProgrammersDay
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int em=0;
        int day=0;
        if((year%4)==0 && (year%100)==0 && (year%400)!=0 && (year>1918))
        {
            em=31+28+31+30+31+30+31+31;
            day=256-em;
            System.out.println(day+".09."+year);
            System.exit(0);
        }
        if((year%4)==0)
        {

            //31+16+31+30+31+30+31+31
            em=244;
            day=256-em;
        }
        else
        {
            if(year==1918)
            {
                em=31+16+31+30+31+30+31+31;
                day=256-em+1;
                System.out.println(day+".09."+year);
                System.exit(0);
            }
            em=31+28+31+30+31+30+31+31;
            day=256-em;
        }

        System.out.println(day+".09."+year);
        
    }
}
