package qsp;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> a1 = new ArrayList<>();
    a1.add(10);
    a1.add(20);
    a1.add(30);
    a1.add(40);
    System.out.println(a1.size());
             ListIterator<Integer>  i1 = a1.listIterator();
             while(i1.hasNext())
             {
            	 System.out.println(i1.next());
            	
             }
	}

}
