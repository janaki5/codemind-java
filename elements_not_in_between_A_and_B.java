import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list1=new ArrayList<Integer>();
        ArrayList<Integer>list2=new ArrayList<Integer>();
        int n,a,b,c=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list1.add(sc.nextInt());
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i:list1)
        {
            if(i<a || i>b)
            {
                System.out.print(i+" ");
                c++;
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        
        
        
        
    }
}