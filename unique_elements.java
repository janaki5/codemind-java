import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list1=new ArrayList<Integer>();
       ArrayList<Integer>list2=new ArrayList<Integer>();
       int n;
       n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           list1.add(sc.nextInt());
       }
       for(int i:list1)
       {
           if(!list2.contains(i))
           {
               list2.add(i);
           }
       }
       for(int i:list2)
       {
           System.out.print(i+" ");
       }
    }
}