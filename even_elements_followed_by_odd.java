 import java.util.*;
class EvenElementsFollowedByOdd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = sc.nextInt();
        for(int i=0; i<N; i++)
        {
            list.add(sc.nextInt());
            if(list.get(i)%2 == 0)
                System.out.print(list.get(i) + " ");
        }
        for(int i: list)
        {
            if(i%2 != 0)
                System.out.print(i + " ");
        }
        sc.close();
    }
}