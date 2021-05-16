package fatorial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Fatorial {

	public static void main( String[] args ) throws Exception
    {
		Scanner ler = new Scanner( System.in );
		Integer resultado = 0;
		try {
			System.out.println("Digite o número que sera fatorado:\n ");
			Integer numero = ler.nextInt();
			List<Integer> listaNumeros = new ArrayList<Integer>();
			resultado = numero;
		    if(numero >=2) {
		    	for(int i=numero; i>=1; i--) {
		    		listaNumeros.add(i);
		    		if(i!=1) {
		    			resultado = resultado*(i-1);
		    		}
		    	}
		    	System.out.println(numero + "! = " + listaNumeros.toString().replace("," , " X") + " = " +resultado);
		    } else if(numero == 1) {
		    	resultado = 1;
		    	System.out.println(numero + "! = " +resultado);
		    }else if(numero == 0){
		    	resultado = 0;
		    	System.out.println(numero + "! = " +resultado);
		    }
		   
		} catch (InputMismatchException e) {
			System.out.println("Somente numeros inteiros!");
			throw new Exception("Somente numeros inteiros!");
		}
        
    }
	
}
