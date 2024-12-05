package lacosrepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		float numero = 0;
		float negativos = 0;
		float positivos = 0;
		float resultado = 0;
		float somaPositivos = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do { 
            System.out.println("\nDigite um número ou '0' para finalizar: ");
            numero = leia.nextFloat();       
                
                if(numero > 0){
                	somaPositivos += numero;
                	positivos++;
                }else {
                	negativos++;
                }
                
        } while (numero != 0);
         
        System.out.println("A soma dos números positivos é: " + somaPositivos);
        leia.close();
	}		
}