package camadaCollectionSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.*;
public class exercicio1CollectionSet {

	public static void main(String[] args) {
		
		
		int value;
		Integer element;
		
		Set<Integer> integerSet = new HashSet<>();
        Scanner leia = new Scanner(System.in);
        

        System.out.println("Digite 10 valores inteiros não repetidos:");

        for (int i = 0; i < 10; i++) {
            value = leia.nextInt();
            integerSet.add(value);
        }

        System.out.println("Listar dados do Set:");

        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
             element = iterator.next();
            System.out.println(element);
        }
	}

}
