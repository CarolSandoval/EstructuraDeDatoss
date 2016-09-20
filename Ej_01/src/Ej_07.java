import java.util.Scanner;
/**
 * Ana Carolina Padron Sandoval
 * @author Usuario General 
 * Escribir un método recursivo para transformar un número entero (menor a diez mil) en una cadena los dígitos de que consta: String entroCadena(int n).
    Ejemplo: entra 1989  imprime: uno nueve ocho nueve
    GSI1241

 */

public class Ej_07 {

	static String letras=" ";
	static int i=0;
	
	public static String entradaCadena(int n){
		String numerico = String.valueOf(n);
		char entrada = numerico.charAt(i);
		
		switch(entrada){
		case '0':
			
			letras= letras +"Cero";
			break;
		case '1':
			letras = letras+ "Uno";
			break;
		case '2':
			letras = letras+ "Dos";
			break;
		case '3':
			letras = letras+ "Tres";
			break;
		case '4':
			letras = letras+ "Cuatro";
			break;
		case '5':
			letras = letras+ "Cinco";
			break;
		case '6':
			letras = letras+ "Seis";
			break;
		case '7':
			letras = letras+ "Siete";
			break;
		case '8':
			letras = letras+ "Ocho";
			break;
		case '9':
			letras = letras+ "Nueve";
			break;
			
		}
		i++;
		if(i<numerico.length()){
			Ej_07.entradaCadena(n);
			
		}
		
		return letras.toLowerCase();
	}
	
	public static void main(String[]args){
		Scanner teclado= new Scanner(System.in);
		System.out.print("Ingresa un numero entre 1 y 9999");
		int numerico = teclado.nextInt();
	
	
	//String cadena = entradaCdena(numero)
	if(numerico > 0 && numerico <10000){
		Ej_07 objeto = new Ej_07();
		objeto.entradaCadena(numerico);
		System.out.print(letras);
	}else{
	System.out.println("El numero es invalido");
	}
		
		
	}
	

}
