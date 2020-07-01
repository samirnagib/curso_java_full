package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		boolean resp;
		resp = true;
		List<String> nomes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (resp = true) {
			System.out.println("Digite um nome: ");
			nomes.add(sc.nextLine());
			System.out.println("Continua a cadastrar? <Y/N> :");
			String x = sc.nextLine(); 
			if ( x.equals("N") ) {
				resp = false;
				}
			}
		
		for (String nome : nomes ) {
			System.out.println(nome);
		}
		
		sc.close();
	}

}
