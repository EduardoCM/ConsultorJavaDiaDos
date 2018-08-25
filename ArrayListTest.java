
import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args){
		List<String> test = new ArrayList<String>();
		String saludo = "hi";
		test.add("Eduardo");
		test.add(saludo);
		test.add(saludo + saludo);
		
		System.out.println(test.size());
		System.out.println(test.contains("Rodrigo"));
		System.out.println(test.contains("hihi"));
		test.remove("hi");
		System.out.println(test.get(1));
		System.out.println(test.size());



	}
}








