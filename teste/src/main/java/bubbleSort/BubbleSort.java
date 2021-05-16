package bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
	
	public static void main( String[] args ) throws Exception
    {
		
		Integer[] valores = {5,3,2,6,4,1,0,7};
		List<Integer> valoresII = new ArrayList<Integer>();
		int maiorDeTodos = 0;
		for(int i: valores) {
			valoresII.add(i);
		}
		int tamanho = valoresII.size()-1;
		
		for(int i=0;i<=valoresII.size()-1;i++) {
			for(int j=0;j<tamanho;j++) {
				if(valoresII.get(j+1) > maiorDeTodos) {
					maiorDeTodos = valoresII.get(j+1);
				}
				if(valoresII.get(j)>valoresII.get(j+1)) {
					int maior = valoresII.get(j);
					int menor = valoresII.get(j+1);
					valoresII.set(j,menor);
					valoresII.set(j+1, maior);
				}
				System.out.println(valoresII);

			}
			if(valoresII.get(tamanho) == maiorDeTodos) {
				tamanho--;
				maiorDeTodos = 0;
			}
		}
    }
}
