package camadaCollectionSet;

import java.util.Scanner;
import java.util.*;

public class exercicio2CollectionSet {

	public static void main(String[] args) {
		
Set<Integer> numeros = new HashSet<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
        
		Scanner leia = new Scanner (System.in);
        System.out.print("Digite o número que você deseja encontrar: ");
        int numero = leia.nextInt();
        
        if (numeros.contains(numero)) {
            System.out.printf("Número %02d Encontrado!%n", numero);
        } else {
            System.out.printf("O número %02d não foi encontrado!%n", numero);
        }
	}

}
