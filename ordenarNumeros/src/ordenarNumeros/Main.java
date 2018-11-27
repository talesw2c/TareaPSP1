package ordenarNumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
        // Vamos a leer de la entrada est√°ndar del proceso y escribir
        // los datos que se reciben en la salida est√°ndar del proceso.

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader (isr);
        // Obtenemos el stream de lectura de la entrada est√°ndar
        // utilizamos un lector con Buffered, para no perder ning√∫n dato
        String lineaTeclado = null;
        
        
        try{
            System.out.println("Introduzca una serie de n˙meros separados por espacios en blancos: ");
            //Mostramos que el proceso que est√° escribiendo es el que est√°
            //leyendo los datos.
            while ((lineaTeclado = bf.readLine())!= null){

            	//Array donde almacenamos la lista de numeros separados por un espacio en blanco
                String[] listaNumeros = lineaTeclado.split(" ");
                
                //Array donde almacenaramos los numeros ya ordenados
                int[] listaOrdenada = new int[listaNumeros.length];
                
                //Se rellena el array de tipo int con todos lso n˙meros pedidos por la entrada est·ndar
                for (int i = 0; i < listaNumeros.length; i++) {
                    try {
                    	listaOrdenada[i] = Integer.parseInt(listaNumeros[i]);
                    } catch (NumberFormatException nfe) {
                       
                    }
                }
                
                //Ordenamos el array
                Arrays.sort(listaOrdenada);
                
                System.out.print("N˙meros ordenados: ");
                for (int i = 0; i < listaOrdenada.length; i++) {
                	System.out.print(listaOrdenada[i]+" ");
                	
                }
               
                
            }
        }catch(IOException ex){
            System.err.println("Se ha producido un error de E/S.");
            System.err.println(ex.toString());
        }
    }

}
