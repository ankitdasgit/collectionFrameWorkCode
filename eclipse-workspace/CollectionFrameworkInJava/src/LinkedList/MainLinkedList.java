package LinkedList;
import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		// made a new list
		List<Integer> ll= new LinkedList<>();
		//add element
		ll.add(23);
		ll.add(79);
		ll.add(12);
		System.out.println(ll);
		//made a new second list
		List <Integer> lb=new  LinkedList<>();
		//add elements
		lb.add(45);
		lb.add(455);
		lb.add(122);
		System.out.println(lb);
		//add all elements
		ll.addAll(lb);
		System.out.println(ll);
		
		//get 1 element from index
		System.out.println(lb.get(1));
		
	     //set element index
		lb.set(2,54);
	    System.out.println(lb);
	    
	    //remove element from given index
	    lb.remove(0);
	    System.out.println(lb);
	    
	    //clear element from list
	    lb.clear();
	    System.out.println(lb);
	    
	   // removeAll function (specific element can remove from list)
	    List<Integer> toRemove= new LinkedList<>();
	     toRemove.add(45);
	     toRemove.add(54);
	     lb.removeAll(toRemove);
	     System.out.println(lb);
	     
	   //find size of lb
	     System.out.println(lb.size());
	     
	     
	     //contains present or not
	     System.out.println(lb.contains(45));
	     
	     //isEmpty or not
	     System.out.println(lb.isEmpty());
	     
	     //toArray (convert into array)
	     int temp[]=new int[ll.size()];
	     ll.toArray();
	     for(int e: temp) {
	    	 System.out.print(e);
	     }
	   
	}
}
