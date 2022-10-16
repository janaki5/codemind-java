import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> p = new ArrayList<Integer>();
        for(int i=0; i<N; i++)
            list1.add(sc.nextInt());
        for(int i=0; i<M; i++)
            list2.add(sc.nextInt());
        ArrayList<Integer> temp1=new ArrayList<Integer>(list1);
        temp1.removeAll(list2);
        for(int a:temp1)
        list3.add(a);
        list2.removeAll(list1);
        for(int a:list2)
        list3.add(a);
        for(int a:list3)
        {
            if(!p.contains(a))
            p.add(a);
        }
        for(int a:p)
        System.out.print(a+" ");
        sc.close();
    }
}