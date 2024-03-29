package com.sdz.base;

import java.util.Scanner;

public class Tableaux {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) 
	{
		//	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//  lien de l'exercice "https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20998-creez-des-tableaux"
		//  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		/*
		 * Cr�ation de diff�rents types de variables tableaux
		 * */
		int valueEntier[] = {0,1,2,3,4,5,6,7,8,9};
		double valueDouble[] = {0.0,1.0,2.0,3.0,4.0};
		char valueChar[] = {'a','b','c','d','e','f','g','h'};
		String valueString[] = {"mot1","mot2","mot3","mot4"};
		
		/*
		 * Tableau multidimensionnels
		 * */
		int valueIntMulti[][] = {{0,2,4,6,8,10,12,14,16,18},{1,3,5,7,9,11,13,15,17,19}};
		
		/*
		 * Affichage des donn�es d'une tableau grace � l'instruction length
		 * */
		int entier[] = {1,2,3,4,5,6,7,8,9,0};
		
		for(int b = 0 ; b < entier.length ; b++)
			System.out.println("la valeur de entier["+b+"] = "+entier[b]);
		
		/*
		 * Effectuer une recherche dans un tableau simple de type char
		 * Ici, le candidat doit indiquer une lettre au hasard
		 * puis, on devra d�terminer si cette lettre est pr�sente dans le tableau et � quelle position
		 * */
		Scanner scan = new Scanner(System.in);		
		char boucle = ' ';
		char value =' ';		
		
		do
		{
			int j = 0;
			// r�cup�ration du caract�re al�atoire
			System.out.println("Indiquez une lettre minuscule, SVP :");
			value = scan.nextLine().charAt(0);
			
			// Analyse si le caract�re existe et � quelle position
			while(j < valueChar.length && value != valueChar[j])
				j++;
			
			// si le caract�re existe
			if (j < valueChar.length) 
			{
				System.out.println("le caract�re '"+value+"' choisi existe � la position valueChar["+j+"]!");
			}else // sinon
				System.out.println("le caract�re '"+value+"' n'existe pas dans le tableau!");
			
			// le candidat veut-il essayer de nouveau
			do
			{
				System.out.println("Voulez-vous essayer de nouveau?  (o/n)");
				boucle = scan.nextLine().charAt(0);
			}while(boucle != 'o' && boucle != 'n'); // s'assurer que la r�ponse soit g�rer
			
			if(boucle == 'n')
				System.out.println("Merci et bonne journ�e!\n");
				
		}while(boucle == 'o');	
		
		/*
		 * Effectuer une recherche dans un tableau simple multidimensionnel de type int
		 * Ici, il suffira d'afficher sur la premi�re ligne, les nombres paire de la premi�re colonne du tableau
		 * et sur la deuxi�me ligne les nombres impaires de la deuxi�me colonne
		 * */
		int i = 0, j = 0;
		while (i < valueIntMulti.length) 
		{
			j = 0;
			while(j < valueIntMulti[i].length)
			{
				System.out.print(valueIntMulti[i][j]+"-");
				j++;
			}
			System.out.println("");
			i++;
		}
		System.out.println("");
		// Idem avec une boucle for
		for (i = 0; i < valueIntMulti.length; i++) 
		{
			for(j = 0; j < valueIntMulti[i].length; j++)
			{
				System.out.print(valueIntMulti[i][j]+"-");				
			}
			System.out.println("");
		}
		System.out.println("");
		//Avec une syntaxe cette fois diff�rente de la boucle for
		// for(String str : tab)
		//� chaque tour de la boucle, la valeur courante du tableau tab, sera affect� � la variable str
		//la variable str et tableau doivent IMP�RATIVEMENT �tre de m�me type
		String tab[][] = {{"titi","tata","toto","tutu","tete"},{"1","2","3","4","5"}};
		i = 0;
		for(String temp[] : tab)
		{
			j = 0;
			for(String str : temp)
			{
				System.out.println("str = "+str+" / tab["+i+"]["+j+"] = "+tab[i][j]);
				j++;
			}
			i++;
		}
		System.out.println("");
	}
}
