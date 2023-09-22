package Listas;

public class Utilidades {
	
	public void imprimir(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
		System.out.print(vet[i] +",");	
		}
		
	}
	
	public static int[] ordenacaodecrescente(int[] vet) {    

        for (int i = 0; i < vet.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] > vet[m]) {
                    m = j;
                }
            }

           
            int temp = vet[m];
            vet[m] = vet[i];
            vet[i] = temp;
        }

        return vet;
    }	

	public int somatorio(int vet[]) {
		int soma = 0;

		for (int i = 2; i < vet.length - 2; i++) {
			soma += vet[i];
		}
		return soma;
	}

	public int somatoriocom(int vet[]) {
		int soma = 0;

		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma;
	}

	public void pares(int a, int b) {
		if (a % 2 != 0)
			a++;
		int tam = (a - b) / 2 + 1;
		int[] vet = new int[tam];
		int ind = 0;
		for (int i = a; i <= b; a++) {
			if (a % 2 == 0)
				vet[ind] = i;
			ind++;
		}

	}

	public int Media(int vet[], int vet2[]) {
		int media = 0;
		media = (somatoriocom(vet) + somatoriocom(vet2)) / (vet.length + vet2.length);

		return media;

	}

	public double Mediapon(int vet[], int vet2[]) {
		double media = 0;
		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i] * vet2[i];
		}

		media = soma / (vet.length + vet2.length);

		return media;
	}

	public int contagem(int vet[], int vet2[], int a) {
		int contagem = 0;

		for (int i = 0; i < vet.length; i++) {

			if (vet[i] == a) {
				contagem++;
			}
		}
		for (int i = 0; i < vet2.length; i++) {

			if (vet2[i] == a) {
				contagem++;
			}
		}
		return contagem;
	}

	public int[] copia(int vet[]) {
		int vet2[] = new int[vet.length];
		for (int i = 0; i < vet2.length; i++) {
			vet2[i]=vet[i];
		}

		return vet2;
	}
	
	public static int[] ordenacaoCrescente(int[] vet) {
	       

	        for (int i = 0; i < vet.length - 1; i++) {
	            int m = i;
	            for (int j = i + 1; j < vet.length; j++) {
	                if (vet[j] < vet[m]) {
	                    m = j;
	                }
	            }

	           
	            int temp = vet[m];
	            vet[m] = vet[i];
	            vet[i] = temp;
	        }

	        return vet;
	    }	

	public boolean verificar(int[] vet) {
	
		
		for (int i = 0; i < vet.length-1; i++) {
			if(vet[i]>vet[i+1]) {
				return false;
			}
		}
		return true;
	}

	public int Kmaior(int[] vet, int b) {
		int a=0;
		ordenacaoCrescente(vet);
		for (int i = 0; i < b; i++) {
			a=vet[i];
		}
		
		return a;
	}
	
	public int Kmenor(int[] vet, int b) {
		int a=0;
		ordenacaodecrescente(vet);
		for (int i = 0; i < b; i++) {
			a=vet[i];
		}
		
		return a;
	}

	public void iguais(int vet[], int[] vet2) {
		int a=0;
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet2.length; j++) {
				if(vet[i] == vet2[i]) {
					a++;
				}
			}
		}
					if(a==vet.length) 
						System.out.println("iguais");
					
					else
						System.out.println("diferentes");
	}
	
	
	
	//public int[] Busca(int[] vet, int vet2[]) {

	// int[] vet3 = null;

	// for (int i = 0; i < Menor(vet, vet2); i++)
	// for (int i1 = 0; i1 < Maior(vet, vet2); i1++) {

	// if (vet[i1] == vet2[i1]) {
	// vet3[i] = vet[i1];

	// }

	// }

	// return vet3;
	// }

	public int Maior(int vet[], int vet2[]) {
		int a = 0;
		if (vet.length < vet2.length)
			a = vet2.length;

		else
			a = vet.length;

		return a;
	}

	public int Menor(int vet[], int vet2[]) {
		int a = 0;
		if (vet.length < vet2.length)
			a = vet.length;

		else
			a = vet2.length;

		return a;
	}

	public int[] Remoção(int vet[], int a) {
		for (int i = 0; i <= vet.length; i++)
			if (vet[i] == a) {
				vet[i] = 0;
			}
		int vet2[] = new int[vet.length - 1];

		return vet2;
	}

	//public String Verificação(String P) {

	

}
