package com.sdz.base;

public class Variables 
{

	public static void main(String[] args) 
	{		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// lien de l'exercice "https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20304-installez-les-outils-de-developpement"
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		/*
		 * M�thode pour afficher du texte
		 * "print" = tout les commentaire seront affich� les uns � la suite des autres
		 * "println" = affiche le commentaire entre ("") puis ajoute un saut de ligne
		 * */
		System.out.print("Hello World !\n");
		System.out.println("My name is");
		System.out.println("\nJ�r�my.");
		
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// lien des exercices "https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20564-creez-des-variables-et-des-operateurs"
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		/*
		 * cr�ation de variables double, puis cr�ation d'une variable r�sultat int
		 * calcul des variables double, puis cast en int, et affecte la valeur dans r�sultat
		 * le r�sultat sera 1, car JAVA effectue le calcul (valeur initial 1.5) puis cast en int, donc tronquage du r�sultat
		 * */
		double nbre1 = 3, nbre2 = 2;
		int resultat1 = (int)(nbre1 / nbre2);
		System.out.println("Le r�sultat 1 est = " + resultat1);
		
		/*
		 * cr�ation de variables int, puis cr�ation d'une variables r�sultat double
		 * calcul des variables int puis cast en double
		 * le r�sultat sera 1.0, car JAVA effectu en premier le calcul (int donc tronqu�) puis le cast en double donc ajout le .0
		 * */
		int nbre3 = 3, nbre4 = 2;
		double resultat2 = (double)(nbre3/nbre4);
		System.out.println("Le r�sultat 2 est = " + resultat2);
		
		/*
		 * cr�ation de variables int, puis cr�ation d'une variables r�sultat double
		 * cast les variables int en double, effectue le calcul, puis l'affecte � la variables r�sultat
		 * le r�sultat sera 1.5, car on cast les int en double avant de les calculer, puis on affecte le r�sultat dans un double pour conserver sa valeur
		 * */
		int nbre5 = 3, nbre6 = 2;
		double resultat3 = (double)(nbre5) / (double)(nbre6);
		System.out.println("Le r�sultat 3 est = " + resultat3);
		
		/*
		 * cr�ation d'une variable int, cr�ation d'une variable String
		 * cast de la variable int en String et affecte de celle-ci dans la variable String
		 * */
		int a = 12;
		String j = new String();
		j = String.valueOf(a);
		System.out.println("'a' a �t� cast� en texte dans 'j' = "+j);
		
		/*
		 * cr�ation d'une variable int, cr�ation d'une variable String
		 * cast de la variable int en String et affecte celle-ci dans la variable String
		 * cr�ation d'une nouvelle variable int, puis nouveau cast de la variable String en int 
		* */
		int b = 12;
		String s = new String();
		s = String.valueOf(b);
		int k = Integer.valueOf(s).intValue();
		System.out.println("'b' a �t� cast� en texte dans 's' = "+s+", puis nouveau cast en int dans 'k' = "+k);		
	}
}
