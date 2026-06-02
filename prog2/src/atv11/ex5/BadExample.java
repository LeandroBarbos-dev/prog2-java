package atv11.ex5;

import java.util.List;
import java.util.LinkedList;

public class BadExample {
    public static void main(String[] args) {
    	List<Integer> myIntList = new LinkedList<Integer>();

    	myIntList.add(0); 
    	//myIntList.add("oops");
        Integer x = (Integer) myIntList.iterator().next();
        System.out.println(x);
    }
}

