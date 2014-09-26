package lepackage;
import java.util.List;

public class Calcul {
	public static double calculer(int i, List<AR> maListeAR, List<AS> maListeAS , Saisie maSaisie)
	{
		double montantRemb = 0;

		//Calcul remboursement
				//Si c'est un aller simple
				if(maSaisie.getTrajet().equals("AS")){
					//Si c'est en semaine de jour
					if(maSaisie.getDateDep().equals("S") && maSaisie.getHeureDep().equals("J")){
						montantRemb = maListeAS.get(i).getPriseEnCharge() + (maSaisie.getNbKm() * maListeAS.get(i).getTarifASJS());

						//Si le trajet dépasse 1h
						if(maSaisie.getHeurePar() > 1){
							montantRemb += montantRemb + (maSaisie.getHeurePar() * maListeAS.get(i).getHoraireJS());
						}
					}else
					//Sinon c'est de semaine de nuit ou en WE
					if((maSaisie.getDateDep().equals("S") && maSaisie.getHeureDep().equals("N")) || maSaisie.getDateDep().equals("WE")){
						montantRemb = maListeAS.get(i).getPriseEnCharge() + (maSaisie.getNbKm() * maListeAS.get(i).getTarifASNW());

						//Si le trajet dépasse 1h
						if(maSaisie.getHeurePar() > 1){
							montantRemb += montantRemb + (maSaisie.getHeurePar() * maListeAS.get(i).getHoraireNW());
						}
					}
				}else
					//Si c'est en semaine de jour
					if(maSaisie.getDateDep().equals("S") && maSaisie.getHeureDep().equals("J")){
						montantRemb = maListeAR.get(i).getPriseEnCharge() + (maSaisie.getNbKm() * maListeAR.get(i).getTarifARJS());

						//Si le trajet dépasse 1h
						if(maSaisie.getHeurePar() > 1){
							montantRemb += montantRemb + (maSaisie.getHeurePar() * maListeAR.get(i).getHoraireJS());
						}
					}else
					//Sinon c'est de semaine de nuit ou en WE
					if((maSaisie.getDateDep().equals("S") && maSaisie.getHeureDep().equals("N")) || maSaisie.getDateDep().equals("WE")){
						montantRemb = maListeAR.get(i).getPriseEnCharge() + (maSaisie.getNbKm() * maListeAR.get(i).getTarifARNW());

						//Si le trajet dépasse 1h
						if(maSaisie.getHeurePar() > 1){
							montantRemb += montantRemb + (maSaisie.getHeurePar() * maListeAR.get(i).getHoraireNW());
						}
				}

				return montantRemb;
	}
}
