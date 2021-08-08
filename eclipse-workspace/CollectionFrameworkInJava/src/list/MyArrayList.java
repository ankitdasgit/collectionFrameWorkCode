package list;

import java.util.ArrayList;
import java.util.List;


public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList <String> fruits= new ArrayList();

		List<String> veg= new ArrayList();
		//add veg element
		veg.add("tomato");
		veg.add("potato");
		System.out.println(veg);
		
		//add fruits elements
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		System.out.println(fruits);
		
		//add veg in fruits
		fruits.addAll(veg);
		System.out.println(fruits);
		
		//get veg element index 1
		 System.out.println(veg.get(1 ));

		//set mango on 0 index apple to mango
 	    fruits.set(0, "mango");
		 System.out.println(fruits);
		
		//remove index 2 element from fruits
		 fruits.remove(2);
		 System.out.println(fruits);
		 
		 //clear all element from fruits
		fruits.clear();
		System.out.println(fruits);

		//made a new list and remove specific element from the list
		List<String> toRemove= new ArrayList();
		toRemove.add("apple");
		toRemove.add("mango");
		fruits.removeAll(toRemove);
		System.out.println(fruits);
		
		//made 
		List<String> toRemoveVeg = new ArrayList();
		toRemoveVeg.add("potato");
		toRemoveVeg.add("tomato");
		veg.removeAll(toRemoveVeg);
		System.out.println(veg);
		
		
//		System.out.println(fruits.size() );
//		
//		System.out.println(fruits.contains("gauva"));
//	
//		System.out.println(fruits.isEmpty());
		
//		String tem[]=new String[fruits.size()];
//		fruits.toArray(tem);
//		for(String e: tem)
//		{
//			System.out.println(e);
//		}
		
//	PairGenerics<String ,Integer> p1= new PairGenerics("ankit",14);
//	PairGenerics<Boolean,String> p2 =new PairGenerics(true,"das");
//     
//	p1.des();
//	p2.des();
//	
	}
	

}
