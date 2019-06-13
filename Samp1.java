import java.io.*;
import java.util.*;
class Samp1
{

    public static void main(String args[])
    {
        int a,b,c;
        String msg;
        char[] chr;
        int i;
        HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
        HashMap<Integer,Character> mmap=new HashMap<Integer,Character>();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter message:");
        msg=sc.nextLine();
        System.out.println("the message is"+msg);
        chr=msg.toCharArray();  
        
         for(i=0;i<chr.length;i++)
         {

            if(hmap.containsKey(chr[i]))
            {
                hmap.put(chr[i],hmap.get(chr[i])+1);
                
            }
            else
            {
                hmap.put(chr[i],1);
            }
            
         }
         for(Map.Entry m:hmap.entrySet())
         {
             System.out.println(m.getKey()+":"+m.getValue()+"\n");
         }
         
    }
}