package sv.edu.udb.ejercicio3;
import java.util.*;

public class Ejercicio3 {
public static void main(String[] args) {
	//Declaramos 2 variables
	int num1,num2;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Ingrese el primer numero");
	num1 = in.nextInt();
	
	System.out.println("Ingrese el segundo numero");
	num2 = in.nextInt();
	
	if(num1>num2) {
		System.out.println("El primer numero es mayor que el segundo");
	}else if(num2>num1){
		System.out.println("El segundo numero es mayor que el primero");
	}else if(num1==num2) {
		System.out.println("Ambos numeros son iguales");
	}
}
}
