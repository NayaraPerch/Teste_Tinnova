package multiplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplos_tres_cinco {
	
	public static void main( String[] args ) throws Exception
    {
		Scanner ler = new Scanner( System.in );
		Integer resultado = 0;
		try {
			System.out.println("Digite o número: ");
			Integer numero = ler.nextInt();
			resultado = 0;
			
		    if(numero >=3) {
		    	for(int i=numero; i>=3; i--) {
		    		if(i%3 == 0 || i%5 == 0) {
		    			resultado = resultado + i;
		    		}
		    	}
		    	System.out.println("A soma dos multiplos de 3 ou 5 é: " +resultado);
		    } else {
		    	System.out.println(resultado);
		    }
		   
		} catch (InputMismatchException e) {
			System.out.println("Somente numeros inteiros!");
			throw new Exception("Somente numeros inteiros!");
		}
        
    }

}
