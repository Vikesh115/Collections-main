import java.util.HashSet;
import java.util.Iterator;
//unordered set
public class HashSets {
 public static void main(String args[])
 {
    //creating
    HashSet<Integer> set = new HashSet<>();

    //insert - list.add(el);
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);

    //print all elements
    System.out.println(set);

     //size
     System.out.println("size of set is: " + set.size());

    //search - contains
    if(set.contains(1))
    {
        System.out.println("set contains 1");
    }
    if(!set.contains(6))
    {
        System.out.println("set doesn't contain 6");
    }

    //delete
    set.remove(1);
    if(!set.contains(1))
    {
        System.out.println("doesn't contain 1");
    }
    
    //iterator - traverse. Two Types --> hasNext & next 
    //unordered 
    Iterator it = set.iterator();
     while(it.hasNext())
     {
        System.out.println(it.next());
     }

 }    
}
