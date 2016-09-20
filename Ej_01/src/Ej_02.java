import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ej_02 {
	

		static final String DATA_PATH ="datos.txt";
		
		
		public static void main(String[] args){
			Scanner fileReader= null;
			try{
				fileReader = new Scanner(new File (DATA_PATH));
				System.out.println("Archivo abierto:"+fileReader);
				
				
			}catch(FileNotFoundException e){
				System.out.println("El archivo"+DATA_PATH + "No se encuetra!!!");
				System.out.println("Programa terminado");
				System.exit(0);
			}
			
			int contador =1;
			int datoLeido = fileReader.nextInt();
			System.out.println("Palas cargadoras 78345");
			while(datoLeido==78345){
				datoLeido=fileReader.nextInt();
				System.out.println(contador + " :serie"+datoLeido);
				datoLeido=fileReader.nextInt();
				contador++;
				
			
			 
			if(datoLeido==33278){
				System.out.println("Retroexcabadoras 33278");
				while(datoLeido==33278){
					datoLeido=fileReader.nextInt();
					System.out.println(contador + " :serie"+datoLeido);
					datoLeido=fileReader.nextInt();
					contador++;
					
					
				}if(datoLeido==63287){
					System.out.println("Dumpers 63287");
					datoLeido=fileReader.nextInt();
					System.out.println(contador + " :serie"+datoLeido);
				try{
					datoLeido=fileReader.nextInt();
			}catch(Exception e){
					System.out.println("Se ha terminado el archivo");
			}
					contador++;
				
					}
				}
			}
		}
		
}
			
				
					
			
