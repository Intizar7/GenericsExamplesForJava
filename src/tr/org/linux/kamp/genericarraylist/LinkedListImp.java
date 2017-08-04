package tr.org.linux.kamp.genericarraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
public class LinkedListImp {
	
	public static void main(String[] args) {
		
		 LinkedList<String> colors =new LinkedList<>();
		 
		 colors.add("Turuncu");
		 colors.add("Sarı");
		 colors.add("Siyah");
		 colors.add("Mavi");
		 colors.add("pembe");
		 colors.add(1,"Kırmızı");
		 colors.set(2,"yeşil");
		 
		 System.out.println("Silmeden Önce Liste:");
		 
		 colors.remove(3);
		 
		 System.out.println(colors);
		 
		 colors.remove(2);
		 System.out.println(colors);
		 System.out.println(colors.contains("Sarı"));
		 System.out.println("Ilk eleman:"+colors.getFirst());
		 System.out.println("3.eleman:"+colors.get(2));
		 System.out.println("Son eleman:"+colors.getLast());
		 System.out.println("Listenin uzunlugu:"+colors.size());
		 
		 System.out.println("Foreach kullanımı:");
		 for (String item : colors) {
			System.out.println(item);
		}
		 Iterator<String> itr = colors.descendingIterator();
		 while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		 ArrayList<String> removeColors=new ArrayList<>();
		 removeColors.add("Siyah");
		 removeColors.add("Turuncu");
		 colors.removeAll(removeColors);
		 System.out.println("Liste silmeden sonra"+colors);
		 colors.clear();
	}
}
