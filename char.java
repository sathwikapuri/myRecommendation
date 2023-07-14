import java.io.*;
import java.util.*;

 class Solution 
{
    public static void recur(int i,String s,int n,int k, HashMap<Character,Integer> hm,ArrayList<Character>al,ArrayList<String>ans)
    {
        if(n==0)
        {
            int sum=0;
            for(Character c:al)
            {
                sum=sum+hm.get(c);
            }
             if(sum==k)
             {
                 String s5="";
                 for(Character c:al)
                 {
                    s5=s5+c;
                 }
                 ans.add(s5);
             }
             return;
        }

        if(i>=0 && i<26)
        {
            al.add(s.charAt(i));
            recur(i,s,n-1,k,hm,al,ans);
            al.remove(al.size()-1);
            recur(i+1,s,n,k,hm,al,ans);
           
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=1;i<=26;i++)
        {
            char ch=(char)(96+i);
            hm.put(ch,i);
        }
        String s="";
        for(int i=0;i<26;i++)
        {
           char ch=(char)(97+i);
            s=s+ch;
        }
        ArrayList<String>ans=new ArrayList<>();
        ArrayList<Character>al=new ArrayList<>();
        int max=0;
        recur(0,s,n,k,hm,al,ans);
        Collections.sort(ans);
        System.out.println(ans.get(0));
    }
}
