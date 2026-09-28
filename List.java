package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class list {

	public static void main(String[] args) {
		
		List<Integer> num=new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(10);
		num.add(30);
		System.out.println("the list contains::"+num);
		
		System.out.println("the size of list :"+num.size());
		
		System.out.println("contains(20)::"+num.contains(20));
		
		num.remove (Integer.valueOf(10));
		System.out.println("after num.remove(Integer.valueOf(10))::");
		
		List<Integer>extra=new ArrayList<>();
		extra.add(40);
		extra.add(50);
		
		num.addAll(extra);
		System.out.println("after adding extra::"+num);
		
		System.out.println("A  is contaains All(extra)::"+num.containsAll(extra));
		
		num.removeAll(extra);
		System.out.println("after remove all extra ::"+num);
		
		System.out.println("is empty::"+num.isEmpty());
		num.clear();
		System.out.println("after clear::"+num);
		
		System.out.println("after the clear is empty::"+num.isEmpty());
		
		
		
	}

}
