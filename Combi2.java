import java.util.ArrayList;

public class Combi2 {

    public static recurse(int i,String s1,String s2,ArrayList<Character>al)
    {
       if(k==0)
       {

       }
        if(i<s.length())
        {
          al.add(s1.charAt(i));
          al.add(s2.charAt(i));
          recurse(i+1,s1,s2,al,k-2);
          al.remove(al.size()-1);
          al.add()
        }
    }
    public static void main(String[] args) {
        String s1="abc";
        String s2="bcd";
        ArrayList<Character>al=new ArrayList<>();
        recurse(0,s1,s2,al);
    }
    
}
