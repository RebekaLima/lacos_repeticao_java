package lacosrepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		String i = "s";
		float idade  = 0;
		float maiores = 0;
		float menores = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while (!i.equals("n")) {
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextFloat();
			
			System.out.println("\nDeseja digitar mais uma idade?");
            System.out.println("\nDigite s para sim OU digite n para não: ");
            i = leia.next();
            
            if (idade <= 21 && idade >= 0){
    			menores++;
    		} else if (idade > 50){
    			maiores++;
    		}
    		}
    		
    		System.out.println("Total de pessoas menorse de 21 anos: " + menores);
    		System.out.println("Total de pessoas maiores de 50 anos: " + maiores);
            
		}
		
	}
	         

		
		
