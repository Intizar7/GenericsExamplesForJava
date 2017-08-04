package tr.org.linux.kamp.genericarraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapImp {
	public static void main(String[] args) {
		HashMap<Integer,String> students=new HashMap<>();
		
		students.put(1,"Merve");
		students.put(2,"Gul");
		students.put(3,"Intizar");
		System.out.println(students);
		System.out.println("HashMap boyutu:"+students.size());
		
		for (Map.Entry item : students.entrySet()) {
			System.out.println(item.getValue()+" " + item.getKey());
		}
		for (Integer keys : students.keySet()) {
			System.out.println(keys);
		}
		for (String keys : students.values()) {
			System.out.println(keys);
		}
		Iterator<Entry<Integer, String>> itr=students.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getValue());			
		}
		students.remove(2);//index değil objeye göre işlem yapar
		System.out.println(students);
		students.clear();
		System.out.println(students);		
	}

}
