package org.tnsif.annotations;
import java.util.Set;
import java.util.TreeSet;
public class SuppressWarningExample {
	
	@SuppressWarnings("unchcecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set s=new TreeSet();
		s.add(12);
		s.add(72);
		s.add("Manish");
		System.out.println(s);
		
	}

}
