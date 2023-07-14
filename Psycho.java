import java.util.*;
public class Psycho {
    public static void recursion(int i,int k,ArrayList<Integer>al,int n,int size)
    {
        if(n==1)
        {
            System.out.println(al.get(0));
            return;
        }
        if(i<n)
        {
            al.remove(i%al.size());
          recursion((i+(k-1))%al.size(),k,al,al.size(),size);   
        } 

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(a[i]);
        }
        int k=sc.nextInt();
      recursion(k-1,k,al,al.size(),al.size());
    }
}
