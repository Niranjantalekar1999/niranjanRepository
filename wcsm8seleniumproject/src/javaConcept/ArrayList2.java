package javaConcept;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		System.out.println(al.isEmpty());   //true
		
		al.add("hi");
		al.add(5);
		al.add(null);
		al.add(null);
		
		System.out.println(al);  //[hi, 5, null, null]
		
		//add(index,object) is used to add the element at specified index
		
		al.add(1, "Sheela");
		al.add(0,20);
		
		System.out.println(al);  //[20, hi, Sheela, 5, null, null]
		
	}

}
