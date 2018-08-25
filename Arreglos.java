


public class Arreglos {

	public static void main(String args[]){

		String  nombres [] = new String[10];
		nombres[0] = "Raul";
		nombres[1] = "Jaime";
		nombres[9] = "Ultimo nombre";

		String[] universidades = {"IPN", "UNAM", "UAM"}; 

		for(int x = 0; x < nombres.length; x++){
			System.out.println(nombres[x]);
		}

		for(String universidad: universidades){
			System.out.println("Universidad: " + universidad);
		}




	}
	


}