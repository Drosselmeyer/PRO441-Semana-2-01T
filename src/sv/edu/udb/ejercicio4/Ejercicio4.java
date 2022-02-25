package sv.edu.udb.ejercicio4;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		//Solicitamos al usuario el dia de la semana en num entero
		int dia;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de dia del 1 al 7");
		dia = in.nextInt();
		
		/*if(dia ==1) {
			System.out.println("Este dia es lunes");
		}else if(dia==2) {
			System.out.println("Este dia es martes");
		}else if(dia==3) {
			System.out.println("Este dia es miercoles");
		}else if(dia==4) {
			System.out.println("Este dia es jueves");
		}else if(dia==5) {
			System.out.println("Este dia es viernes");
		}else if(dia==6) {
			System.out.println("Este dia es sabado");
		}else if(dia==7) {
			System.out.println("Este dia es domingo");
		}else {
			System.out.println("Este dia no existe, favor revisar");
		}*/
		
		switch(dia) {
		case 1: 
			System.out.println("Este dia es lunes (S)");
			break;
		case 2:
			System.out.println("Este dia es martes (S)");
			break;
		case 3:
			System.out.println("Este dia es miercoles (S)");
			break;
		case 4:
			System.out.println("Este dia es jueves (S)");
			break;
		case 5:
			System.out.println("Este dia es viernes (S)");
			break;
		case 6:
			System.out.println("Este dia es sabado (S)");
			break;
		case 7:
			System.out.println("Este dia es domingo (S)");
			break;
		default:
			System.out.println("Este dia no existe, favor revisar (S)");
			break;
		}
	}
}
