import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        
        int n,po,count=0,po1,res,temp,rem;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        po=(int)Math.pow(n,2);
        temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            count++;
            temp=temp/10;
        }
        po1=(int)Math.pow(10,count);
        res=po%po1;
        if(n==res)
        System.out.print("Automorphic Number");
        else
        System.out.print("Not an Automorphic Number");
            
        
    }
}