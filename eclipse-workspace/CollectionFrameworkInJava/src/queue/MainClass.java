package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Queue<Integer> q = new LinkedList<>();
         q.add(12);
	    q.add(23);
	    q.add(34);
	    q.add(44);
	    
	    System.out.println(q);
	
      	System.out.println(q.remove());
      	System.out.println(q);
      	
	    System.out.println(q.element());
	    
	    System.out.println(q.peek());
		
//		System.out.println(q.poll() );
//		System.out.println(q.peek());
	}

}
