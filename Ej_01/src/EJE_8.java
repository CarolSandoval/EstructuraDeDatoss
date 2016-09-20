
public class EJE_8 {
	/** Ana Carolina Padron Sandoval
	 * El elemento mayor de un array entero 
	 * de n-elementos se puede calcular recursivamente.
	 * GSI1241
	 * 
	 */
	

   static int [] datos={17,22,77,9,8};
    int i=0;
     static int mayor =datos[0];
   
   public void datomay(int arreglo[]){
         
          if(i<datos.length){
       if(arreglo[i]>mayor){
               mayor=arreglo[i];
           }
       i++;
              datomay(arreglo);
       
          }
   }
}


