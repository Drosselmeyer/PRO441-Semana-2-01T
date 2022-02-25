package sv.edu.udb.ejercicio2;
import java.util.*;

public class Ejercicio2 {
public static void main(String[] args) {
	//Declarar 2 variables enteras y 2 variables float
	
	int num1,num2;
	float num3,num4;
	
	int respuesta1;
	float respuesta2;
	int sobrante;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Ingrese el primer numero entero");
	num1 = in.nextInt();

	System.out.println("Ingrese el segundo numero entero");
	num2 = in.nextInt();
	
	System.out.println("Ingrese el tercer numero flotante");
	num3 = in.nextFloat();
	
	System.out.println("Ingrese el cuarto numero flotante");
	num4 = in.nextFloat();
	
	//Divisiones enteras
	respuesta1 = num1/num2;
	sobrante = num1%num2;
	
	//Divisiones con decimales
	respuesta2 = num3/num4;
	
	
	System.out.println("La division entera es:"+respuesta1+" y sobran"+sobrante);
	System.out.println("Las divisiones decimal es:"+respuesta2);
	System.out.println("¿El primer numero es menor que el segundo?"+(num1>=num2));
}
}
