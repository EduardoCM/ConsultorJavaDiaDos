import java.util.*;

public class OrdenarArray {
	
	public static void main(String args[]){

		String [] nombres = {"Zenon", "Everardo", "Ana", "Petra"};

		for(String nombre:nombres){
			System.out.println(nombre + ", ");
		}

		Arrays.sort(nombres);

		for(String nombre:nombres){
			System.out.println(nombre, ", ");
		}




	}
}