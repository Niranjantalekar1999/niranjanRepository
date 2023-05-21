package javaConcept;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add('e');
		a1.add(true);       //heterogeneous element
		a1.add("niranjan");
		a1.add("niranjan"); //Duplicate element Allowed
		
		
		a1.add(null);
		a1.add(null);          //multiple null value allowed
		System.out.println(a1);

	}

}
