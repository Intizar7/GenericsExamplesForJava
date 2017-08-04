package tr.org.linux.kamp.generics;

public class B {
	public static void main(String[] args) {
		A object = new A();
		A.Y.N.L a= new A().new Y().new N().new L();
		a.setX(123);
		System.out.println(a.getX());
	}
	/*Arrayleri tanımlarken sınır belirtmek zorundayız bide tip belirtmek zorundayız
	  *
	  *
	  */
}
