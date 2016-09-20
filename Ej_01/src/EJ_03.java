
public class EJ_03 {
	
	public static void main(String[] args) {
        String[] nombre=new String [10];// Declaracion de arreglo timpo String para saber el nombre de los empleados   que gana mas segun su horas trabajadas 
        String nombreMayor = null;// Variable que almaceara el Nombre con mayor horas trabajadas 
        String nombreMenor = null;// Variable que almacena el nombre de empleados con menor horas 
        int trabajadores;// varable que almacena 
        double mayor=0;
        String []nompro=new String [10];
        double menor=1000222;
        double [] hora=new double[10];
        String  categoria = null;
        double [] sueldo=new double[10];
        
        double horaMaxi=0;
        String nomHoraMaxi = null;
         double  horasMin=5000;
        String nomHoraMin = null;
        
        double p = 0;
         java.util.Scanner leer = new java.util.Scanner(System.in);
         int i;
        for ( i = 0; i < 2; i++) {
           System.out.println("Ingrese el nombre del empleado  ");
	     nombre[i]=leer.next();
             System.out.println("Ingrese la categoria ");
             categoria=leer.next();
             System.out.println("Ingrese las horas del empleado ");
             hora[i]=leer.nextDouble();
             
             if(categoria.equalsIgnoreCase("A")){
                 sueldo[i]=hora[i]*150;
             }
             if(categoria.equalsIgnoreCase("B")){
                  sueldo[i]=hora[i]*250;
             }
             if(categoria.equalsIgnoreCase("C")){
                  sueldo[i]=hora[i]*500;
             }
             
             if(sueldo[i]>=mayor){
                 mayor=sueldo[i];
                 nombreMayor=nombre[i];
             }
             if(sueldo[i]<=menor){
                 menor=sueldo[i];
                 nombreMenor=nombre[i];
             }
             if(hora[i]>=horaMaxi){
                 horaMaxi=hora[i];
                 nomHoraMaxi=nombre[i];
             }
             if(hora[i]<=horasMin){
                 horasMin=hora[i];
                 nomHoraMin=nombre[i];
             }
             
            p=p+sueldo[i];
            nompro=nombre;
        }
        double promedio=p/i;
        String nomPromedioMayor=null,nomProMenor=null;
        
        for (int j = 0; j < 2; j++) {
            if(sueldo[j]>=promedio){
                nomPromedioMayor=nompro[j];
            }
             if(sueldo[j]<promedio){
                nomProMenor=nompro[j];
            }
            
        }
      
        System.out.println("El sueldo mayor es "+mayor +"del empleado "+nombreMayor);
        System.out.println("El sueldo menor es "+menor+"del empleado  "+nombreMenor);
        System.out.println("El promedio del sueldo por semana  es "+promedio);
        System.out.println("El nombre del empleado con mas horas trabajadas es "+nomHoraMaxi +" las horas son "+ horaMaxi);
        System.out.println("El nombre del empleado con menos horas trabajadas es "+nomHoraMin+"  y las horas son  "+ horasMin);
        System.out.println("Nombre del empleado que gana igual o mas que el promedio es "+ nomPromedioMayor);
        System.out.println("Nombre del empleado que gana menos que el promedio por semana  es "+nomProMenor);
       
    }
    
}