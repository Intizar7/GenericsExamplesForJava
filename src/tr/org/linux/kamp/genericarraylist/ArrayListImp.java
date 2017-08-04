package tr.org.linux.kamp.genericarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayListImp <E>extends ArrayList<E>{
	
	//ArrayList<String> stringList=new ArrayList<>();
	
	public boolean addItem(E item) {
		//1.yol
		return add(item);
		//2.yol
		/*if(stringList.add(item)) {
			return true;
		}else {
			return false;
		}*/
	}
	public boolean checkItem(E item) {
	
		return contains(item);
		
	}
	public boolean removeItem(E item) {
		return remove(item);
	}
	
	public ArrayList<E> getReverse(ArrayList<E> list) {
	Collections.reverse(list);
	return list;
	}
	public void removeItem(int index) {
		 remove(index);
	}
	public void AddItem(int index,E item) {
		 add(index,(E)item);
	}
	public void copy(ArrayList<E> list,ArrayList<E> list2) {
		Collections.copy(list,list2);	
	}
	public E getItem(int index) {
	return get(index);
	}
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return super.remove(index);
	}
	
}
