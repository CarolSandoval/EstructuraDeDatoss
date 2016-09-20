
/**
 * 
 * @author Ana Carolina Padrón Sandoval N° 1215100248
 * UTNG SISTEMAS INFORMATICOS 
 * OBJETIVO DEL PROGRAMA: Métodos de recursividad
 *
 */


public class EJ_04 {

	static int factorial (int numero){
		if(numero <=1){
			return 1;
		}else {
			return numero*factorial(numero-1);
			
		}
	}
	
	//Metodo para contar de 1..N
	static int inicial =1;
	static void cuentaHasta(int n){
		if(inicial<=n){
			System.out.println(inicial);
			inicial ++;
			cuentaHasta(n);
		}
	}
	
	//public static void main (String args []){
		//System.out.println(factorial (4));
		//cuentaHasta(5);
		
	//}
//}


//METODO PARA CONTAR DE N A 0

static void regresar (int n){
	if(n>=0){
		System.out.println(n);
		n--;
		regresar(n);
	}
}

public static void main (String args []){
	regresar(8);
	}
}


