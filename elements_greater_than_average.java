import java.util.*;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n,arr[],avg,c=0,sum=0;
       n=sc.nextInt();
       arr=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
           sum=sum+arr[i];
       }
       avg=(int)sum/n;
       for(int i=0;i<n;i++)
       {
           if(arr[i]>=avg)
           {
               c++;
           }
       }
       System.out.print(c);
    }
}