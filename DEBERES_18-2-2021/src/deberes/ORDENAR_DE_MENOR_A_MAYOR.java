package deberes;
//IMPORTAR LA LIBRERIRA
import java.util.Scanner;

/**
 *
 * @author RICHARD
 */
public class ORDENAR_DE_MENOR_A_MAYOR {

    public static void main(String[] args) {
        int A,B,C; //DECLARAMOS LAS VARIABLES DE TIPO ENTERO 
        //CLASE SCANNER PARA PODER INGRESAR LOS DATOS POR TECLADO EN LA EJECUCION 
        Scanner teclado = new Scanner(System.in);
        //SYSTEM.OUT.PRINTLN NOS AYUDA A IMPRIMIR LOS DATOS EN PANTALLA
        System.out.println("INGRESE EL PRIMER NUMERO A ORDENAR");
        A=teclado.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO A ORDENAR");
        B=teclado.nextInt();
        System.out.println("INGRESE EL TERCER NUMERO A ORDENAR");
        C=teclado.nextInt();
        
        System.out.println("LOS NUMEROS ORDENADOS DE MENOR A MAYOR SON: ");
        //SI A ES MENOR O IGUAL QUE B Y B MENOR O IGUAL QUE C
        if (A<=B && B<=C)
        {
            //IMPRIMIR EN ESTE ORDERN 
            System.out.println(" "+A+" "+B+" "+C+" ");   
        }
        else if (A<=C && C<=B) //DE LO CONTRAIO SI A ES MENOR O IGUAL QUE C Y C ES MENOR O IGUAL QUE B
        {
            //IMPRIMIR EN ESTE ORDEN 
            System.out.println(" "+A+" "+C+" "+B+" ");
        }
        //COMPARAMOS LOS DATOS PARA LOS DEMAS CASOS
        else if (B<=A && A<=C)
        {
            System.out.println(" "+B+" "+A+" "+C+" ");
        }
        else if (B<=C && C<=A)
        {
            System.out.println(" "+B+" "+C+" "+A+" ");
        }
        else if (C<=A && A<=B)
        {
            System.out.println(" "+C+" "+A+" "+B+" ");
        }
        else
        {
            System.out.println(" "+C+" "+B+" "+A+" ");
        }
}
}