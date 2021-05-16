package relacaoVotos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContagemVotos {
	
	public static void main( String[] args ) throws Exception
    {
		Eleitores eleitores = new Eleitores();
		Votos votos = new Votos();
		Scanner ler = new Scanner( System.in );
		
		try {
			System.out.printf("Digite o número de eleitores:\n ");
			eleitores.setTotalEleitores(ler.nextInt());
			
			System.out.printf("Digite o número de votos validos:\n ");
		    votos.setValidos(ler.nextInt());

		    System.out.printf("Digite o número de votos brancos:\n ");
		    votos.setBrancos(ler.nextInt());
		      
		    System.out.printf("Digite o número de votos nulos:\n ");
		    votos.setNulos(ler.nextInt());
		} catch (InputMismatchException e) {
			System.out.println("Somente numeros inteiros!");
			throw new Exception("Somente numeros inteiros!");
		}
        
        percentualVotosValidos(votos.getValidos(),eleitores.getTotalEleitores());
        percentualVotosBrancos(votos.getBrancos(),eleitores.getTotalEleitores());
        percentualVotosNulos(votos.getNulos(),eleitores.getTotalEleitores());
    }
	
//	Percentual de votos validos em relacao aos eleitores
	public static void percentualVotosValidos(double validos, double eleitores) {
		double totalValidos = (validos/eleitores);
		System.out.println("O percentual de votos válidos é: "+ totalValidos*100 + "%");
		
	}
//	Percentual de votos brancos em relacao aos eleitores
	public static void percentualVotosBrancos(double brancos, double eleitores) {
		double totalBrancos = brancos/eleitores;
		System.out.println("O percentual de votos brancos é: "+ totalBrancos*100 + "%");
		
	}
//	Percentual de votos nulos em relacao aos eleitores
	public static void percentualVotosNulos(double nulos, double eleitores) {
		double totalNulos = nulos/eleitores;
		System.out.println("O percentual de votos nulos é: "+ totalNulos*100 + "%");
	
	}
	
	
}
