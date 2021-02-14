import java.util.*;
public class KangarooJump
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1,v1,x2,v2;
        x1=sc.nextInt(); v1=sc.nextInt(); x2=sc.nextInt(); v2=sc.nextInt();
        if(x1<0){System.exit(0);}   if(x2<x1){System.exit(0);}
        if(x2>10000){System.exit(0);}   if(v1<1){System.exit(0);}   if(v1>10000){System.exit(0);}
        if(v2<1){System.exit(0);}   if(v2>10000){System.exit(0);}
        //working
        int kg1[]=new int[100000000];   int kg2[]=new int[100000000];

        if(v2>v1)
        {
            System.out.println("NO");
            System.exit(0);
        }
        int o=0;    int p=0;    long w=100000000;
        for(int i=x1;i<=w;i=i+v1)
        {
            kg1[o]=i;
            o++;
        }
        for(int j=x2;j<=w;j=j+v2)
        {
            kg2[p]=j;
            p++;
        }
        int f;
        int y=o-p;
        if(y<0){f=p;}else{f=o;}
        int e=0; boolean flag=false;
        for(int k=0;k<f;k++)
        {
            e++;
            if(kg1[k]==kg2[k])
            {
                flag=true;
                System.out.println("YES");
                //System.exit(0);
            }
        }
        if(flag==false)
        {System.out.println("NO");}
    }
}
//1571 4240 9023 4234

/*
import java.util.*;
public class KangarooJump
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1,v1,x2,v2;
        do{ 
        x1=sc.nextInt();
        v1=sc.nextInt();
        x2=sc.nextInt();
        v2=sc.nextInt();

    }while(!(x1>=0) || !(x1<x2) || !(x2<=10000) || !(x1<=10000) 
           || !(v1>=1) || !(v2>=1) || !(v1<=10000)|| !(v2<=10000));

        //working
        int kg1[]=new int[10000000];
        int kg2[]=new int[10000000];

        if(v2>v1)
        {
            System.out.println("NO");
            System.exit(0);
        }

        int o=0;
        int p=0;
        long w=1000000;
        for(int i=x1;i<=w;i=i+v1)
        {
        
            kg1[o]=i;
            o++;
        }
        System.out.println(o);
        for(int j=x2;j<=w;j=j+v2)
        {
            kg2[p]=j;
            p++;
        }
        System.out.println(p);
        int f;
        int y=o-p;
        if(y<0){f=p;}else{f=o;}
        System.out.println(f);
        int e=0;
        for(int k=0;k<f;k++)
        {
            e++;
            if(kg1[k]==kg2[k])
            {
                System.out.println("YES");
               // System.out.println(e);
                System.exit(0);
            }
        }
        System.out.println("NO");
        //1571 4240 9023 4234

    }
}


*/