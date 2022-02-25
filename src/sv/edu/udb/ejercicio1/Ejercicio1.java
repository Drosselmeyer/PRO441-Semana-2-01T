package sv.edu.udb.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	//Declaramos variables
	int Cantidad; //Solo puede almacenar enteros
	float Precio; //Esta variable puede almacenar
				  //valores con decimales
	
	String Nombre;
	
	float Total; //Variable para guardar el total
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Ingrese la cantidad a comprar");
	Cantidad = in.nextInt();
	
	System.out.println("Ingrese el precio del objeto");
	Precio = in.nextFloat();
	
	Total = Cantidad *  Precio;
	
	System.out.println("El precio total a pagar es: "+ Total);
}
}
