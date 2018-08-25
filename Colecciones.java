
import java.util.*;
public class Colecciones {
	public static void main(String[] args) {
		List myList = new ArrayList();
		myList.add(1);
		myList.add("Hola");
		myList.add(1.8);
		myList.add(true);
		System.out.println(myList);

		for (Object obj : myList) {
			System.out.println("->  " + obj);
		}
   }

}
