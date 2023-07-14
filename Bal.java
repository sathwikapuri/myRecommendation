import java.io.*;
import java.util.*;
import java.util.regex.*;
class x{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Pattern pattern = Pattern.compile(s2);
        Matcher matcher = pattern.matcher(s1);    
        while(matcher.find())
        {    
                System.out.println("Pattern found at index "+matcher.start());    
        }     
    }
}