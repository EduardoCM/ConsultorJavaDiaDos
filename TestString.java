


public class TestString {


private static final int MAXIMO_CLIENTES = 1_000_000;


public static void main(String args[]){

String nombre = args[0];
String apellido = args[1];
String apellidoDos = args[2];


StringBuilder registroArchivo = new StringBuilder(" ");

System.out.println("::::: Inicio ejecucion :::");
for (int i = 0; i < MAXIMO_CLIENTES; i++){
     registroArchivo.append(nombre) 
     .append(",").append(apellido).append(",")
     .append(apellidoDos);
}
System.out.println("::::: FInalizo ejecucion :::");
System.out.println(registroArchivo);




}	



}