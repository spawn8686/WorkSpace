package com.sdz.base;

import java.util.Scanner;

public class ExerciceConvertion {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		//	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//  lien de l'exercice "https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20903-tp-convertissez-des-celsius-en-fahrenheit"
		//  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		/*
		 * Exercice de conversion de temp�rature
		 * de Farenheit � Celsius
		 * de Celsius � Farenheit
		 * */
		// Cr�ation des variables
		Scanner scan = new Scanner(System.in);
		double value = 0;
		int choix;
		char boucle;
		double result = 0;
		
		// Affichage de d�but programme
		System.out.println("CONVERTISSEUR DEGR�S CELSIUS ET DEGR�S FAHRENHEIT");
		System.out.println("-------------------------------------------------");
		
		// Choix du mode de convertion
		do
		{
			System.out.println("\nChoisissez le mode de convertion :");
			System.out.println("1 - Convertisseur Celsius vers Fahrenheit");
			System.out.println("2 - Convertisseur Fahrenheit vers Celsius");
			choix = scan.nextInt();
			
			// Controle du choix de convertion
			while(choix != 1 && choix != 2)
			{
				System.out.println("Choix non valide, veuillez choisir entre 1 ou 2!");
				choix = scan.nextInt();
				scan.nextLine();
			}
			
			// si convertion vers Fahrenheit
			if (choix == 1) 
			{
				System.out.println("Veuillez indiquer les degr�s Celsius : ");
				value = scan.nextDouble();
				scan.nextLine();
				result = arrondi(((9.0/5.0)*value)+32.0, 2);
				System.out.println(value+" �C correspond � "+result+" �F");
			}else // Si convertion vers Celsius
			{
				System.out.println("Veuillez indiquer les degr�s Fahrenheit : ");
				value = scan.nextDouble();
				scan.nextLine();
				result = arrondi((value-32.0)*5.0/9.0, 2);
				System.out.println(value+" �F correspond � "+result+" �C");
			}
			
			// demande pour une nouvelle convertion
			boucle = ' ';
			while(boucle != 'o' && boucle != 'n')
			{	
				System.out.println("Souhaitez-vous convertir une nouvelle temp�rature?  (o/n)");
				boucle = scan.nextLine().charAt(0);
			}
			// Message de sorti de boucle si "boucle" = 'n'
			if(boucle == 'n')
				System.out.println("Merci et � bient�t!");
			// Re-boucle si "boucle" = 'o'
		}while(boucle == 'o');
				
	}
	
	public static double arrondi(double A, int B) 
	{
		return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}
