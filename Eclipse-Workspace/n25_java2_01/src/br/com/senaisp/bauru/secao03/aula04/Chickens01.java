package br.com.senaisp.bauru.secao03.aula04;

public class Chickens01 {

	public static void main(String[] args) {
		int totalEggs = 0;
		int eggsPerChicken = 5, chickenCount = 3;
		
		//dia 1
		totalEggs += eggsPerChicken * chickenCount;
		
		//dia 2
		chickenCount++;  //ganhou uma galinha
		totalEggs += eggsPerChicken * chickenCount;
		
		// dia 3 
		chickenCount/=2;  //animal come metade das galinhas
		totalEggs += eggsPerChicken * chickenCount;
		//imprimir o total
		System.out.println(totalEggs);
		
	}

}
