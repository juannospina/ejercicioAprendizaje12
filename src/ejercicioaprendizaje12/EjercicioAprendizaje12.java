/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicioaprendizaje12;

import java.util.Scanner;

public class EjercicioAprendizaje12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa una cadena máximo de 5 caracteres: ");
        String cadena = entrada.nextLine();
        String FDE = "&&&&&";
        int correctas = 0;
        int incorrectas = 0;
        
        while(!cadena.equals(FDE)){
            if((cadena.length()<=5) && (cadena.substring(0,1).equals("X")) && (cadena.substring(cadena.length()-1).equals("O"))){
                System.out.print("Ingresa otra cadena de máximo 5 caracteres: ");
                cadena = entrada.nextLine();
                correctas++;                
            }else{
                System.out.print("Ingresa otra aa cadena de máximo 5 caracteres: ");
                cadena = entrada.nextLine();
                incorrectas++;
            }
        }
        System.out.println("");
        System.out.println("Has marcado la secuencia especial que indica el final de envío de cadenas. Resultados:");
        System.out.println("Lecturas correctas: "+correctas);
        System.out.println("Lecturas incorrectas "+incorrectas);
    }       
}
  

