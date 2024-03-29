package com.sdz.base;

public class Conditions 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// lien de l'exercice "https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20757-definissez-des-conditions"
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		/*
		 * Cr�ation d'une variable int et affectation du valeur al�atoire
		 * cr�ation d'un test conditionnel, afin de d�terminer si la variable et "positif, nul, n�gative"
		 * */
		int i = 0;
		if (i<0) 
		{
			System.out.println("La valeur est n�gative!");
		} else 
		{
			if (i==0) 
			{
				System.out.println("La valeur est nul!");
			} else 
			{
				System.out.println("La valeur est positive!");
			}			
		}
		/*
		 * M�me exercice que pr�c�dent, mais simplifi� avec la condition else if
		 * */
		if (i<0) 
			System.out.println("La valeur est n�gative!");
		else if (i>0)
			System.out.println("La valeur est positive!");
		else
			System.out.println("La valeur est nul!");
		
		/*
		 * Test conditionnel multiple, afin de tester si notre valeur EST COMPRISE entre 2 autres
		 * "j" doit ce situer entre 50 et 100, 50 et 100 compris
		 * */
		int j = 60;
		if(j>=50 && j<=100)
			System.out.println("j est bien compris entre 50 et 100");
		else if (j<50)
			System.out.println("j est plus petit que 50");
		else
			System.out.println("j est plus grand que 100");
		
		/*
		 * Test conditionnel multiple, afin de test si notre valeur est plus petite que 100 OU plus grande que 100
		 * */
		int k = 101;
		if(k<100)
			System.out.println("k est plus petit que 100");
		else if(k>100)
			System.out.println("k est plus grand que 100");
		else
			System.out.println("k vaut 100");
		
		/*
		 * Test conditionnel grace � la m�thode switch
		 * nous nous baserons sur une notation sur 20
		 * 0 = � revoir
		 * 10 = les base sont acquise mais � perfectionner
		 * 20 = le sujet est ma�tris�
		 * d�faut = valeur quelconque
		 * */
		int l = 20;
		switch (l) 
		{
		case 0:
			System.out.println("� revoir");
			break;
		case 10:
			System.out.println("� perfectionner");
			break;
		case 20:
			System.out.println("bien jou�");
			break;
		default:
			System.out.println("continue le cours, tu vas y arriver");
		}
			
		/*
		 * Le switch peut �galement tester les objets de type String
		 * Exemple
		 * */
		String str = "Bonjour";
		switch (str) 
		{
		case "Bonjour":
			System.out.println("Bonjour Monsieur");
			break;
		case "Bonsoir":
			System.out.println("Bonsoir Monsieur");
			break;
		default:
			System.out.println("Bonjoir.. :P");
		}
		
		/*
		 * Op�rateur Ternaire "?"
		 * "max" vaut la plus grande des variables
		 * si l'op�ration (x < y) est true, "?" renvoie y, sinon x
		 * */
		int x = 10, y = 20;
		int max = (x < y) ? y : x;
	}
}












