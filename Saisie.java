package lepackage;

import java.util.Scanner;

public class Saisie {

	Scanner deptObjet = new Scanner(System.in);

	private String trajet, dateDep, heureDep;
	private int numDept, heurePar, nbKm;


	//*************   ACCESSEURS *************
	public String getTrajet()
	{
	    return trajet;
	}

	public String getDateDep()
	{
	    return dateDep;
	}

	public String getHeureDep()
	{
	    return heureDep;
	}

	public int getNumDept()
	{
	    return numDept;
	}

	public void setNumDept(int d)
	{
	    numDept = d;
	}

	public int getHeurePar()
	{
	    return heurePar;
	}

	public int getNbKm()
	{
	    return nbKm;
	}

	public Saisie(){
	System.out.println("Veuillez saisir le departement :");
	numDept = deptObjet.nextInt();

	System.out.println("Veuillez saisir le type de deplacement (AS ou AR) :");
	trajet = deptObjet.next();

	System.out.println("Veuillez saisir le jour de deplacement (S ou WE) :");
	dateDep = deptObjet.next();

	System.out.println("Veuillez saisir l'heure du deplacement (J ou N) :");
	heureDep = deptObjet.next();

	System.out.println("Veuillez saisir le temps du parcours (arrondi a  l'heure inferieure) :");
	heurePar = deptObjet.nextInt();

	System.out.println("Veuillez saisir le nb km parcouru :");
	nbKm = deptObjet.nextInt();
	}
}
