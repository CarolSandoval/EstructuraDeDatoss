/**
 * 
 * @author Ana Carolina Padrón Sandoval N° 1215100248
 * UTNG SISTEMAS INFORMATICOS 
 * OBJETIVO DEL PROGRAMA: Minimo comun multiplo
 *
 */

public class Ej_05 {
	static int mcd( int uno, int dos){
		if(dos <= uno && uno % dos ==0)
			return dos;
		else if(uno<dos)
			return mcd(dos,uno);
		else 
			return mcd(dos,uno % dos);
		
	}
	public static void main (String [] args){
		System.out.println(mcd (8,12));
	}
	}


