package com.sdz.animal;

abstract class Animal // Classe Abstraite m�re
{
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//										VARIABLES
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		protected int poids = 0;
		protected String couleur = "";
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//										CONSTRUCTEURS
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		protected Animal()
		{
			System.out.println("je n'ai pu que l'entendre, je ne connais donc ni sa couleur, ni sa taille");
		}
		protected Animal(String couleur, int poids)
		{
			this.couleur = couleur;
			this.poids = poids;
			System.out.println("Cr�ation d'un nouveau "+this.getClass().getSimpleName()+" "
								+this.couleur+" de "+this.poids+" kg !");
		}
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//										METHODES
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//D�fini
		protected void manger()
		{
			System.out.println("Je mange de la viande");
		}
		protected void boire()
		{
			System.out.println("Je bois de l'eau");
		}
		public String toString()
		{
			String str = "";
			
			if (this.couleur.isEmpty()) 
			{
				str = "Je suis un objet de la class \'"+this.getClass().getSimpleName()+
						"\', mais on ne connait ni ma couleur, ni mon poids !";
			}else
			{
			str = "Je suis un objet de la class \'"+this.getClass().getSimpleName()+
					"\' de couleur \'"+this.couleur+
					"\' et p�se \'"+this.poids+" kg\'";
			}
			
			return str;
		}
		
		//Abstraite
		abstract void deplacement();
		abstract void crier();
}

































