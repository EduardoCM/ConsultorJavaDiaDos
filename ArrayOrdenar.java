import java.util.*;

public class ArrayOrdenar {

	public static void main(String[] args){
		List<Integer> delegaciones = new ArrayList<Integer>();
		delegaciones.add(12);
		delegaciones.add(20);
		delegaciones.add(1);
		delegaciones.add(30);

		System.out.println("Sin ordenar: " + delegaciones);
		Collections.sort(delegaciones);
		System.out.println("Ordenadas: " + delegaciones);



	}

}