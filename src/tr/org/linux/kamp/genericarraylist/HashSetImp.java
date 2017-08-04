package tr.org.linux.kamp.genericarraylist;

import java.util.HashSet;
import java.util.ArrayList;

public class HashSetImp {
	public static void main(String[] args) {
		HashSet<Integer> numbers=new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	System.out.println(numbers);
	numbers.add(3);
	if(numbers.isEmpty()) {
		System.out.println("Set boş eleman eklemelisin");
	}
	ArrayList<Integer> fakeNumbers =new ArrayList<>();
	fakeNumbers.add(1);
	fakeNumbers.add(2);

	System.out.println("Fake numbers in"+fakeNumbers.contains(fakeNumbers));
	numbers.clear();
	}

}
