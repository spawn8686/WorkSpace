package com.sdz.army2.comportements;

import com.sdz.army2.interfaces.Soin;

public class PremierSoin implements Soin 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//					CLASS AVEC IMPLEMENT DE L'INTERFACE Soin
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	@Override
	public void soigne() // M�thode Polymorphe de l'interface Soin
	{
		System.out.println("Je de donnes les premiers soins!!!");
	}

}
