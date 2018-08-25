
import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String args[]){

		float bonoPuntualidad = 234.43f;
		float bonoSalirTarde  = 450.23f;

		BigDecimal bono1 = new BigDecimal("234.43");
		BigDecimal bono2 = bono1.add(new BigDecimal("450.23"));

		System.out.println("Total Bono del mes: " + (bonoPuntualidad + bonoSalirTarde));
		System.out.println("Total Bono del mes: " + bono2);


	}

	


}