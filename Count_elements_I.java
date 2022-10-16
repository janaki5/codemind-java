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
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        for(int i=0; i<N; i++)
            list1.add(sc.nextInt());
        for(int i=0; i<M; i++)
            list2.add(sc.nextInt());
        for(int a : list1)
        {
            if(!list3.contains(a))
                list3.add(a);
        }
        for(int a : list2)
        {
            if(!list4.contains(a))
                list4.add(a);
        }
        list3.retainAll(list4);
        System.out.print(list3.size());
        sc.close();
    }
}