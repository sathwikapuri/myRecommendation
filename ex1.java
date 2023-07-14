import java.util.*;
class Pair{
    int index;
    int len;
    Pair(int index,int len)
    {
        this.index=index;
        this.len=len;
    }
}
class Newfile{
   public static  void bfs(int index,int[] a,int n)
   {
    Queue<Pair>q=new LinkedList<>();
    q.add(new Pair(index,0));
    int len=0;
    while(q.isEmpty()==false)
    {
        Pair z=q.poll();
      int in=z.index;
       len=z.len;
      for(int i=0;i<n;i++)
      {
        if(a[i]==in)
        {
            q.add(new Pair(i,len+1));
        }
      }

        
    }
    System.out.println(len);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]={-1};
        
           for(int i=0;i<a.length;i++)
           {
            if(a[i]==-1)
            {
                bfs(i,a,n);
            }
           }
}
}