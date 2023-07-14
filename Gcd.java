import java.io.*;
import java.util.*;
import java.util.concurrent.RecursiveAction;
class Item{
      int site;
      int cost;
      Item(int site,int cost)
      {
          this.site=site;
          this.cost=cost;
      }
  }
 class Solution {
    public static int getMax(int i,ArrayList<Item>al,int key)
    {
       for(int k=i+1;k<n;k++ )
       {
          if(al.get(k).site>key)
          {
            return k;
          }
       }
       return -1;
    }
  
    public static int recurse(int i,int interval,ArrayList<Item>al)
    {
       if(i==-1)
       {
        return 0;
       }
       if(i<n && i+1<n)
       {
        int x=al.get(i).cost+recurse(getMax(i,al,al.get(i).site+interval),interval,al);
        int nx=al.get(i+1).cost+recurse(getMax(i+1,al,al.get(i+1).site),interval,al);
        return Math.max(x,nx);
       }
       return 0;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int miles=sc.nextInt();
        int n=sc.nextInt();
        int sites[]=new int[n];
        int costs[]=new int[n];
        
        for(int i=0;i<sites.length;i++)
        {
            sites[i]=sc.nextInt();
        }
        for(int i=0;i<costs.length;i++)
        {
            costs[i]=sc.nextInt();
        }
        ArrayList<Item>al=new ArrayList<>();
        int interval=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            al.add(new Item(sites[i],costs[i]));
        }
        int max=0;

        if(sites[n-1]<=miles)
        {
           int ans= Recurse(0,interval,al);
            System.out.println(ans);
            
         
        }
        else
        {
            System.out.print("-1");
        }
    }
}