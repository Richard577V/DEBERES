package deberes;
//IMPORTAR LA LIBRERIA
import java.util.Scanner;

/**
 *
 * @author RICHARD
 */
public class ORDEN_CONTRARIO {
    
    public static void main(String[] args) {
     //CLASE SCANNER PARA PODER INGRESAR LOS DATOS POR TECLADO EN LA EJECUCION 
     Scanner teclado = new Scanner(System.in); 
     
        System.out.println("INGRESE UN NUMERO DE 5 CIFRAS");
        //GUARDAREMOS EN UNA VARIBLE DE TIPO ENTERO VA HACER IGUAL A LO QUE SE OBTENGA LO DEL TECLADO 
        int A = teclado.nextInt();
        //RESTRICCION PARA QUE SOLO ACEPTE NUMEROS DE 5 CIFRAS
        if(A < 9999 & A < 100000){
            //CREAREMOS VARIABLES DE TIPO ENTERO 
         int a = A /1000;
         int b = A - (a*1000);
         int c = b /100;
         int d = b -(c*100);
         int e = d /10;
         int f = d -(e*10);
         //crearemos una variable donde organiza todos los resultados 
         int g = (f* 1000)+ (e * 100) + (c * 10) + a;
         
            System.out.println("ESTE ES EL RESULTADO AL REVEZ : "+g);
        } 
    }
}
