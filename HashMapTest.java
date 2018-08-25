import java.util.*;

public class HashMapTest {
	
	public static void main(String args[]){

		Map<String, String> noIneNombre = new HashMap<String, String>();

		 noIneNombre.put("ABGD123", "Raul Hernandez Suerez");
		 noIneNombre.put("GTYF656", "Miguel Castillo Noguez");
		 noIneNombre.put("FGTR876", "Berenice Miranda Hernandez");

		 System.out.println(noIneNombre);
		 System.out.println(noIneNombre.get("GTYF656"));




	}
}