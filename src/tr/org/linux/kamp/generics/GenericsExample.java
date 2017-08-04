package tr.org.linux.kamp.generics;
import java.util.List;

public class GenericsExample<T> {
	//ben buraya bir harfı koyuyorum sen buna istediğin şekilde paslayabilirsin demektir  <T>
	
		T t;
		
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public static void main(String[] args) {
		
		GenericsExample<String> genericsExample = new GenericsExample<>();

	}
}
/*bir sınıfın içinde iki sinif tanımlandığında hem C sınıfının sağ kolundaki C sınıfına sol kolundaki B sınıfına 
 * ulaşabiliyoruz ulaştığımız claslarda subclass oluyor.
 * 
 * public class A extends B{   B Anın inner klası
 * public class C extends D{ D Cnın inner klası  } }
 *    Bir class içinde inner class kullanabiliyormuşuz
 *    sinif içindeki sinifa ulaşmak için dışındaki parent sınıfı nu-okta içindeki 
 *    child sınıfı diye tanımlamamız gerekiyor
 *    multiple olduğu durumda en sonki klasa erişeblirıs sırayla nokla koyarak
 *  */ 
 