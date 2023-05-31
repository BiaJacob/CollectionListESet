package camadaCollectionList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class exercicio1CollectionList {

	public static void main(String[] args) {
		
				
		ArrayList<String> cores = new ArrayList<>();
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite 5 cores:");

        for (int i = 0; i < 5; i++) {
            String cor = leia.nextLine();
            
            cores.add(cor);
        }

        
        System.out.println("Listar todas as cores: ");
        for (String cor : cores) {
            System.out.println(cor);
        }

        
        Collections.sort(cores);

        System.out.println("Ordenar as cores: ");
        for (String cor : cores) {
            System.out.println(cor);
            
        }
	}

}
