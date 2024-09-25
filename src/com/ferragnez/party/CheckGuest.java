package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	/*
	 * creare e inizializzare l’array contenente i nomi degli invitati chiedere
	 * all’utente come si chiama verificare che il nome sia presente nella lista
	 * lasciarlo entrare o rispedirlo cortesemente da dove è venuto
	 * 
	 * Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco
	 * Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel
	 * Zeilic
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] nomi = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
				"Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		
		System.out.println("Buonasera, qual'è il suo nome?");
		
		String invitato = scan.nextLine();
		
		Boolean trovato = false;
		
		for (int i = 0; i < nomi.length; i++) {
			if (invitato.equalsIgnoreCase(nomi[i])) {
				
				trovato = true;
				
				System.out.println(invitato);
				
				break;
			}

		}
		if (trovato) {
			
			System.out.println("Benvenuto/a alla festa!");
		
		} else {
			
			System.out.println("Mi dispiace non sei in lista, non ti posso far entrare!");
		
		}

	}

}
