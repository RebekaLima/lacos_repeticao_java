package lacosrepeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		float numero = 0;
		int i;
		int pares = 0;
		int impares = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(i = 1; i <=10; i++) {
			System.out.println("Digite o " + i + "º número: ");
			numero = leia.nextFloat();
		
		if (numero % 2 == 0){
			pares++;
		} else {
			impares++;
		}
		}
		
		System.out.println("O total de números pares é: " + pares);
		System.out.println("O total de números ímpares é: " + impares);
		
		leia.close();
      }
		
}
