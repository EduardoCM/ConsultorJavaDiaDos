
import java.util.*;

public class SetTest {

public static void main(String args[]){
	Set<String> claveElector = new HashSet<String>();
	System.out.println(claveElector.add("ABCD123"));
	System.out.println(claveElector.add("DRF4565"));
	System.out.println(claveElector.add("AFGH787"));
	System.out.println(claveElector.add("ABCD123"));
	System.out.println(claveElector.add("DRF4565"));
	//System.out.println(claveElector);

	Set<String> nombres = new TreeSet<String>();
	nombres.add("Zenon");
	nombres.add("Adriana");
	nombres.add("Yolanda");
	nombres.add("Berenice");
	nombres.add("Yolanda");
	nombres.add("Berenice");
	System.out.println(nombres);









   }	









}