package tr.org.linux.kamp.genericarraylist;

import java.util.Iterator;
import java.util.List;

public class ArrayListImpTest{
	
	public static void main(String[] args) {
		
		ArrayListImp<String> list2 =new ArrayListImp<String>();
		ArrayListImp<String> list =new ArrayListImp<String>();
		
		
		list.addItem("JAVA Programming");
		list.addItem("Linux Summer Camp");
		list.addItem("Free Software");
		list.addItem("GNU Linux");
		list2.addItem("Merlin");
		list2.addItem("Karlo");
		list2.addItem("Santo");
        list.set(1, "Linux Summer camp 2017");
		
		System.out.println(list.get(0));
		System.out.println(list.checkItem("Java"));
		System.out.println(list.removeItem("JAVA Programming"));
		System.out.println("Reverse : " + list.getReverse(list));
		list.addAll(list2);
		System.out.println("Add list : " + list);
		list.removeItem(0);
		System.out.println("list " + list);
        list.AddItem(1, "Monica");		
		System.out.println(list);
		list.copy(list, list2);
		System.out.println(list);
	    System.out.println(list2);
		
		System.out.println("First element List2:" + list2.getItem(0) );
		
		System.out.println("List2's Elements...");
		for (String item : list2) {
			System.out.println(item);
		}
		System.out.println("List's Element's...");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.getItem(i));
		}	
		Iterator<String> itr =list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		list.clear();
		System.out.println(list);
	}

}
