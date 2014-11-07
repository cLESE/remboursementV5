package lepackage;

import java.util.List;
import java.util.Scanner;

public class Saisie {

	private String typeduTrajet, jour, heure;
	private int dept, dureeDepl, nbkm;

	//Accesseurs

		public String getTypeduTrajet(){
			return typeduTrajet;
		}

		public String getJour(){
			return jour;
		}
		public String getHeure(){
			return heure;
		}
		public int getDept(){
			return dept;
		}
		public int getDureeDepl(){
			return dureeDepl;
		}
		public int getNbkm(){
			return nbkm;
		}
	//Modifieurs

		public void setTypeduTrajet(String TT){
			this.typeduTrajet = TT;
		}

		public void setJour(String J){
			this.jour = J;
		}
		public void setHeure(String H){
			this.heure = H;
		}
			public void setDept(int D){
				this.dept = D;

			}
			public void setDureeDepl(int DD){
				this.dureeDepl = DD;
			}

			public void setNbkm(int NB){
				this.nbkm = NB;
			}


			public Saisie(List<AR> AR) //Methode saisie entrées
			{
				 Scanner saisies = new Scanner(System.in);
				System.out.print("Veuillez saisir le numero de departement (21 - 25 - 39 - 44 - 72 - 73 - 74 - 75 - 85 - 90 : ");
				dept = saisies.nextInt();


		        System.out.print("Veuillez saisir le type de votre déplacement (AS -- AR) : ");
		        typeduTrajet = saisies.next();

		        System.out.print("Veuillez saisir le jour de votre déplacement (S: Semaine / W: Week-end) : ");
		        jour = saisies.next();

		        System.out.print("Veuillez saisir l'heure de votre déplacement (J - Jours: < 20h -- N - Nuit: > 20h) : ");
		        heure = saisies.next();

		        System.out.print("Veuillez saisir la durée de votre déplacement en Minutes : ");
		        dureeDepl = saisies.nextInt();

		        System.out.print("Veuillez saisir le nombre de kilomètres parcourus lors de votre déplacement : ");
		        nbkm = saisies.nextInt();


			}

		}

