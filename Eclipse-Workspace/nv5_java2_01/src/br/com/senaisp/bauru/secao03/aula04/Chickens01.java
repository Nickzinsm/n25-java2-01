package br.com.senaisp.bauru.secao03.aula04;

public class Chickens01 {

	public static void main(String[] args) {
		int totalEggs = 0;
		int eggsPerChicken = 5, chickenCount =3;
		//1° dia
		totalEggs += eggsPerChicken * chickenCount;
		//2° dia
		totalEggs += eggsPerChicken * ++chickenCount;
		//3° dia
		totalEggs += eggsPerChicken * (chickenCount/2);
		//imprimir o total de ovos		
		System.out.println(totalEggs);
	}

}
