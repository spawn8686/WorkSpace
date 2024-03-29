package com.sdz.base;

import java.util.Scanner;

public class Boucles {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		//	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//  lien de l'exercice "https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20841-apprenez-a-creer-des-boucles"
		//  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		/*
		 * Cr�ation des variables et objet n�cessaires � l'exercice
		 * Cr�ation et utilisation d'une boucle "while"
		 * la condition est en premier tester, puis, si le r�sultat est true, on ex�cute la boucle
		 * La boucle ce poursuit temps que la condition while est true (test� avant chaque nouvelle boucle)
		 * */
		Scanner scan = new Scanner(System.in);
		String prenom;
		char boucle = 'o';		
		int a = 1, b = 10;
		
		while(a <= b)
		{
			System.out.println("a = "+a);
			a++;
		}
		System.out.println("\n\n\n");
		
		while (boucle == 'o') 
		{
			System.out.println("Donner un nom : ");
			prenom = scan.nextLine();
			System.out.println("Bonjour "+prenom);
			boucle = ' ';
			while (boucle !='o' && boucle != 'n') 
			{
				System.out.println("Veux-tu continuer : (o/n)");
				boucle = scan.nextLine().charAt(0);
			}	
			if(boucle == 'n')
				System.out.println("Au revoire "+prenom+"!\n\n\n");	
		}	
		
		/*
		 * Exercice cette fois bas� sur la boucle "do while"
		 * identique � la boucle while, � l'exception de 2 points
		 * - la boucle est obligatoirement ex�cut� au moin 1x, la condition n'�tant test� qu'� la fin
		 * - la boucle ce termine par un ";" apr�s la condition while
		 * */
		do 
		{
			System.out.println("Comment t'appel tu?");
			prenom = scan.nextLine();
			System.out.println("Bonjour "+prenom+", veux-tu continuer?  (o/n)");
			boucle = scan.nextLine().charAt(0);
			while (boucle != 'o' && boucle != 'n')
			{
				System.out.println("Je n'ai pas compris, veux-tu continuer?  (o/n)");
				boucle = scan.nextLine().charAt(0);
			}
			if(boucle == 'n')
				System.out.println("Aurevoire "+prenom+", � bient�t!\n\n\n");
		} while (boucle == 'o');
		
		/*
		 * Exercice cette fois bas� sur la boucle "for"
		 * Cette fois, tout ce fais dans les parenth�se de condition de la boucle
		 * - on d�clare et initialise notre variable
		 * - on la teste
		 * - on l'incr�mente
		 * */
		for (int i = 10; i >= 0; i--)
			System.out.println("Voici la ligne N� "+i);		
	}
}
























